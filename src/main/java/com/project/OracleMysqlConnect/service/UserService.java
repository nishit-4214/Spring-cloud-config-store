/**
 * 
 */
package com.project.OracleMysqlConnect.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OracleMysqlConnect.DataAcess.UserDao;
import com.project.OracleMysqlConnect.Entity.User;

/**
 * @author ngupta253
 *
 */
@Service
public class UserService {

	 @Autowired
     UserDao userDao;
	 
	 public List<User> getAllUsers() {
         return this.userDao.findAll();
     }
	 
	 public User addUser(User user) {
         return this.userDao.save(user);
     }
	 
	 public void delete(int id) {
		  this.userDao.deleteById(id);
	 }
	 
	 public Optional<User> findSelected(Integer id) {
		if( this.userDao.findById(id).isPresent()){
		  return this.userDao.findById(id);
		 }
		else {
			return Optional.empty();
		}
	 }
	 //For update the row in db;
	 public User updateUser(User user){
		 return this.userDao.save(user);
	 }
	 
	//updating a record  
	 public User update(User user, int bookid)   
	 {  
		 return this.userDao.save(user);
	 }  
	 //comment for GIT
}

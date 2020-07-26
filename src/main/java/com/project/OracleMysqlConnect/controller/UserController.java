/**
 * 
 */
package com.project.OracleMysqlConnect.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.OracleMysqlConnect.Entity.User;
import com.project.OracleMysqlConnect.service.UserService;


/**
 * @author ngupta253
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
    UserService userService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
	
	@RequestMapping(value = "/adduser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public User addNewUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }
	
	@RequestMapping(value = "/test" , method = RequestMethod.GET)
	public String testService() {
		return "test service controller working app";
	}
	////Http://localhost:8082/reqParam?personId1=2001
	//@RequestParam(name="personId1", required = false, defaultValue = "nishit") String personId1
	@RequestMapping(value = "/delete" , method = RequestMethod.GET)
	public String deleteUser(@RequestParam(name="id", required = false, defaultValue = "1") Integer id) {
		 this.userService.delete(id);
		 return "deleted iteam";
		//return "test service controller working app";
	}
	
	@RequestMapping(value = "/findUserById" , method = RequestMethod.GET)
	public ResponseEntity<Optional<User>> findUserById(@RequestParam(name="id", required = false, defaultValue = " ") Integer id) {
		 if(this.userService.findSelected(id)==null) {
			 return ResponseEntity.notFound().build();	 
		 }
		 else {
			 return ResponseEntity.ok().body(this.userService.findSelected(id));
		 }
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public User update(@RequestBody User user, @RequestBody int id) {
        return this.userService.update(user, id);
    }
}

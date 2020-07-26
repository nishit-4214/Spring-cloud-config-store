/**
 * 
 */
package com.project.OracleMysqlConnect.DataAcess;

import org.springframework.stereotype.Repository;
import com.project.OracleMysqlConnect.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ngupta253
 *
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}

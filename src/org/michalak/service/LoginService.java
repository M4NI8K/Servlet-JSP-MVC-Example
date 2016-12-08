package org.michalak.service;

import java.util.HashMap;

import org.michalak.dto.User;

public class LoginService {
	
	HashMap<String, String>  users = new HashMap<String, String>();
	
	
// constructors
	public LoginService(){		
		users.put("aa", "aaa");
		users.put("bb", "bbb");
		users.put("cc", "ccv");
		users.put("dd", "ddd");
	}
	
	
	
//Methods	
	public boolean authenticate(String userID, String password){
		
		if (password== null  || password.trim() == ""){
			
			return false;
		}
		return true;
	}
	
	
	
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return  user;
 	}
	
	
	
	
}

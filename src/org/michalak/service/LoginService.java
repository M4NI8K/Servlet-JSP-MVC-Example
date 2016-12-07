package org.michalak.service;

public class LoginService {

	
	
	public boolean authenticate(String userID, String password){
		
		if (password== null  || password.trim() == ""){
			
			return false;
		}
		return true;
	}
	
}

package com.rays.exception;

public class LoginService {
	public void login(String username, String password) throws LoginException{
		String correctUsername = "admin";
		String correctPassword = "password";
		
		if(!username.equals(correctUsername)) {
			throw new LoginException("Invalid LoginId and Password");
		}
		if(!password.equals(correctPassword)) {
			throw new LoginException("Invalid LoginId and Password");
		}
		
		System.out.println("Login Successful");
	}
	
	public static void main(String[] args) {
		LoginService loginService = new LoginService();
		try {
			//Attempt to login with given credentails
			loginService.login("admin", "password");
		}catch (LoginException e) {
			System.out.println("Login Failed");
			System.out.println(e);
		}
	}

}

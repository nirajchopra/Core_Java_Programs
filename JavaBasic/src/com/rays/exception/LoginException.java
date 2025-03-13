package com.rays.exception;

public class LoginException extends Exception{
	
	public LoginException() {
		
		super("Login & Password Invalid...!!!");
	}
	
	public LoginException(String msg) {
		super(msg);
	}
	

}

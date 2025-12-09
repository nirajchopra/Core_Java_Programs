package com.rays.exception;

public class Propagation {
	public void first() throws Exception {
		try {
			second();
			
		} catch (CustomException e) {
			
			throw new Exception("Caught and wrapped exception" + e.getMessage());
		}
	}
	
	public void second() throws CustomException {
		throw new CustomException("Custom exceptionthrown from second() method");
	}

}

package com.rays.oop.cloneing;

public class DeepAddressSetGet  implements Cloneable{
	
	public String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		
		 return super.clone();
		
	}

}

package com.rays.oop.cloneing;

public class TestDeepStudentGetSet {

	
	public static void main(String[] args) throws CloneNotSupportedException {

		DeepAddressSetGet add = new DeepAddressSetGet();
		add.setCity("kota");

		DeepStudentGetSet st = new DeepStudentGetSet();
		st.setRolllNo(101);
		st.setAdd(add);
		
		DeepStudentGetSet st2 = (DeepStudentGetSet) st.clone();
		st2.setRolllNo(201);
		st2.add.city = "Indore";
		
		System.out.println(st.getRolllNo());
		System.out.println(st.getAdd().city);
		
		
		System.out.println(st2.getRolllNo());
		System.out.println(st2.getAdd().city);

	}
}

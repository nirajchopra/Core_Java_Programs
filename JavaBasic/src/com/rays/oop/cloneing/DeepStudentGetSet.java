package com.rays.oop.cloneing;

public class DeepStudentGetSet implements Cloneable {

	public int rolllNo;
	public DeepAddressSetGet add;

	public int getRolllNo() {
		return rolllNo;
	}

	public void setRolllNo(int rolllNo) {
		this.rolllNo = rolllNo;
	}

	public DeepAddressSetGet getAdd() {
		return add;
	}

	public void setAdd(DeepAddressSetGet add) {
		this.add = add;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		DeepStudentGetSet student = (DeepStudentGetSet) super.clone();
		
		student.add = (DeepAddressSetGet) add.clone();
		
		return student;
	}

}

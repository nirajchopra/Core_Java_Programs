package com.rays.oop.implicitexplicit;

public class ChildImplicit extends ParentImplicit {

	public ChildImplicit() {
		System.out.println("This is child");
	}

	public static void main(String args[]) {
		ChildImplicit c = new ChildImplicit();
	}

}

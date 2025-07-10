package com.rays.oop.implicitexplicit;

public class ChildExplicit extends ParentExplicit {

	public ChildExplicit(int a) {
		super(a);
		System.out.println("no" + " " + a);

	}

	public static void main(String args[]) {
		ChildExplicit c = new ChildExplicit(5);
	}

}

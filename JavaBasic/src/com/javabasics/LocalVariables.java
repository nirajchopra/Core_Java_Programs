package com.javabasics;

class LocalVariable {
  int a = 10; // class level variable of A class

  void localVariable_m1() {
  int b = 20; // local variable 
  System.out.println("--localVariable_m1() in LocalVariable class--");
  System.out.println(b);
  }

  void localVariable_m2() {
  int c = 30; // local variable 
  System.out.println("--localVariable_m2() in LocalVariable class--");
  System.out.println(c);
  }

  void localVariable_m3() {
  int d = 40; // local variable 
  System.out.println("--localVariable_m3() in LocalVariable class--");
  System.out.println(d);
	}
}

public class LocalVariables {
	public static void main(String[] args) {
		System.out.println(new LocalVariable().a);
		new LocalVariable().localVariable_m1();
		new LocalVariable().localVariable_m2();
		new LocalVariable().localVariable_m3();

	}
}

            
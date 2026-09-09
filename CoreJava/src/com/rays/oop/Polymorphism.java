package com.rays.oop;


class Plane1{
	void fly() {
		System.out.println("Plane flies");
	}
}

class CargoPlane1 extends Plane1{
	@Override
	 void fly() {
		System.out.println("CargoPlane flies");

	}
	
	void carryCargo() {
		System.out.println("CargoPlane carries goods");
	}
}

class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("FighterPlane flies");
	}
	
	void carryWeapons() {
		System.out.println("FighterPlane carries weapons");
	}
}

class Airport{
	public void permit(Plane1 ref) {
		ref.fly();
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Plane1 ref;
		CargoPlane1 cp1 = new CargoPlane1();
		FighterPlane1 fp1 = new FighterPlane1();
		Airport a = new Airport();
		
		a.permit(cp1);
		a.permit(fp1);
		
//		cp1.fly();
//		fp1.fly();
//		System.out.println("---------------------------");
//		ref=cp1;
//		ref.fly();
//		((CargoPlane1)(ref)).carryCargo();
//		
//		
//		ref=fp1;
//		ref.fly();
//		((FighterPlane1)(ref)).carryWeapons();
//		
	}
}

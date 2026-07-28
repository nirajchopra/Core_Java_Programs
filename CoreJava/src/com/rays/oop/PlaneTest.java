package com.rays.oop;

class Plane {
	void takeOff() {
		System.out.println("Pane is take-off");
	}

	void fly() {
		System.out.println("Plane is flying");
	}

	void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane {

	@Override
	void fly() {
		System.out.println("CargoPlane flies at small height");
	}

	void carryCargo() {
		System.out.println("CargoPlane carries goods");
	}
}

class PassengerPlane extends Plane {

	@Override
	void fly() {
		System.out.println("PassengerPlane is flying");
	}

	void carryPassenger() {
		System.out.println("PassengerPlane carries people");
	}
}

class FighterPlane extends Plane {

	@Override
	void fly() {
		System.out.println("FlighterPlane is flying");
	}

	void carryWeapons() {
		System.out.println("FligherPlane carries Weapons");
	}
}

public class PlaneTest {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		
		System.out.println("-----------------------------------------");
		
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryPassenger();
		
		System.out.println("-----------------------------------------");
		
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();

	}

}

package com.rays.io.interview;

import java.io.Serializable;

public class StudentSerializable implements Serializable {

	transient int id; //transient ka matlab hota hai yeh variable serialize nahi hoga.
	//Jab object file me save hoga, id ka value skip ho jayega.

	public String name;

	public StudentSerializable() {

	}

	public StudentSerializable(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		return ("id: " + id + " name: " + name + "");

	}
}
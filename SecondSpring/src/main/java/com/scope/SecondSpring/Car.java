package com.scope.SecondSpring;

public class Car {
	public Car() {
		System.out.println("Car class constructor");
	}
	private DieselEngine dieselEngine;
	
	public void setDieselEngine (DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;
	}
	public void drive() {
		int result = dieselEngine.start();
		if(result>=1) {
			System.out.println("Car started on journey");
		}
		else {
			System.out.println("Engine has some problem");
		}
	}

}

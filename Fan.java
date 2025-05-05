package com.oops;

public class Fan {
	String brand;
	int noBlade;
	double Warrenty;
	public void switchOn() {
		System.out.println("The brand is "+brand);
		System.out.println("Tt has is "+noBlade+" blades");
		System.out.println("It has "+Warrenty+" years");
		System.out.println("its Turend on!!!");
	}
	public void switchOff() {
		System.out.println("Fan has turned off!!");
	}

}

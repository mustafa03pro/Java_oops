package com.oops;

public class Bike {
	String name;
	String company;
	double milage;
	public int getBike(int tyre) {
		if(tyre==2) {
			System.out.println("It is a two weller");
			return 2;
		}
		else return 4;
		
	}
	

}

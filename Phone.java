package com.oops;

public class Phone {
	String name;
	String company;
	double Warrenty;
	String colour;
	int gen;
	
	public void getInformation() {
		System.out.println("the phone name is "+ name);
		System.out.println("the phone breed is "+ company);
		System.out.println("the phone colour is "+colour);
		System.out.println("the phone has  "+Warrenty+"years warrenty");
	}
	public boolean noG(int gen) {
		if(gen==5) {
			System.out.println("it is a 5g"); 
			return true;
		}
		else {
			System.out.println("It is a 4g phone");
			return false;
		}
		
	}

}

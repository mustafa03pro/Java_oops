package com.oops;

public class Dog {
	String name;
	String Breed;
	double age;
	String colour;
	public void getDogInformation() {
		System.out.println("the dog name is "+ name);
		System.out.println("the dog breed is "+Breed);
		System.out.println("the dog colour is "+colour);
		
	} 
    public void   bark() {
    	System.out.println(name+" it will not bark");
    	
    }

}
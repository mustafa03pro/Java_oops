package com.oops;

public class Shirt {
	String tshirt;
	String companyl;
	String size;
	int prize;
	public String getShirtInfo() {
		 System.out.println("the shirt is of brand "+companyl);
		System.out.println("the shirt is of size "+size);
		System.out.println("the shirt is "+prize);
		return "good quality"; 
		
	}

}

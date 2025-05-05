package com.oops;

public class ShirtDemo {
	public static void main(String[]args) {
		Shirt printed=new Shirt();
		printed.tshirt="printed";
		printed.size="l";
		printed.companyl="gucci";
		printed.prize=2000;
		System.out.println(printed.getShirtInfo());
		printed.getShirtInfo();
	}

}

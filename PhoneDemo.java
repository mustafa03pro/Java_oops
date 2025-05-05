package com.oops;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone oppo=new Phone();
		oppo.name="f-27";
		oppo.company="oppo";
		oppo.Warrenty=2.3;
		
		oppo.getInformation();
		oppo.noG(5);
		Phone reno=new Phone();
		reno.name="reno 21";
		reno.company="oppo";
		reno.Warrenty=2.3;
		
		reno.getInformation();
		reno.noG(4);

	}

}

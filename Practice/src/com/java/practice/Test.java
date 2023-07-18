package com.java.practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		System.out.println("BMW cost is:" + b.cost());
		System.out.println("BMW Mileage is:" + b.mileage() + "miles/hr");
		Audi a = new Audi();
		System.out.println("Audi cost is:" + a.cost());
		System.out.println("Audi Mileage is:" + a.mileage() + "miles/hr");
	}

}

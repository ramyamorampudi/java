package com.java.practice;

public class MethodOverloading {
	static int c,d;
	public void multiply(int a, int b) {
		if(a%2==0 && b%2==0) {
			c = (int) (a*b);
			System.out.println(c);
		}
	}
	public int multiply(int a, int b, double x) {
		return (int) (a+b+x);
	}
	public int multiply(double a, double b) {
		d = (int) (a-b);
		return d;		
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.multiply(4,6);
		System.out.println(obj.multiply(2,5,7));
		obj.multiply(9.0,8.0);
		System.out.println(d);
	}

}

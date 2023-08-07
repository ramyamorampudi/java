package com.java.patterns;

public class Pattern1 {
	public void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 obj = new Pattern1();
		obj.pattern1(5);
	}

}

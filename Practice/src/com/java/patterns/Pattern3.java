package com.java.patterns;

public class Pattern3 {
	public void pattern3(int n) {
		for(int i=n;i>0;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern3 obj = new Pattern3();
		obj.pattern3(5);
	}

}

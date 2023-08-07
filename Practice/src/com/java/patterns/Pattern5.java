package com.java.patterns;

public class Pattern5 {
	public void pattern5(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<n;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern5 obj = new Pattern5();
		obj.pattern5(5);
	}

}

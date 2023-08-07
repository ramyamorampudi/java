package com.java.patterns;

public class Pattern4 {
	public void pattern4(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			for(int k=0;k<i;k++) {
				System.out.print("a");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern4 obj = new Pattern4();
		obj.pattern4(5);
	}

}

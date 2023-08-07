package com.java.patterns;

public class Pattern6 {
	public void pattern6(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern6 obj = new Pattern6();
		obj.pattern6(5);
	}

}

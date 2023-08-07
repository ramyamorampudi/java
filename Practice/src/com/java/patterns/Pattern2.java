package com.java.patterns;

public class Pattern2 {
	public void pattern2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 obj = new Pattern2();
		obj.pattern2(5);
	}

}

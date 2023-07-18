package com.java.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=1,i=1;
		while(i<a){
		b=a*b;
		a--;
		}
		System.out.println(b);
	}

}

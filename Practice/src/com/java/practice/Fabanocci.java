package com.java.practice;

import java.util.Scanner;

public class Fabanocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=1,i,c = 0;
		for(i=1;i<=n;i++) {
			c = a+b;
			if(c==8) {
				continue;
			}
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}

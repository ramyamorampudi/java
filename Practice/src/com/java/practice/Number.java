package com.java.practice;

import java.util.Scanner;

public class Number {
	static int b=6;//static variable
	public String number(int N) {
		if ((N%2) ==0){
            return "Weird";
        }
        else{
            if(N>2 && N<5){
                return "Not Weird";
            }
            else if(N>6 && N<=20){
                return "Weird";
            }
            else{
                return "Not Weird";
            }
        }
	}
	private int factorial(int a) {
		int i=1;//local variable
		while(i<a){
		b=a*b;
		a--;
		}
		return b;
	}
	protected void print() {
		System.out.println("Hi, this is ramya");
	}
	void foreach() {
		int[] arr= new int[]{20,43,32};
		for(int c : arr){
			if(c==20) {
			System.out.println("s");
		}
			
		}
	}
	protected int sum(int a, int b, int n) {
        int s=0,s1=0,t=1;
		for(int i=0;i<t;i++){
            for(int j=0;j<=n-1;j++){
            	if(j<=n-1) {
                s = s + (int) Math.pow(2, j) * b;
            	}
                s1 = a + s;
                System.out.print(s1+" ");
            }
            System.out.println();
        }
		return s1;
	}
	public String array() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        boolean seq = false;
        for(int i=0;i<size-1;i++) {
        	if(a[i+1]-a[i]==0) {
        		seq = true;
        		break;
        	}
        }
        if(seq) {
    		System.out.println("true");
    	}
    	else {
    		System.out.println("false");
    	}
		return null;
	}
	public static void main(String[] args) {
		Number num = new Number();
		String res = num.number(19);
		System.out.println(res);
		int b = num.factorial(5);
		System.out.println(b);
		num.foreach();
		num.array();
    }
	}

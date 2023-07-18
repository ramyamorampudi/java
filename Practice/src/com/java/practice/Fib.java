package com.java.practice;

import java.util.*;

public class Fib{
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
    public static void main(String []args){
    	Fib obj = new Fib();
    	obj.array();
    }
}
package com.Class11;

public class InterviewQuestion6 {

	public static void main(String[] args) {
		
		
	// store planning means??? check
		
		
	//	Write a Java Program to print first 10 numbers of Fibonacci series.
		
		
		
		
		    int a=1;
	        int b=0;
	        int c=0;
	        
	        for(int i=0; i<10; i++) {
	        	
	            c=a+b;
	            a=b;
	            b=c;
	            System.out.print(a+" ");
	        }
	    }
	}
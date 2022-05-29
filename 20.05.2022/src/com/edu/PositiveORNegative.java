package com.edu;

import java.util.Scanner;

public class PositiveORNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the second number");
		int c=sc.nextInt();
		
		if((a==b)&&(b==c))
		{
			System.out.println("enter the are equal"); 
		}
		else {
		if(a>b && a>c) {
			System.out.println("greatest number="+a);
			
		}
		else if(b>a && b>c)
		{
			System.out.println("greatest numbmer="+b);

		}
		else {
			System.out.println("great number="+c);
		}
		 if((a>=0) &&(b>=0)&& (c>=0))
		{
			System.out.println("enter number are all positive");
		}
		 else if((a<0)&&(b<0)&&(c<0))
		 {
			 System.out.println("enter number areall negative");
		 }
		 else
		 {
			 System.out.println("enter number are mixed");
		 }
		}
		
	}

}

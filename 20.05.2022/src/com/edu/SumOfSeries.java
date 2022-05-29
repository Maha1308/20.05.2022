package com.edu;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		double sum=0;
		int n;
		int a ;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  the number ");
		 n=sc.nextInt();
		 System.out.println("enter  the number ");
		 a=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum-Math.pow(a,i);
			}
			
			else
			{
				sum=sum+Math.pow(a, i);
			}
		}
		System.out.println("sum"+sum);

	}

}

package com.edu;

import java.util.Scanner;

public class Bankannounces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the deposite amount");
		double deposit=sc.nextDouble();
		System.out.println("enter  the term");
		double term=sc.nextDouble();
		System.out.println("enter the age");
		int age=sc.nextInt();
		double s=0.0;
		if(term<=1&&age<60)
		{
			s=(deposit*7.5*term/100);
		}
		else if(term<=2&&age<60)
		{
			s=(deposit*8.5*term/100);
		}
		else if(term<=3&&age<60)
		{
			s=(deposit*9.5*term/100);
		}
		else if(term<=3&&age>=60)
		{
			s=(deposit*10.0*term/100);
		}
		else if(term>3&&age<60)
		{
			s=(deposit*11.0*term/100);
		}
		else if(term>3&&age>=60)
		{
			s=(deposit*11.0*term/100);
		}
		double amt=deposit+s;
		System.out.println("amount deposite"+deposit);
		System.out.println("age"+age);
		System.out.println("interrest earned"+s);
		System.out.println("amount"+amt);
	}

}

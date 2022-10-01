package class01codes;

import java.util.Scanner;

public class GroupTask7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a java program to check whether a given number is prime or not?
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		 int num=sc.nextInt();
		 for(int i=2; i<=num;i++) {
			 if(num%i==0) {System.out.println(num+"  is not prime  number");}
			 else  {System.out.println(num +" prime number ");}
			 break;
		 }
		// Second way
		 System.out.println("Please enter the number");
		 int num2=sc.nextInt();
		 int j=2;
		 boolean con=false;
		 while(j<=num2/2) {if
			 (num2%j==0) {con=true;}
		  
			 j++;}
			 
		if  (!con)	 System.out.println(num2 +" is prime  number ");
		 
	else
			  System.out.println(num2+" not  prime number");
			  
			  
		
	}

}
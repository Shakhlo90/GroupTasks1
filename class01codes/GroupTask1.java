package class01codes;

import java.util.Arrays;
import java.util.Scanner;

public class GroupTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Using Scanner create an array of integer values. 
		//After the array is created, calculate the sum of all stored elements in that array.	
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("PLEASE enter the size of the array");
		
		int size=sc.nextInt();
		int[]numbers=new int [size];
		int sum=0;
		for(int a=0;a<numbers.length; a++) {
			System.out.println("Please enter the number");
			numbers[a]=sc.nextInt();
			sum=sum+numbers[a];}
			{System.out.println("the sum of all stored elements in that array "+sum);}*/
			
			System.out.println("PLEASE enter the size of the array");
			
		
		int[]num= {7,8,9,0};
		int sum1=0;
for (int nn:num)
{
	sum1+=nn;}
	

System.out.println(sum1);
System.out.println(Arrays.toString(num));
	}

}

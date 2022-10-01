package class01codes;

import java.util.Arrays;

public class GroupTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a java program to find the second largest
		//number in the array?
		int largest = 0;
		int second = 0;
		int[] num = { 9, 45, 67, 89 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				second = largest;
				largest = num[i];
			} else if (num[i] > second)
				second = num[i];
		}
			System.out.println(Arrays.toString(num));

			System.out.println("The second largest number is  "+second);
		
	}

}

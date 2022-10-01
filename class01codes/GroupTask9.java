package class01codes;

public class GroupTask9 {

	public static void main(String[] args) {

// Maximum and minimum number in the array?
		int[] num = { 10, 20, 30, 40, 50, 60, 70 };
		int max = num[0];
		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
			if (num[i] < min)
				min = num[i];
		}

		System.out.println("The minimum number is " + min + " in the array");
		System.out.println("The maximum number is " + max + " in the array");

	}

}

package class01codes;

public class GroupTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = {

				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 11, 12, 13, 14 }, { 15, 16, 17, 18, 19 }, };

		int odd = 0;
		int even = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {

				if (num[i][j] % 2 == 0)
					even = even += num[i][j];
				else if (num[i][j] % 2 != 0)
					odd = odd + num[i][j];
			}
		}

		System.out.println("the sum of the  odd numbers is " + odd);
		System.out.println("the sum of the even is " + even);

	}

}

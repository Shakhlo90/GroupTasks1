package class01codes;

public class GroupTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create a 2D array or integer type where you will store odd and even numbers. 

		// Develop a program which will identify/print the even numbers only.
		int[][] num = {

				{ 5, 8, 24, 7 }, { 6, 3, 1, 9 },

				{ 40, 45, 73, 34, 51 },

		};
		System.out.println("Enhanced For Loop");
		for (int[] value : num) {
			for (int c : value) {
				if (c % 2 == 0) {
					System.out.print(c + " \n");
				}
			}
		}
         
		
		System.out.print("For Loop \n");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				
				if (num[i][j]%2 == 0) {
					System.out.print(num[i][j]+" ");
					
				}

			}
		}
	}

}

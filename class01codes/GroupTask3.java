package class01codes;

public class GroupTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] num = {

				{ 10, 8, 9, 89, 90 }, { 68, 88, 9, 76, 56 },

				{ 55, 43, 23, 56 }, };
		int sum = 0;
		
/*for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {
				sum = sum += num[i][j];
			}
			System.out.println(sum);
		}

		System.out.println();*/
	
		
		for(int []single:num) {
			for(int c:single) {
				sum+=c;}
			
			
			}
		System.out.println(sum);
			}
			
		
		
}	
		
		
		

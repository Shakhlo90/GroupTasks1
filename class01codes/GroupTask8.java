package class01codes;

public class GroupTask8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java Program to print the first 10 numbers of Fibonacci series.
		int n = 10;
		int first = 0;
		int second = 1;
		System.out.println("Fibonacci series till " + n + " terms");
		for (int i = 1; i <= n; i++) {
			System.out.println();

			int next = first + second;
			first = second;
			second = next;
		}
	}

}

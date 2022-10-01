package class01codes;

public class GroupTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print out duplicate elements from an Array of Strings?

		int[] num = { 2, 5, 6, 8, 8, 9, 9, };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++)
				if (num[i] == num[j] && (i != j)) {
					System.out.println(" The dublicate number is  " + num[j] + " ");
				}
		}

		System.out.println("-------------------------------------------------------------\n");

		String[] country = { "Germany", "Italy", "France", "Austria", "Belgium", "Germany", "Belgium" };

		for (int i = 0; i < country.length; i++) {
			for (int j = i + 1; j < country.length; j++)
				if (country[i] == country[j] && (i != j)) {
					System.out.println(" The dublicate country is  " + country[j] + " ");
				}
		}

	}

}

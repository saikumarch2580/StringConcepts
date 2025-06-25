package JavaPractice;

public class MissingAnumber {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 5 };
		int missing = 0;
		int total = a[0];
		for (int i = 0; i < a.length; i++) {
			missing = missing + a[i];
			System.out.println("missing numbers are" + missing);
		}
		for (int j = 0; j <= 5; j++) {
			total = total + j;
			System.out.println("total numbers are" + total);
			System.out.println("the value is " + (total - missing));

		}
	}

}

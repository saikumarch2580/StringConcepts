package NaveenJava;

public class CountNumbers {

	public static void main(String[] args) {
		// How much the count in the provided number

		int num = 2323445;

		int count = 0;

		while(num > 0) {

			num = num / 10;

			count++;

		}
		System.out.println("Total numbers are :" + count);

	}

}

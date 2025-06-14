package JavaPractice;

public class StringCount {

	public static void main(String[] args) {

		String sa = "sivaramakrishna sai srinu";
		int count = 0;
		int len = sa.length();

		for (int i = 0; i < len; i++) {
			if ((sa.charAt(i) == ' ') && (sa.charAt(i+ 1) != ' ')) {

				count++;

				System.out.println("Total count is " + count);

			}

		}

	}
}

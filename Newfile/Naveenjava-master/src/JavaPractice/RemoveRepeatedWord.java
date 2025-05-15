package JavaPractice;

public class RemoveRepeatedWord {

	public static void main(String[] args) {
		// Need to remove how repeated word in a given string

		String sr = "My name is sairam";
		int len = sr.length();

		String afterreplace = sr.replaceAll("m", "");

		System.out.println(afterreplace);
		int len2 = afterreplace.length();
		System.out.println(len - len2);
	}

}

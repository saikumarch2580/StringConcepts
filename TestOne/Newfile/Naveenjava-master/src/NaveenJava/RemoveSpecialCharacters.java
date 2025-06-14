package NaveenJava;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
    String s = "@#@$%% sai @#$@#@#@# selenium@#%%%% practice 9100090851";
    s = s.replaceAll("[^a-z,0-9]", "");
    System.out.println(s);

	}

}

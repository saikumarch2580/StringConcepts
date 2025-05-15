
public interface Autozilla {

	public int addition();

	public int subtraction();
}

class calculation implements Autozilla {
	public int addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public int subtraction() {
		int d = 10;
		int e = 30;
		int f = e - d;
		return f;
	}
}

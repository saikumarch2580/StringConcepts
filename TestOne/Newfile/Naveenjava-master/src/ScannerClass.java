import java.io.IOException;
import java.util.Scanner;

public class ScannerClass {
 
	public static void main(String[] args) {
		int a = 10;
		int c;
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();		
		scanner.close();
		try {
			 c = a/b;
		}catch(Exception e)
		{
			b=1;
			c=a/b;
			System.out.println("exception is pass");
		}
		
		
		System.out.println("addition " + c);

	}
	
}

package JavaPractice;

public class LargeNumberSecondWay {

	//Using ternary operator we can compare the large number
	public static void main(String[] args) {
		int a=10;
		int b=99;
		int c=44;
		
	int largeNumber = a>b?a:b;
	int largeNumber2=largeNumber>c?largeNumber:c;
	System.out.println(largeNumber2);

	}

}

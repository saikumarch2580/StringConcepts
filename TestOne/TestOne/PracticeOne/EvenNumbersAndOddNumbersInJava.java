package PracticeOne;

import java.util.ArrayList;

public class EvenNumbersAndOddNumbersInJava {

	public static void main(String[] args) {
		
		int a[] = {1,2,4,5,6,33,22,64,23,75,245,674,2454,333,677,363,3674,45643};
		int sum1 = 0;
		
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				
				al1.add(a[i]);
			} else {
				
				al2.add(a[i]);
			}
			
			
			System.out.println("Even numbers are :" + al1);
			
		}
		
		
		System.out.println("Even numbers are :" + al1);
		
		System.out.println("Even numbers size :" + al1.size());
		System.out.println("Odd numbers are :" + al2);
		System.out.println("Odd numbers are :" + al2.size());
	}

}

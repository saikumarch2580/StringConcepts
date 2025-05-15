package JavaPractice;

import java.util.Scanner;

public class LargestNumber {
	

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number is :");
		a= sc.nextInt();
		System.out.println(a +"IS THE BIG NUMBER" );
		
		b=sc.nextInt();
		System.out.println(b +"is the big number");
		
		c=sc.nextInt();
		System.out.println(c +"is the big number");
		
		if(a>b && a>c) {
			
			System.out.println("a is the bigger");
		}
			
			if(b>c && b>a) {
				
				System.out.println("b is bigger");
			}
			else {
				
				System.out.println("C is bigger");
			}
		
			
		
		
	}	
		
		
	}



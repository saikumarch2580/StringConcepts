package PracticeOne;

import java.util.Scanner;

public class ProgramForLogin {

	public static void main(String[] args) {
		
		Login();
		
	}
		
		public static void Login() {
			
			String username = "saikumar";
			String pswd = "Sairam@123";
			
			boolean authentication = false;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter user name : ");
			
			String actualusername = sc.next();
			
			System.out.println("Enter user pswd : ");
			
			String actualpswd = sc.next();
			
			if(username.equals(actualusername) && pswd.equals(actualpswd)) {
				
				authentication = true;
				System.out.println("Login successfully");
			} else {
				
				System.out.println("Login failed");
					
				}
			
			}
			
			
		

	}



package com.atm;

import java.util.Scanner;

//Remember, I spent more than 4 hours for this program. I did a small mistake and it made me to confuse and consumed my time. The issue was, for each method, i created a seperate object. due to the reason, The values were mismatching. Please make sure that when you write a program like atm, use only one object and it should be in class level not method level. 

public class AtmUserInterface {
    static boolean running = true;
    
	public static void main(String[] args) {
		AtmClass ac = new AtmClass();
		Scanner sc = new Scanner(System.in);
		
		String atmnumber ="123456";
		String atmpin ="3333";
		
		System.out.println("Enter ATM number: ");
        String actualatmnumber = sc.nextLine();
        
        System.out.println("Enter ATMPIN number: ");
        String actualpinnumber =sc.nextLine();
        
        if(atmnumber.equals(actualatmnumber) && atmpin.equals(actualpinnumber)) {
        	try {
				while(running) {
				System.out.println("Welcome to atm");
				System.out.println("Please choose the below options");
				System.out.println(" 1.Deposite Money\n 2.Withdraw Money\n 3.Available Balance\n 4.Exit");
      
      
       int ch = sc.nextInt();
      if(ch==1) {
				System.out.println("Enter deposite amount: ");
				
				ac.deposite(sc.nextDouble());
      } else if(ch==2) {
				System.out.println("Enter withdraw amount: ");
				
				ac.Withdraw(sc.nextDouble());
				
      } else if(ch==3) {
				
				
				ac.viewBalance();
      
      } else if(ch==4) {
				
				System.out.println("Thank you. Please collect cash");
				running = false;
      }
				}
			} catch (Exception e) {
			
				e.printStackTrace();
			}
	}else {
    	
    	System.out.println("Wrong user name or pswd");
	}
	}
	
}

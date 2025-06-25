package com.AirlinesBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {
	static int number;
	static ArrayList<Flight> list = new ArrayList<>();
	static ArrayList<Reservation> reserv = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean running = true;
		list.add(new Flight(1111, "Hyderabad", 5));
		list.add(new Flight(2222, "Rajahmundry", 8));
		list.add(new Flight(4444, "Kakinada", 9));

		while (running) {
			System.out.println("Welcome to Sairam Airlines");
			System.out.println("1. Display available seats");
			System.out.println("2. Book Flight");
			System.out.println("3. View Reservations");
			System.out.println("4. Exit");
			System.out.println("Choose an option");

			Scanner scanner = new Scanner(System.in);
			
			number = EnterCorrectNumber();

			switch (number) {

			case 1:

				DisplayAvailableSeats();
				break;

			case 2:
				bookFlight();
				break;

			case 3:
				viewReservation();
				break;
			case 4:
				System.out.println("Exiting the system...");
				running = false;
				break;
			case 5:
				System.out.println("Exiting the system");

			}
//			scanner.close();
		}

	}

	private static void cancelTicket() {
		
		

	}

	private static void viewReservation() {
	 if(reserv.isEmpty()) {
		 
		 System.out.println("No reservations done yet");
	 } else {
		 
		 System.out.println("Reservations -----------");
			 for(Reservation loop :reserv) {
				 
				 System.out.println("Passenger name "+ loop.getName());
				 System.out.println("Flight name "+ loop.getFlight());
			 
		 }
	 }

	}

	private static void bookFlight() {
		DisplayAvailableSeats();

		System.out.println("Enter the Flight number");
		
		int FlightNumber = scanner.nextInt();
		scanner.nextLine();
		
		
		Flight SelectFlightNumber = null;
		for (Flight flights : list) {
			if (flights.getFlightNumber() == FlightNumber) {
				SelectFlightNumber = flights;
				System.out.println("You have selected the flight :" + SelectFlightNumber);
				break;
			}
			}
			if (SelectFlightNumber != null) {
				if(SelectFlightNumber.getAvailbleseats() > 0) {
			
				System.out.println("Enter your name");
				
				String name = scanner.nextLine(); 
				Reservation res = new Reservation(name, SelectFlightNumber );
				res.setName(name);
				System.out.println("Flight booked with this name of " + name);
				System.out.println("Updated flight info: " + SelectFlightNumber);
				} else {
					System.out.println("No seats available for this flight.");
				}
			} else {
				System.out.println("Invalid flight number.");
			}
		}
		
		
	

	private static void DisplayAvailableSeats() {

		for (Flight f : list) {

			System.out.println(f);
		}

	}

	public static int EnterCorrectNumber() {
		while (true) {
			try {
				int input = scanner.nextInt();
				if (input >= 1 && input <= 4) {
					return input;
				} else {
					System.out.print("Invalid input. Enter a number between 1 and 4: ");
				}
			} catch (Exception e) {
				scanner.nextLine(); // clear the invalid input
				System.out.print("Invalid input. Enter a valid number: ");
			}
		}
	}
}

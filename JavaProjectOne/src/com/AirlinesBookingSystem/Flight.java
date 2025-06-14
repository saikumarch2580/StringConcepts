package com.AirlinesBookingSystem;

public class Flight {

	private int flightNumber;
	private String destination;
	private int availbleseats;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getAvailbleseats() {
		return availbleseats;
	}
	public void setAvailbleseats(int availbleseats) {
		this.availbleseats = availbleseats;
	}
	
	
	public void decrementSeats() {
		
		if(availbleseats>0) {
			
			availbleseats--;
		}
	}
	
	
	public Flight(int flightNumber, String destination, int availbleseats) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.availbleseats = availbleseats;
	}
	
	public String toString() {
		return "flightnumber :"+flightNumber+", destination :"+destination+", availableseats:"+availbleseats+";";
		
		
	}
	
}

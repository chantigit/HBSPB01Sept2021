package com.chanti;

public class Traveller //Main Component
{
	//field as interface
	Vehicle vehicle;
	//setter for interface
	public void setVehicle(Vehicle vehicle){
		this.vehicle=vehicle;
	}
	//business method
	void  startJourney()
	{
		vehicle.move();
		System.out.println("Journey Started");
	}
}

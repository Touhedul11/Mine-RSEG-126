package com.touhedul.cardealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
   	 cust1.setName("Tom");
   	 cust1.setAddress("300 jay street") ; 
   	 cust1.setCashOnHand(12000);
   	 
   	 Vehicle vehicle = new Vehicle("Audi", "A4", 13000, 13, "Premium Plus");

   	 Employee emp = new Employee();
   	 
   	cust1.purchaseCar(vehicle, emp, false);
	}

}

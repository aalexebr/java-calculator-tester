package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestTicket {
	
	public static Ticket c = null;
	
	@Test
	public void ageTest() {
		int age = -1;
		double km = 1;
		
		assertThrows(Exception.class,
				() -> c = new Ticket(km,age), 
				"Age must be above 0");
	}
	
	@Test
	public void kmTest() {
		int age = 1;
		double km = 0;
		
		assertThrows(Exception.class,
				() -> c = new Ticket(km,age), 
				"KM must be above 0");
	}
	
	@Test
	public void noDiscountTest() throws Exception {
		double pricePerKm = 0.21;
		double km = 1.1;
		int age = 18;
//		double price = km * pricePerKm;
		double price = 0.231;
		c = new Ticket(km,age);
		
		assertEquals(price, c.getFullPrice(), "PRICE EXPECTED CORRECTLY");
	}
	
	@Test
	public void discountOver() throws Exception{
		double pricePerKm = 0.21;
		double km = 1.1;
		int age = 65;
//		double price = km * pricePerKm;
		double price = 0.1386;
		c = new Ticket(km,age);
		
		assertEquals(price, c.getFullPrice(), "PRICE EXPECTED CORRECTLY");
	}
	
	@Test
	public void discountUnder() throws Exception{
		double pricePerKm = 0.21;
		double km = 101;
		int age = 17;
//		double price = km * pricePerKm;
		double price = 16.968;
		c = new Ticket(km,age);
		
		assertEquals(price, c.getFullPrice(), "PRICE EXPECTED CORRECTLY");
	}
}

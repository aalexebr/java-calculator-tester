package org.java;

public class Ticket {

	private double km;
	private int age;
	final static private double pricePerKm = 0.21;
	final static private double overDiscount = 0.6;
	final static private double underDiscount = 0.8;
	
	public Ticket(double km, int age) throws Exception{
		setKm(km);
		setAge(age);
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) throws Exception{
		if(km <= 0) {
			throw new Exception("km must be more than 0");
		}
		this.km = km;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{
		if(age <= 0) {
			throw new Exception("age must be more than 0");
		}
		
		this.age = age;
	}
	
	
	public double getFullPrice() {
		if(getAge()>=65) {
			double price = (pricePerKm * getKm()) * overDiscount;
			return price;
		}
		else if(getAge()< 18) {
			double price = (pricePerKm * getKm()) * underDiscount;
			return price;
		}
		else {
			double price = pricePerKm * getKm();
			return price;
		}
	}
}

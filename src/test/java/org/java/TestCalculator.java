package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

public class TestCalculator {
	
	public static Calculator c = null;
	Random random = new Random();

    float randomFloat = random.nextFloat();
    float randomFloatInRange1 = (float) ((-100.0) + random.nextFloat() * (100 - (-100.0)));
    float randomFloatInRange2 = (float) ((-100.0) + random.nextFloat() * (100 - (-100.0)));
	@BeforeAll
	public static void setup() {
		c = new Calculator();
	}
	
	@RepeatedTest(2)
	public void addTest() {
		float x = (float) randomFloatInRange1;
		float y = (float) randomFloatInRange2;
		
		float sum = (float) x + y;
		assertEquals(sum, c.add(x, y), "SUM EXPECTED CORRECTLY");
	}
	
	@RepeatedTest(2)
	public void subtractTest() {
		float x = (float) randomFloatInRange1;
		float y = (float) randomFloatInRange2;
		
		float sum = (float) x - y;
		assertEquals(sum, c.subtract(x, y), "SUBTRACION EXPECTED CORRECTLY");
	}
	
	@RepeatedTest(2)
	public void moltiplyTest() {
		float x = (float) randomFloatInRange1;
		float y = (float) randomFloatInRange2;
		
		float sum = (float) x * y;
		assertEquals(sum, c.moltilpy(x, y), "MOLT EXPECTED CORRECTLY");
	}
	
	@RepeatedTest(2)
	public void divideTest() throws Exception {
		float x = (float) randomFloatInRange1;
		float y = (float) randomFloatInRange2;
		
		float sum = (float) x / y;
		assertEquals(sum, c.divide(x, y), "DIV EXPECTED CORRECTLY");
	}
	
	@RepeatedTest(2)
	public void divideByZeroTest() {
		float x = (float) randomFloatInRange1;
		float y = (float) 0;
		
		assertThrows(Exception.class,
				() -> c.divide(x,y), 
				"Exception for divide by 0");
	}

}

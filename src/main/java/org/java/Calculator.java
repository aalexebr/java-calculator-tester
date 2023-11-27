package org.java;

public class Calculator {
	
	public float add(float x, float y) {
		float z = (float) x + y;
		return z;
	}
	
	public float subtract(float x, float y) {
		float z = (float) x - y;
		return z;
	}

	public float divide(float x, float y) throws Exception{
		if(y == 0) {
			throw new Exception("Y cant be 0");
		}
		float z = (float) x / y;
		return z;
	}
	
	public float moltilpy(float x, float y) {
		float z = (float) x * y;
		return z;
	}
	
}
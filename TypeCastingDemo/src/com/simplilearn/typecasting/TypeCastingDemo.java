package com.simplilearn.typecasting;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
	//1.Widening, Implicit TypeCasting
	int luckyNumber = 7;
	double price = 149.33;
	byte age = 10;
	System.out.println("Value of Lucky Number" + luckyNumber);
	
	//Widening
	
	float floatNumber = luckyNumber;
	
	System.out.println("Value of Float Lucky Number" + floatNumber);
	
	//Widening 
	double doubleNumber = floatNumber;
	System.out.println("Value of Double lucky number " + doubleNumber);
	
	System.out.println("Then Price Value" + price);
	
	
	
	
	
	

}
}

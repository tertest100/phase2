package com.simplilearn.examples;

public class Examples {
	
	
	
	public static void main(String[] args) {
		// WAP for converting a short value (height= 6) to other implicit types
		//	short -> int , float, double , 
		
		// WAP to convert a double value ( weight = 200.34 ) to other explicit types
		// double -> float -> int -> short -> byte
		
		short height = 6;
		int heightin = height;
		float heightfloat = height;
		double heightdouble = height;
		
		System.out.println("print short " +height);
		System.out.println("Print int" +heightin);
		System.out.println("Print float" +heightfloat);
		System.out.println("print double " +heightdouble);
		
		double weight = 200.34;
		float floatweight = (float)weight;
		int intweight = (int)weight;
		short shortweight = (short)weight;
		byte byteweight = (byte)weight;
		
		System.out.println("print weight " +weight);
		System.out.println("Print float" +floatweight);
		System.out.println("Print int " +intweight);
		System.out.println("print short " +shortweight);
		System.out.println("print byte " +byteweight);
	}
 
      




}

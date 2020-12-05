package com.simplilearn.examples;

class Bankuser{
	
	private int balance = 8000;
	public String name = "testqa";
	
	public void showBalance()
	{
		System.out.println(balance);
		
	}
	
	protected void showName() {
		System.out.println(name);
	}
}



class Example2 extends Bankuser {

	public static void main(String[] args) {
		
		Example2 newtest = new Example2();
		
		newtest.showName();
		
		
		
		// WAP for verifying variable and methods accessibility
		
		
		// take a class BankUser ->  with  variable as balance ,name
		// balance -> private property
		// name ->  should be a public property 
		// showBalance() method which is a public method to print balance
		// showName() method as protected method .		
		// Create a inherited class as TestUser  from BankUser to ShowName();
		

	}
	
	
	
		
}

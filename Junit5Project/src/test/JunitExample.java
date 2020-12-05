package test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitExample {

	@BeforeAll	
	static void setup(){
		System.out.println("@BeforeAll Executed");
		
	}
	
	@BeforeEach
	public void setupThis() {
		System.out.println("@BeforeEach executed");
		
	}
	@Disabled
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("first Junit");
	Assertions.assertTrue(true);
	
	}
	
	
	@Test
	public void test2() {
		System.out.println("second Junit");
		Assertions.assertTrue(true);
		
	}
	
	@AfterEach
	void tearThis() {
		
		System.out.println("@After each Executed");

	}
	
	@AfterAll
	static void tear() {
		System.out.println("@AfterAll Executed");
	}
}

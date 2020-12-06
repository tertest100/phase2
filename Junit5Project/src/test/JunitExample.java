package test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ConditionCheck.class)
public class JunitExample {

	@BeforeAll	
	static void setup(){
		System.out.println("@BeforeAll Executed");
		
	}
	
	@BeforeEach
	public void setupThis() {
		System.out.println("@BeforeEach executed");
		
	}
	//@Disabled
	//@Tag("High")
	//@Test
	@HighPriority
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("first Junit");
	Assertions.assertTrue(true);
	
	}
	
	//@ExtendWith(ConditionCheck.class)
	@Tag("medium")
	@Test
	public void test2() {
		System.out.println("second Junit");
		Assertions.assertTrue(true);
		
	}
	@Tag("Low")
	@Test
	public void test3() {
		System.out.println("Third Junit");
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

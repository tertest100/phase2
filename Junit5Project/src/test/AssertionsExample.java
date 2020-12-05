package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AssertionsExample {
	
	@DisplayName("Annotations Test")
	
	
	@Test
	public void test1()
	{
	  String exp = "Hi there";
    
      String act = "Hello there";
    
    //Assertions.assertEquals(exp, act);
    
    //test data
      String str1 = new String ("abc");
      String str2 = new String ("abc");
      String str3 = null;
      String str4 = "abc";
      String str5 = "abc";
        
      int val1 = 5;
      int val2 = 6;
 
      String[] expectedArray = {"one", "two", "three"};
      String[] resultArray =  {"one", "two", "three"};
 
      //Check that two objects are equal
      assertEquals(str1, str2);
 
      //Check that a condition is true
      assertTrue (val1 < val2);
 
      //Check that a condition is false
      assertFalse(val1 > val2);
 
      //Check that an object isn't null
      assertNotNull(str1);
 
      //Check that an object is null
      assertNull(str3);
 
      //Check if two object references point to the same object
      assertSame(str4,str5);
 
      //Check if two object references not point
	
      assertNotSame(str1,str3);
      
      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
	}
}
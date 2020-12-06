package test;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;



public class ParametereizedJunit {
	
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 7, -3, 15, Integer.MAX_VALUE})
	public void CheckOdd(int num) {
		
		Assertions.assertTrue(NumberFunctions.isOdd(num));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	public void CheckPalindrom(String name) {
		
		Assertions.assertTrue(StringFunctions.isPalindrome(name));
	}

	@ParameterizedTest
	@EnumSource(Month.class) // passing all 12 months
	void MonthTest(Month month) {
	    int monthNumber = month.getValue();
	    Assertions.assertTrue(monthNumber >= 1 && monthNumber <= 12);
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
	void someMonths_Are30DaysLong(Month month) {
	    final boolean isALeapYear = false;
	    Assertions.assertEquals(30, month.length(isALeapYear));
	}
	
	@ParameterizedTest
	@CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
	void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
	    String actualValue = input.toLowerCase();
	    Assertions.assertEquals(expected, actualValue);
	}
	
	
	@ParameterizedTest
	@MethodSource("DPMethod")
	public void CheckPalindromMethodSource(String name) {
		
		Assertions.assertTrue(StringFunctions.isPalindrome(name));
	}
	
	static Stream<String> DPMethod(){
		
		return Stream.of("racecar", "radar", "mom", "dad");
		
	}
	
	@ParameterizedTest
	@CsvSource({"2018/12/25,2018", "2019/02/11,2019"})
	void getYear_ShouldWorkAsExpected(@ConvertWith(DateConverter.class) LocalDate date, int expected) {
			Assertions.assertEquals(expected, date.getYear());
		}



}
	

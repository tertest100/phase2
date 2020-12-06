package PackageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest {
	  @Tag("qa")
	    @Test
	    @DisplayName("testCaseA inside ClassBTest inside packageB")
	    public void testCaseB() {
	        
	        System.out.println("Inside Class B Test");
	        
	    }
}

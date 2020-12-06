package testmaven1.testmaven1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassATest {
	@Test
    public void testLucky() {
        Assertions.assertEquals(8, ClassA.getLucky());
    }

}

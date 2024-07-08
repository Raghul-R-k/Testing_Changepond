package Local;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmazonProjectTest {

	@Test
	void testAmazonTagLine(){
		String expected = "Spend Less , Smile More ";
		String actual = "Spend Less , Smile More ";
		assertEquals(expected,actual);
		assertSame(expected,actual,"Expected result should match with the actual result");
	}
}

package Local;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class LifeCycleAnnotationsTest {
	LifeCycleAnnotation m;
	
//	@BeforeAll
//	void beforeAll() 
//	{
//		System.out.println("This will run before all the methods");
//	}
//
//	@AfterAll
//	void afterAll() 
//	{
//		System.out.println("This will run at last");
//	}

	@BeforeEach
	void init() 
	{
		m = new LifeCycleAnnotation();
	}

//	@AfterEach
//	void cleanUp() 
//	{
//		System.out.println("Clean it up Now");
//	}
//	
	@Test
	void testsquare() 
	{
		int expected = 25;
		int actual = m.square(5);
		assertEquals(expected, actual, "Pass");
	}

	@Test
	void testcube() {
		int expected = 125;
		int actual = m.cube(5);
		assertEquals(expected, actual, "Pass");
	}
	
	
//	
//	@Nested
//	class testPositiveNumber {
//
//		@Test
//		void testPositiveNo() 
//		{
//			assertEquals(2, m.positive(2, -2), "Should return +ve Value");
//
//		}
//		@Test
//		void testNegativeNo() 
//		{
//			int expected = -2;
//			int actual = m.positive(-2, -2);
//			assertEquals(expected, actual, ()-> "Should return a -ve Value" );
//		}
//	}
}
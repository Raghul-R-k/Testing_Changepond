package Local;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculatorProjectTest2{

	//@Test
	void addtest()
	{
		CalculatorProject  c = new CalculatorProject();
		int expected = 2;
		int actual = c.add(1,1);
		assertEquals(expected,actual, "Add function can calculate two interger");
	}

	//@Test
	void subtest() {
		CalculatorProject  c = new CalculatorProject();
		int expected = 1;
		int actual = c.sub(1,0);
		assertEquals(expected,actual, "sub function can calculate two interger");
	}

	//@Test
	void multest() {
		CalculatorProject  c = new CalculatorProject();
		int expected = 5;
		int actual = c.mul(5,1);
		assertEquals(expected,actual, "mul function can calculate two interger");
	}

	//@Test
	void divtest() {
		CalculatorProject c = new CalculatorProject();
		int expected = -10;
		int actual = c.div(10,-1);
		assertEquals(expected,actual, "div function can calculate two interger");
		//assertThrows(NullPointerException.class, () -> c.div(1,0), "div function can calculate two interger ");
	}

	@Test
	void AreaOfCircleTest() {
		CalculatorProject c = new CalculatorProject();
		assertEquals(3.14, c.AreaOfCircle(10));
		assertEquals(3.14, c.AreaOfCircle(15));
		assertEquals(314.1592653589793, c.AreaOfCircle(15));
	}
}
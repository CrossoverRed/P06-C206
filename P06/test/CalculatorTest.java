import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	@Test 
	public void testSubtract() {
		//fail("Not yet implemented");
		int a=9876;
		int b=4231;
		Calculator cal=new Calculator();
		int actual = cal.subtract(a, b);
		int expected =5645;
		assertEquals(expected, actual);
	}
	@Test //Must add in @Test when Runs:3/3
	public void testMultiply() {
		//fail("Not yet implemented");
		int a=98;
		int b=42;
		Calculator cal=new Calculator();
		int actual = cal.multiply(a, b);
		int expected =4116;
		assertEquals(expected, actual);
	}
	@Test 
	public void testDivide() {
		//fail("Not yet implemented");
		int a=108;
		int b=36;
		Calculator cal=new Calculator();
		int actual = cal.divide(a, b);
		int expected =3;
		assertEquals(expected, actual);
	}


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


}

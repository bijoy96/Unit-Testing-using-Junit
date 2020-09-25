/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo.isTriangle(1, 1, 1));
	}
	@Test
	public void test_is_triangle_2() {
		assertTrue(Demo.isTriangle(5000, 12000, 13000));
	}
	@Test
	public void test_is_triangle_3() {
		assertTrue(Demo.isTriangle(13000, 12000, 5000));
	}
	@Test
	public void test_is_triangle_4() {
		assertTrue(Demo.isTriangle(13000, 5000, 12000));
	}
	@Test
	public void test_is_triangle_5() {
		assertTrue(Demo.isTriangle(12000, 5000, 13000));
	}
	@Test
	public void test_is_triangle_6() {
		assertTrue(Demo.isTriangle(5000, 13000, 12000));
	}
	@Test
	public void test_is_triangle_7() {
		assertTrue(Demo.isTriangle(12000, 13000, 5000));
	}
	@Test
	public void test_is_triangle_8() {
		assertTrue(Demo.isTriangle(5.378897, 13.854549, 12.298259));
	}
	@Test
	public void test_is_triangle_9() {
		assertTrue(Demo.isTriangle(4, 4, 7));
	}
	public void test_is_triangle_10() {
		assertTrue(Demo.isTriangle(.5, .2, .4));
	}
	@Test
	public void test_is_NOT_triangle_1() {
		assertFalse(Demo.isTriangle(5, 7, 13));
	}
	@Test
	public void test_is_NOT_triangle_2() {
		assertFalse(Demo.isTriangle(13, 7, 5));
	}	
	@Test
	public void test_is_NOT_triangle_3() {
		assertFalse(Demo.isTriangle(13, 5, 7));
	}	
	@Test
	public void test_is_NOT_triangle_4() {
		assertFalse(Demo.isTriangle(7, 5, 13));
	}	
	@Test
	public void test_is_NOT_triangle_5() {
		assertFalse(Demo.isTriangle(7, 13, 5));
	}	
	@Test
	public void test_is_NOT_triangle_6() {
		assertFalse(Demo.isTriangle(5, 13, 7));
	}	
	@Test
	public void test_is_NOT_triangle_7() {
		assertFalse(Demo.isTriangle(5, 9, 3));
	}
	@Test
	public void test_is_NOT_triangle_8() {
		assertFalse(Demo.isTriangle(9, 5 , 3));
	}
	@Test
	public void test_is_NOT_triangle_9() {
		assertFalse(Demo.isTriangle(9, 5 , 3));
	}
	@Test
	public void test_is_NOT_triangle_10() {
		assertFalse(Demo.isTriangle(1, 2, -1));
	}
	@Test
	public void test_is_NOT_triangle_11() {
		assertFalse(Demo.isTriangle(1, 2, 1));
	}
	@Test
	public void test_is_NOT_triangle_12() {
		assertFalse(Demo.isTriangle(0, 0, 0));
	}
	@Test
	public void test_is_NOT_triangle_13() {
		assertFalse(Demo.isTriangle(.5, 0, .6));
	}
	@Test
	public void test_is_NOT_triangle_14() {
		assertFalse(Demo.isTriangle(5000, 4000, 999.999));
	}
	@Test
	public void test_is_NOT_triangle_15() {
		assertFalse(Demo.isTriangle(-5, -4, -3));
	}
	@Test
	public void test_is_NOT_triangle_16() {
		assertFalse(Demo.isTriangle(5, -4, -3));
	}

	@Test
	public void testmain_for_triangle() {
		ByteArrayInputStream in =
				new ByteArrayInputStream("5\n12\n13\n".getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is a triangle." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput, out.toString());
	}
	@Test
	public void testmain_for_NOT_triangle() {
		ByteArrayInputStream in =
				new ByteArrayInputStream("5\n12\n7\n".getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is not a triangle." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput, out.toString());
	}
	
}

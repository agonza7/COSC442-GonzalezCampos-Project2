package Rectangle.src.edu.towson.cis.cosc442.project2.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The unit test Class for Rectangle.
 */
public class RectangleTest {
	
	/** Declaring necessary test objects for {@link Rectangle} */
	Rectangle rect1, rect2;

	/**
	 * Initializes the necessary test objects for the test cases to use.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		rect1 = new Rectangle(new Point(2.0, 2.0), new Point(4.0, 7.0));
		rect2 = new Rectangle(new Point(2.0, 6.0), new Point(4.0, 3.0));
	}

	/**
	 * Test(S) for the getArea() method of the {@link Rectangle} class.
	 */
	@Test
	public void testGetArea1() {
		//Was expected a 10.... Should have been a 25
		assertEquals(25.0, rect1.getArea(),0.001);
		
	}
	
	@Test
	public void testGetArea2() {
	//Was expected a 6.... should have been a 9
			assertEquals(9.0, rect2.getArea(),0.001);
	}

	/**
	 * Test(S) for the getDiagonal() method of the {@link Rectangle} class.
	 */
	@Test
	public void testGetDiagonal1() {
		//Was expecting a 5.3852.... should have been a 7.0711
		assertEquals(7.0711, rect1.getDiagonal(), 0.0001);
		
	}
	
	@Test
	public void testGetDiagonal2() {
	//Was expecting a 3.6050.... should have been a 4.2426
			assertEquals(4.2426, rect2.getDiagonal(), 0.0001);
	}
	/**
	 * Cleans up test objects after a test case is executed.
	 */
	@After
	public void tearDown(){
		rect1 = null;
		rect2 = null;
	}
}

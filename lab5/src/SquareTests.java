import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTests {

    @Test
	void testArea() {
		Point p1 = new Point(2, 3);
		Square s1 = new Square(p1, 2);
		assertEquals(s1.area(), 4);
	}
	
	@Test
	void testPerimeter() {
		Point p1 = new Point(1, 1);
		Square s1 = new Square(p1, 3);
		assertEquals(s1.perimeter(), 12);
	}
	
	@Test
	void testEquals1() {
		Point p1 = new Point(2, 3);
		Square s1 = new Square(p1, 2);
		String s = "Hello!";
		assertFalse(s1.equals(s));
	}
	
	@Test
	void testEquals2() {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Square s1 = new Square(p1, 2);
		Square s2 = new Square(p2, 2);
		assertTrue(s1.equals(s2));
	}
	
	
	@Test
	void testHashCode() {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Square s1 = new Square(p1, 2);
		Square s2 = new Square(p2, 2);
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	void testToString() {
		Point p1 = new Point(2, 3);
		Square s1 = new Square(p1, 2);
		String s = "Square: (2.0,3.0), 2.0";
		assertEquals(s1.toString(), s);
	}
}
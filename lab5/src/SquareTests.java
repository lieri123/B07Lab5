import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTests {
    @Test
	void testDistance() {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(6, 6);
		assertEquals(p1.distance(p2), 5);
	}
	
	@Test
	void testHashCode() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 4);
		assertNotEquals(p1.hashCode(), p2.hashCode());
	}

	@Test
	void testEquals1() {
		Point p1 = new Point(1, 1);
		assertTrue(p1.equals(p1));
	}
	
	@Test
	void testEquals2() {
		Point p1 = new Point(1, 1);
		assertFalse(p1.equals(null));
	}
	
	@Test
	void testEquals3() {
		Point p1 = new Point(1, 1);
		String s = "Hello!" ;
		assertFalse(p1.equals(s));
	}
	
	@Test
	void testEquals4() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 4);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testEquals5() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 4);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testEquals6() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	void testPerimeter() {
		Point a = new Point(1, 1);
		Point b = new Point(1, 4);
		Point c = new Point(5, 1);
		Triangle t = new Triangle(a, b, c);
		assertEquals(t.perimeter(), 12);
	}
	
	@Test
	void testIsEquilateral1() {
		Point a = new Point(0, 0);
		Point b = new Point(Math.sqrt(5), 0);
		Point c = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);
		Triangle t = new Triangle(a, b, c);
		assertTrue(t.isEquilateral());
	}
	
	@Test
	void testIsEquilateral2() {
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(1, 1);
		Triangle t = new Triangle(a, b, c);
		assertFalse(t.isEquilateral());
	}
}

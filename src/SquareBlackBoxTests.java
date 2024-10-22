import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareBlackBoxTests {

	@Test
	void testNoArgConstructor() {
		Point origin = new Point(0, 0);
		Square sq1 = new Square();
		assertEquals(sq1.A, origin);
		assertEquals(sq1.length, 1);
	}
	
	@Test
	void testArgConstructor() {
		Point A = new Point(2, 5);
		Square sq1 = new Square(A, 2.7);
		assertEquals(sq1.A, A);
		assertEquals(sq1.length, 2.7);
	}
	
	@Test
	void testArea() {
		Point A = new Point(0, 0);
		Square sq1 = new Square(A, 5.2);
		assertEquals(sq1.area(), Math.pow(5.2, 2));
		Point B = new Point(-3, -3);
		Square sq2 = new Square(B, 2);
		assertEquals(sq2.area(), 4);
		Square sq3 = new Square(A, 0);
		assertEquals(sq3.area(), 0);
	}
	
	@Test
	void testPerimeter() {
		Point A = new Point(-2.5, -2.5);
		Square sq1 = new Square(A, 5);
		assertEquals(sq1.perimeter(), 20);
		Square sq2 = new Square(A, 0);
		assertEquals(sq2.perimter(), 0);
	}
	
	@Test
	void testEqualsSame() {
		Point A = new Point(0, 0);
		Square sq1 = new Square(A, 1);
		Square sq2 = new Square();
		assertTrue(sq1.equals(sq2));
	}

	@Test
	void testEqualsDiffPoint() {
		Point B = new point(1, 1);
		Square sq1 = new Square();
		Square sq2 = new Square(B, 1);
		assertFalse(sq1.equals(sq2));
	}
	
	@Test
	void testEqualsDiffLength() {
		Square sq1 = new Square();
		Point A = new Point(0, 0);
		Square sq2 = new Square(A, 1.1);
		assertFalse(sq1.equals(sq2));
	}
	
	@Test
	void testEqualsDiffBoth() {
		Point A = new point(1, 0);
		Square sq1 = new Square();
		Square sq2 = new Square(A, 5);
		assertFalse(sq1.equals(sq2));
	}
	
	@Test
	void testHashCode() {
		Point A = new Point(0, 0);
		Square sq1 = new Square(A, 1);
		Square sq2 = new Square();
		assertEquals(sq1.hashCode, sq2.hashCode);
		Point B = new Point(3, 7);
		Square sq3 = new Square(B, 10);
		Square sq4 = new Square(B, 10);
		assertEquals(sq3.hashCode, sq4.hashCode);
	}
	
	@Test
	void testToString() {
		Point A = new Point(2, 3);
		Square sq1 = new Square();
		Square sq2 = new Square(A, 3.7);
		String exp1 = "Square: (0,0), 1";
		String exp2 = "Square: (2,3), 3.7";
		assertEquals(sq1.toString(), exp1);
		assertEquals(sq2.toString(), exp2);
	}
}

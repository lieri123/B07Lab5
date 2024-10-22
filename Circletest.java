
import static org.junit.jupiter.api.Assertions.*;

class Circletest{
	
	@Test 
	void testNullCircle() {
		Cricle c1 = new Circle(new Point(0,0),1); 
		assertFalse(c1.equals(null)); 
	}
	
	@Test
	void testSameCircle() {
		Circle c1 = new Circle(new Point(0,0), 1); 
		assertTrue(c1.equals(c1)); 
	}
	
	@Test
	void testDifferentClass() {
		Cricle c1 = new Circle(new Point(0,0),1); 
		int num = 5; 
		assertFalse(c1.equals(num)); 
	}
	
	@Test 
	void testnonequalCricle() {
		Cricle c1 = new Circle(new Point(0,0),1); 
		Cricle c2 = new Circle(new Point(1,0),1); 
		assertFalse(c1.equals(c2)); 
	}
	
	@Test
	void testEqualCircle() {
		Cricle c1 = new Circle(new Point(0,0),1); 
		Cricle c2 = new Circle(new Point(0,0),1);  
		assertTrue(p1.equals(p2)); 
	}
	
	
	
	
}
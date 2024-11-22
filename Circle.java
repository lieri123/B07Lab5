

public class Circle {
	Point centre;
	Double radius;
	
	public Circle(Point centre, Double radius) {
		this.centre = centre;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		else if(this==obj)
			return true;
		else if(!(obj instanceof Circle))
			return false;
		else {
			Circle other = (Circle)obj;
			if(center.equals(other.center)) {
				if(radius == other.radius)
					return true;
				else
					return false;
			}
			else
				return false;
		}
	}
}
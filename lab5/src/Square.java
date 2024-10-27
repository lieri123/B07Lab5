
public class Square {
    Point A; //bottom left point
    double length;

    public Square(Point A, double l) {
        this.A = A;
        this.length = l;
    }

    public double area() {
        return this.length * this.length;
    }

    public double perimeter() {
        return 4 * this.length;
    }

    @Override
    public boolean equals(Object sx) {
        if (!(sx instanceof Square)) {
            return false;
        }
        Square x = (Square) sx;
        return (this.length == x.length && this.A.equals(x.A));
    }

    @Override
    public int hashCode() {
        return Double.hashCode(length) ^ Double.hashCode(A.x) ^ Double.hashCode(A.y);
    }

    @Override
    public String toString() {
        return "Square: (" + A.x + "," + A.y + "), " + this.length;
    }

}
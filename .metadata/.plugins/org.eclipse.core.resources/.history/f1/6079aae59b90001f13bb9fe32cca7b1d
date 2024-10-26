/*
 * 1. Constructor
 * 2. area
 * 3. perimeter
 * 4. equals
 * 5. hashcode
 * 6. toString
 */
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
    /**
     * This method checks of two rational numbers are equal
     * @param x the other rational number to be checked
     * @return true if they are equal, false otherwise
     */
    public boolean equals(Object sx) {
        if (!(sx instanceof Square)) {
            return false;
        }
        Square x = (Square) sx;
        return (this.length == x.length && this.A.equals(x.A));
    }

    @Override
    /**
     * This method creates a hashcode
     * @return the new hashcode
     */
    public int hashCode() {
        return Double.hashCode(length) ^ Double.hashCode(A.x) ^ Double.hashCode(A.y);
    }

    @Override
    public String toString() {
        return "Square: (" + A.x + "," + A.y + "), " + this.length;
    }

}
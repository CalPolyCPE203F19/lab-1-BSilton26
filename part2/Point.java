public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public double getRadius() { return Math.sqrt(Math.pow(x,2) + Math.pow(y,2)); }

    public double getAngle() {
        if (x > 0) 
            return Math.atan(y / x);
        if (x < 0) {
            if (y < 0)
                return Math.atan(y / x) - Math.PI;
            if (y > 0)
                return Math.atan(y / x) + Math.PI;
        }
        if (x == 0) {
            if (y > 0)
                return Math.PI / 2;
            if (y < 0)
                return -(Math.PI / 2);
        }
        if (y == 0) {
            if (x > 0)
                return 0;
            if (x < 0)
                return Math.PI;
        }
        return 0;
    }

    public Point rotate90() { return new Point(-y, x); }

}

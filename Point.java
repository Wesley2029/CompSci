public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distanceTo(Point other) {
        return (double) Math.sqrt(Math.pow((other.getX() - x), 2)
         + Math.pow((other.getY() - y), 2));
    }
    public Point midpointWith(Point other) {
        int x2 = (x + other.getX()) / 2;
        int y2 = (y + other.getY()) / 2;
        return new Point(x2, y2);
    }
}

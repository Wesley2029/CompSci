public class Line {
    private Point p1;
    private Point p2;

    public Line (Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public double calculateSlope() {
        return (double) (p2.getY() - p1. getY())
         / (p2.getX() - p1.getX());
    }
    public String pointSlopeForm() {
        return "(y - " + p1.getY() + ") = " + 
        new Line(p1, p2).calculateSlope() + "(x - " + p1.getX() + ")";
    }
    public boolean isCoordinateOnLine(Point p) {
        double a = (double) -(p2.getY() - p1.getY());
        double b = (double) p2.getX() - p1.getX();
        double c = (double) -(a * p1.getX() + b * p1.getY());
        if (p == null) {
            return false;
        }
        else if ((a * p.getX() + c) / -b == p.getY() 
            && (b * p.getY() + c) / -a == p.getX()) {
            return true;
        }
        else {
            return false;
        }
    }
    public void shift(int dx, int dy) {
        p1.setX(p1.getX() + dx);
        p2.setX(p2.getX() + dx);
        p1.setY(p1.getY() + dy);
        p2.setY(p2.getY() + dy);
    }
    public boolean isParallelTo(Line other) {
        if (other == null) {
            return false;
        }
        else if (new Line(p1, p2).calculateSlope() == other.calculateSlope()) {
            return true;
        }
        else {
            return false;
        }
    }
    public Line copy() {
        Point np1 = new Point(p1.getX(), p1.getY());
        Point np2 = new Point(p2.getX(), p2.getY());
        return new Line(np1, np2);
    }
}

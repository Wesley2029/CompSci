/*
 * REQ 01: answer question 1 before you write any other code.
 * Answer question 2 last, after you finish REQ 10.
 *
 * 1. Your tester runs the three lines below. How many Point objects
 *    exist afterward, and what does line.getP1().getX() return? Why?
 *        Point start = new Point(1, 4);
 *        Line line = new Line(start, new Point(2, 7));
 *        start.setX(6);
 *    Answer: 2 objects, it returns 6. start.setX(6) changes start's x point from 1 to 6.
 *
 * 2. Two methods in this lab take a parameter that can be null.
 *    Name them, and say what each one returns for null.
 *    Answer: 
 */
public class LineTester {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 10);
        System.out.println(p1.getY() + p2.getY());
        if (p1.getX() == p2.getX()) {
            System.out.println("true");
        }
        System.out.println(p1.distanceTo(p2));
        Line line1 = new Line(p1, p2);
        System.out.println(line1.pointSlopeForm());
        line1.isCoordinateOnLine(new Point(-5, -5));
        line1.isCoordinateOnLine(new Point(1, 2));
        line1.isCoordinateOnLine(null);
    }
}
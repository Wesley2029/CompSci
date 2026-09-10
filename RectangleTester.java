public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(3, 7);
        System.out.println("length: " + rect.getLength());
        System.out.println("width: " + rect.getWidth());
        System.out.println("area: " + rect.calculateArea());
        System.out.println("perimeter: " + rect.calculatePerimeter());
        System.out.println("diagonal: " + rect2.calculateDiagonal());
        rect2.toString();
        System.out.println("equals: " + rect2.equals(rect));
    }
}

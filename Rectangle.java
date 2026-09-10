public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }
    public Rectangle() {
        length = 4;
        width = 2;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int calculateArea() {
        int area = length * width;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = length + width;
        return perimeter;
    }

    public double calculateDiagonal() {
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return diagonal;
    }
    public String toString() {
        return "The rectangle's width is " + width + ", and its length is " + length;
    }

    public boolean equals(Rectangle other) {
        if (length == other.length && width == other.width) {
            return true;
        }
        else {
            return false;
        }
    }
}

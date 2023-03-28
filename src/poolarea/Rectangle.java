package poolarea;

/**
 * Write a class with the name Rectangle. The class needs two fields (instance variable) with
 * name  width and length both of type double. The class needs to have one constructor with
 * parameters width and length both of type double and it  needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field
 */
public class Rectangle {
    double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        double area = width * length;
        return area;
    }
}

package javaprogrammes;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs
 * two  fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters
 * (no-arg  constructor). The second constructor has parameters x and y of type int and it needs
 * to initialize the  fields.
 */
public class Programme16 {
    public static void main(String[] args) {
        Programme16 first = new Programme16(6, 5);
        Programme16 second = new Programme16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme16 point = new Programme16();
        System.out.println("distance()= " + point.distance());
    }

    int x;
    int y;

    public Programme16() {
    }

    public Programme16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Programme16 secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

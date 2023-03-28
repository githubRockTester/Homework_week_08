package cylinder;

/**
 * 1. Write a class with the name Circle. The class needs one field (instance variable)
 * with name radius of type double.
 * The class needs to have one constructor with parameter radius of type double and it needs
 * to initialize  the fields.
 * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 * Write the following methods (instance methods):
 * Method named getRadius without any parameters, it needs to return the value of the radius field.
 * Method named getArea without any parameters, it needs to return the calculated area
 * (radius * radius * PI). For PI use Math.PI constant.
 */
public class Circle {                     //parent class
    double radius;

    public Circle(double radius) {        //Constructor with one param
        if (radius < 0) {                 //if condition for radius
            this.radius = 0;              //initial value for radius
        } else {
            this.radius = radius;         //otherwise actual value
        }
    }

    public double getRadius() {           //method for set a value of radius
        return this.radius;
    }

    public double getArea() {            //method for logic to find circle
        return (getRadius() * getRadius() * Math.PI);  //can use math.pi directly from java inbuilt functions
    }
}

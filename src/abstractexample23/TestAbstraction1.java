package abstractexample23;

public class TestAbstraction1 {
    //In real scenario, method is called by programmer or user
    public static void main(String[] args) {
        Shape s = new Circle1(); //In real scenario, object is provided through method e.g, getShape()method
        s.draw();
    }
}

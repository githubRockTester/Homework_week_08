package constructoroverloading;

public class Student5 {
    //Java programme to overload constructors
    int id;
    String name;
    int age;

    //Creating two args constructor
    Student5(int i, String n) {
        id = i;
        name = n;
    }

    //Creating three args constructor
    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + "" + name + "" + age);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan");
        Student5 s2 = new Student5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

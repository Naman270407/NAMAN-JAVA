package JAVA_PRG.OOP;

class Circle {
    double radius, area;

    void set_radius(double r) {
        radius = r;
    }

    void display_circle_area() {
        area = 3.14 * radius * radius;
        System.out.println("\n Radius = " + radius);
        System.out.println("\n Area = " + area);
    }
}

public class Class_example_1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.set_radius(2.0);
        c1.display_circle_area();
    }
}

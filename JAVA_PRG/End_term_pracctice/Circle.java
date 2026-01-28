package JAVA_PRG.End_term_pracctice;

class Circle {
    double radius;

    Circle(double r) {     // parameterized constructor
        radius = r;
    }
    public static void main(String[] args) {
        Circle c = new Circle(5.5);       // passing value to constructor
        System.out.println(c.radius);
    }
}

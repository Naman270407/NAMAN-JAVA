package JAVA_PRG.OOP;

import java.util.Scanner;

// Rectangle class
class Rectangle {
    int length, breadth, area;

    // Function to read length and breadth
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    // Function to calculate area
    void calculateArea() {
        area = length * breadth;
    }

    // Function to display length, breadth and area
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }
}

// Main class
public class Rectangle_area {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); // object creation
        r.read();          // input lena
        r.calculateArea(); // area calculate krna
        r.display();       // output dikhana
    }
}

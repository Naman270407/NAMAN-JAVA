package JAVA_PRG.OOP;

class student {
    int rollno;
    String name;
    String course;

    void input(int n, String s1, String s2) {
        rollno = n;
        name = s1;
        course = s2;
    }

    void display() {
        System.out.println("Roll no = " + rollno);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course);
    }
}

class Abcd {
    public static void main(String[] args) {
        student s1 = new student();

        s1.input(46, "Naman", "BCA");

        s1.display();
    }
}

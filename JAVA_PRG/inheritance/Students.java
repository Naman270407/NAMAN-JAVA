// Use of multiple inheritance

package JAVA_PRG.inheritance;

public class Students {
    String name;
    int age;

    void set_data(String m, int n) {
        name = m;
        age = n;
    }
}

class marks extends Students {
    double m1, m2, m3;
    double per;

    void set_marks(double a, double b, double c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }
}

class sports extends marks {
    double s_marks;

    sports(double d) {
        s_marks = d;
    }

    void per_display() {
        per = (m1 + m2 + m3 + s_marks) / 4;
        System.out.println(name);
        System.out.println(age);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(per);
    }

    public static void main(String[] args) {
        sports p1 = new sports(99);
        p1.set_data("Naman", 18);
        p1.set_marks(89, 98, 77);
        p1.per_display();
    }
}

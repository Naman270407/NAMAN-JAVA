// Use of single heritance

package JAVA_PRG.inheritance;

public class Student {
    String name;
    int age;
    void set_data(String m, int n){
        name = m;
        age = n;
    }
}
class marks extends Student{
    double m1,m2,m3;
    double per;
    marks(double a, double b, double c){
        m1 = a;
        m2 = b;
        m3 = c;
    }
    void per_display(){
        per = (m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(age);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(per);
    }
    public static void main(String[] args) {
        marks p1 = new marks(66,77,99);
        p1.set_data("Naman",18);
        p1.per_display();
    }
}

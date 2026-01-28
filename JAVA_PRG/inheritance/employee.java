//  heirarichal inheritance

package JAVA_PRG.inheritance;

public class employee {
    double salary;
}
class manager extends employee{
    double in,g_sal;
    manager(double a, double b){
        salary = a;
        in = b;
    }
    void display(){
        g_sal=salary+in;
        System.out.println(salary);
        System.out.println(in);
        System.out.println(g_sal);
    }
}
class cleark extends employee{
    double bonus, g_sal;
    cleark(double a, double b){
        salary = a;
        bonus = b;
    }
    void display(){
        g_sal = salary+bonus;
        System.out.println(salary);
        System.out.println(bonus);
        System.out.println(g_sal);
    }
}
class exampleH{
    public static void main(String[] args) {
        manager m1 = new manager (60000,40000);
        m1.display();
        cleark c1= new cleark(20000,10000);
        c1.display();
    }
}

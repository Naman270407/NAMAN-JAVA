package JAVA_PRG.Classss;

class ABC {
    int m ; 
    static int count ;
    ABC(){
        m++;
        count++;
    }
    void diplay(){
        System.out.println(m);
        System.out.println(count);
    }

}

public class class_static {
    public static void main(String[] args) {
        ABC a1 = new ABC();
        a1.diplay();
        ABC a2 = new ABC();
        a2.diplay();
        ABC a3 = new ABC();
        a3.diplay();
        ABC a4 = new ABC();
        a4.diplay();
    }
    
}

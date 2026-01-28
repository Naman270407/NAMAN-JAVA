//  Using keyword This

package JAVA_PRG.Classss;

public class Student {
    Student roll;
    String name;
    Student (Student s1, String name){
        this.roll = s1;
        this.name = name;
    }
    void display(){
        System.out.println(roll);
        System.out.println(name);
    }
    public static void main(String [] args){
        Student s1 = new Student (s1,"Amit");
        s1.display();
    }

}

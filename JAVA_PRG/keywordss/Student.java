// use of this keyword

package JAVA_PRG.keywordss;

class Student {
    String name;
    int roll;
    Student(){
        this("Naman",46);
        System.out.println("This is Student class");
    }
    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    void display(){
        System.out.println(name);
        System.out.println(roll);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}

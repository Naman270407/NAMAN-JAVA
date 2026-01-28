package JAVA_PRG.abstraction;

interface A {
    void display();
}
interface B {
    void display();
}
class C implements A, B {
    public void display() {
        System.out.println("This is the example of multiple inheritance.......");
    }
    public static void main(String[] args) {
        C c1 = new C();
        c1.display();
    }
}

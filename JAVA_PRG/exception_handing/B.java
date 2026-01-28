package JAVA_PRG.exception_handing;

public class B {
    int x,y = 90;
    void divide() throws ArithmeticException{
        x = y/0;
    }
    public static void main(String[] args) {
        B b1 = new B();
        try{
            b1.divide();
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("Rest of the code");
    }
}

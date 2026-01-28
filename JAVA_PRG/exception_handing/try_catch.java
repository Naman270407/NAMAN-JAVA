package JAVA_PRG.exception_handing;

public class try_catch {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[10]= 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Naman");
    }
}

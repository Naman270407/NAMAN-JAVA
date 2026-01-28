package JAVA_PRG.exception_handing;

class NamanException extends RuntimeException{

}

public class custom_exception {
    public void validate(int age){
        if(age<18)
            throw new NamanException("Voting Rights");
        else
            System.out.println("Eligible to vote");
    }
    public static void main(String[] args) {
        
    }
}

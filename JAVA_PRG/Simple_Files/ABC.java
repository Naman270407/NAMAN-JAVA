package JAVA_PRG.Simple_Files;
class ABC {
    static int m;
    static int n;
    ABC ()
    {
        m = 6;
        n = 7;
    }
    static void display (int s){
        int p = s;
        System.out.println(m);
        System.out.println(n);
        System.out.println(p);
    }
    public static void main(String[] args) {
        ABC a1 = new ABC();
        ABC.display(10);
    }
}


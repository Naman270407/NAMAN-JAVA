package JAVA_PRG.threadss;

class First extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        First a1 = new First();
        a1.start();
    }
}

// (❁´◡`❁)                      (●'◡'●)                          ╰(*°▽°*)╯
// the execution of multi level program is executed by JVM not by programmer.😭😭😭

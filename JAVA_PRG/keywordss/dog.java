// using super keyyyyyyyyyyy

package JAVA_PRG.keywordss;

class dog {
    String color = "black";
}

class cat extends dog{
    String color = "brown";
    void display(){
        System.out.println(color);
        System.out.println(super.color);
    }
    public static void main(String[] args) {
        cat c1  = new cat();
        c1.display();
    }
}

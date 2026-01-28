package JAVA_PRG.End_term_pracctice;

public class rectangle {

    int length;
    int breadth;
    int area;

    rectangle(){
        length = 4;
        breadth = 5;
        area = length*breadth;
    }

    rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
        this.area = l*b;
    }

    void calculate_area(int l, int b){
        length = l;
        breadth = b;
    }

    void display(){
        System.out.println("Area : " + length*breadth);
    }


    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.calculate_area(8, 8);
        r.display();
        System.out.println();

        System.out.println("Area : " + r.area);
        System.out.println();

        rectangle r1 = new rectangle(9,9);
        System.out.println(r1.area);

    }
}

// some methods in the class string

package JAVA_PRG.Stringsss;

public class pre_defined_strings {
    public static void main(String[] args) {
        String s1 = "Hello World!";                                                         // way to declare a string
        String s2 = new String ("Hello World!");  // one more way to declare a string it is different from s1 because of using the new keyword
        String s3 = "Comback Impossible";
        String s4 = "COMBACK IMPOSSIBLE";
        String s5 = "This WORLD is SO cruel.";
        System.out.println(s1);                                                             // To print the String
        System.out.println(s3);
        System.out.println("Length of string s1 : " + s1.length());                         // For length of string
        System.out.println("Equal to s1 : "+ s1.equals("Hello World!"));           // For string is equal or not
        System.out.println("Equal to s3 : "+ s3.equals("Hello World!"));
        System.out.println("Equal to s2 : "+ s2.equals("Hello World!"));
        System.out.println("Length of string s3 : " + s3.length());
        System.out.println(s1.charAt(4));                                             // indexing of string
        System.out.println(s3.charAt(8));
        if (s1 == s2)
        System.out.println("Equal");
        else
        System.out.println("Not Equal");   // it is not equal because of using keyword 'new'

        if (s3.equalsIgnoreCase(s4))         // to ignore the case
        System.out.println("Equal");
        else
        System.out.println("Not Equal");

        System.out.println(s5.toLowerCase());  // change all cases to lowecase
        System.out.println(s5.toUpperCase());  // change all cases to uppercase

    }
}

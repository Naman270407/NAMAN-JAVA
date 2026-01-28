package files;

import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        String reversed = "";
        String[] words = line.split(" ");   

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        System.out.println(reversed.trim());
    }
}

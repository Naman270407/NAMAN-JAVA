package files;
// read a line of text and a word and string and count number of occurrences of that word.

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read line
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        // Read word
        System.out.print("Enter the word to count: ");
        String word = sc.next();

        // Split the line into words
        String[] words = line.split("\\s+");

        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        System.out.println("word '" + word + "' occurs " + count + " times in the given line.");
    }
}


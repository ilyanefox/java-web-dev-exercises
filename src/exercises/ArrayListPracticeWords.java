package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPracticeWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        words.add("olive");
        words.add("karate");
        words.add("Matt");
        words.add("Ilyane");
        words.add("Nadgy");


        System.out.println("Enter word length to search:");
        int numChars = input.nextInt();

        for (String item : words) {
            if (item.length() == numChars) {
                System.out.println(item);
            }

        }
    }
}
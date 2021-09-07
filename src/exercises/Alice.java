package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a word to search: ");

        String searchTerm = input.next();
        sentence = sentence.toLowerCase();
        Integer length = searchTerm.length();
        Integer index = sentence.indexOf(searchTerm);

        if (sentence.contains(searchTerm)) {
            System.out.println("true");
            System.out.println("The length of the search term is " + length + " at index " + index);
            String tempWord = searchTerm +" ";
            String newSentence = sentence.replaceAll(tempWord, "");
            System.out.println(newSentence);

        } else System.out.println("false");


    }
}

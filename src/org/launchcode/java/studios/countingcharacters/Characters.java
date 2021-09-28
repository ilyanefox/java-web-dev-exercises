package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine().toLowerCase();
        input.close();

        HashMap<Character, Integer> characterCounts = new HashMap<>();
        char[] charactersInPhrase = phrase.toCharArray();


        for (char character : charactersInPhrase) {

            if (characterCounts.containsKey(character)){
                characterCounts.put(character, characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character, 1);
            }
        }
        for(Map.Entry<Character, Integer> oneCharacter : characterCounts.entrySet()) {
            System.out.println(oneCharacter.getKey() + ":" + oneCharacter.getValue());
        }
    }
}

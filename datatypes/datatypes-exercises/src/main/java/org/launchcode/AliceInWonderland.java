package org.launchcode;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceStory = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        System.out.println("What word would you like to search the story for?");
        String userWord = input.next();
        if (aliceStory.toUpperCase().contains(userWord.toUpperCase())) {
            System.out.println(userWord + " is in the story.");
            System.out.println(userWord + " appears at index " + aliceStory.toUpperCase().indexOf(userWord.toUpperCase()) + ".");
            //String newAliceStory = aliceStory.split(userWord);
            System.out.println(aliceStory.split(userWord));
        } else {
            System.out.println(userWord + " is not in the story.");
        }
        input.close();
    }
}

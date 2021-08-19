package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void promptUser() {
        System.out.println("Enter something: ");
    }

    public static String takeUserInput() {
//        String quotes = ""; <<< needs to be surrounded in quotes.
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    private static void checkUserInput(String userInput) {
        if (!StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is not a number");
        } else {
            System.out.println(userInput + " is a number");
        }
    }

    private static void reverseUserInput(String userInput) {
        String reverse = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverse);
    }

    private static void flipCase(String userInput) {
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
    }


    public static void main(String[] args) {
        promptUser();
        String result = takeUserInput();
        System.out.printf("You Entered: "+ "%s", result); //Quotes did not work here for result
        System.out.println();
        checkUserInput(result);
        flipCase(result);
        reverseUserInput(result);
    }


}

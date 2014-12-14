package helloworld;

/**
 * This class handles the input string by counting the number of characters
 * and words in it, as well as reversing the string, and printing all this
 * information for the user.
 * 
 * @author Santeri Martikainen
 */
public class StringHandler {

    private final String input;

    public StringHandler(String input) {
        this.input = input;
    }

    /**
     * Prints the information 
     */
    public void run() {
        System.out.println("Length: " + countLengthOfString(input));
        System.out.println("Number of words: " + countNumberOfWords(input));
        System.out.println("Input in reverse: " + reverseInput(input));
    }

    /**
     * Counts how many characters were given to the program.
     */
    private int countLengthOfString(String input) {
        return input.length();
    }
    
    /**
     * This method counts the number of words and ignores any extra whitespace
     * characters between them (that is, if there is more than one).
     */
    private int countNumberOfWords(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        input = input.trim();
        // if the input was not empty, there is at least one word
        int words = 1;
        boolean lastCharWasSpace = false;
        for (int i = 0; i < input.length(); i++) {
            // let's check if we run into a whitespace character
            if (String.valueOf(input.charAt(i)).equals(" ")) {
                lastCharWasSpace = true;
            }
            // if last character was whitespace and the next isn't, we have a new word
            else if (lastCharWasSpace && !String.valueOf(input.charAt(i)).equals(" ")) {
                lastCharWasSpace = false;
                words++;
            }
        }
        return words;
    }

    /**
     * Transforms given string array into a reversed string. For example "test"
     * "array" comes out as "yarra tset".
     */
    private String reverseInput(String input) {
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            reversed = reversed + String.valueOf(input.charAt(input.length() - (i + 1)));
        }
        return reversed;
    }

    /**
     * Just a test method.
     */
    private void displayUsersInput(String input) {
        System.out.println("Input: " + input);
    }

}

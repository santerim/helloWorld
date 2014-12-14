package Helloworld;

/**
 * This program works by providing it an input string as a parameter, e.g.
 * java -jar helloWorld.jar "the input string"
 * 
 * @author Santeri Martikainen
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "";
        
        if (args.length == 0) {
            System.out.println("Please give a parameter, e.g. java -jar helloWorld.jar \"Hello, World!\"");
        } else if (args.length == 1) {
            input = args[0];
        } else if (args.length > 1) {
            System.out.println("Please put multiple words inside quotation marks.");
            System.exit(0);
        }

        StringHandler stringHandler = new StringHandler(input);
        stringHandler.run();
    }
}

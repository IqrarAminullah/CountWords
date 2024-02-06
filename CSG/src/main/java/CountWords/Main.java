package CountWords;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger= Logger.getLogger("Main");
    /**
     * @param args filename
     */
    public static void main(String[] args){
        //argument empty checking
        if (args.length == 0){
            logger.log(Level.SEVERE,"No arguments were profivded");
            System.exit(0);
        }
        try{
            Words w = new Words(args[0]);
            char c = args[1] == null ? 'm' : args[1].charAt(0); //reference char for words to count
            int l = args[2] == null? 5 : Integer.parseInt(args[2]); //reference length for words to count

            System.out.println(
                    "Number of Words beginning with Letter " + Character.toUpperCase(c) +
                    " or " + Character.toLowerCase(c) + " : " +
                            + w.countWordsBeginWith(c));
            System.out.println("Number of Words with Length "+ l + " or more : "
                    + w.countWordsWithLength(l));
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error Main Function" + "\n" + e);
        }
    }
}

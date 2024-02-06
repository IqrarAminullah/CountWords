import CountWords.Words;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordsTest {

    private final Words words;

    /**
     * Constructor
     * Initialize List of Words for Test
     */
    public WordsTest(){
        List<String> countWords = new ArrayList<>();

        countWords.add("Economy");
        countWords.add("Public");
        countWords.add("Menace");
        countWords.add("morphing");
        countWords.add("Mine");

        words = new Words(countWords);
    }

    /**
     * Test countWordBeginsWith Method from Words Class
     * Count words beginning with letter "m"
     */
    @Test
    public void countWordsBeginWithM(){
        int res = words.countWordsBeginWith('m');

        assertEquals(3, res);
    }

    /**
     * Test countWordsWithLength method from Words Class
     * Count words with length of 5
     */
    @Test
    public void countWordsLengthFive(){
        int res = words.countWordsWithLength(5);

        assertEquals(4, res);
    }
}

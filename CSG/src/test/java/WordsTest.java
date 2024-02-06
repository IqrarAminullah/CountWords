import CountWords.Words;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordsTest {

    private final Words words;

    /**
     * Constructor
     * Initialize List of Words for Test
     */
    public WordsTest(){
        List<String> countWords = new ArrayList<>();

        countWords.add("Economy");
        countWords.add("Purse");
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

    /**
     * Test getWordsWithLength method from Words Class
     * Get all words with length more thaan 5
     */
    @Test
    public void getWordsLengthFive(){
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Economy");
        expectedList.add("Menace");
        expectedList.add("morphing");

        ArrayList<String> list = words.getWordsWithLength(5);

        assertEquals(list, expectedList);
    }
}

import CountWords.Words;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordsTest {

    private final List<String> countWords;
    public WordsTest(){
        this.countWords = new ArrayList<>();

        this.countWords.add("Economy");
        this.countWords.add("Public");
        this.countWords.add("Menace");
        this.countWords.add("morphing");
        this.countWords.add("Mine");
    }
    @Test
    public void countWordsBeginWithM(){
        Words w = new Words(countWords);
        int res = w.countWordsBeginWith('m');

        assertEquals(3, res);
    }

    @Test
    public void countWordsLengthFive(){
        Words w = new Words(countWords);
        int res = w.countWordsWithLength(5);

        assertEquals(4, res);
    }
}

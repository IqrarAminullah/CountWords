package CountWords;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> words;

    public Words(){
        this.words = new ArrayList<String>();
    }

    public Words(List<String> words){
        this.words = words;
    }

    public int countWordsBeginWith(char c){
        int count = 0;
        for (String word: words){
            if (Character.toLowerCase(word.charAt(0)) == c){
                count++;
            }
        }
        return count;
    }
    public int countWordsWithLength(int l){
        int count = 0;
        for (String word : words){
            if(word.length() >=l){
                count++;
            }
        }
        return count;
    }
}

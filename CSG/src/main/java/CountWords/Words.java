package CountWords;

import java.util.ArrayList;
import java.util.List;

public class Words {

    /**
     * Stores the List of Words managed by the object
     */
    private List<String> words;


    /**
     * Empty Constructor
     */
    public Words(){
        this.words = new ArrayList<String>();
    }
    /**
     * Constructor
     * @param words list of string
     */
    public Words(List<String> words){
        this.words = words;
    }
    /**
     * Constructor
     * @param filepath path to file which contains list of words
     */
    public Words(String filepath){
        this.words = FileIO.readFileToList(filepath);
    }

    /**
     * Count words beginning with a certain letter. Case Insensitive
     * @param c desired character
     * @return number of words beginning with character c
     */
    public int countWordsBeginWith(char c){
        int count = 0;
        for (String word: words){
            if (Character.toLowerCase(word.charAt(0)) == c){
                count++;
            }
        }
        return count;
    }

    /**
     * Count words with certain length.
     * @param l length of word
     * @return number of words with length l
     */
    public int countWordsWithLength(int l){
        int count = 0;
        for (String word : words){
            if(word.length() >=l){
                count++;
            }
        }
        return count;
    }

    /**
     * @param l length of words to retrieve
     * @return array list of words with length more than l
     */
    public ArrayList<String> getWordsWithLength(int l){
        ArrayList<String> list = new ArrayList<>();
        for (String word : words){
            if(word.length() >l){
                list.add(word);
            }
        }
        return list;
    }
}

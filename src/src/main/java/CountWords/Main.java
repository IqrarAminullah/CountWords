package CountWords;

public class Main {

    /**
     * @param args filename
     */
    public static void main(String[] args){
        try{
            Words w = new Words(args[0]);
            System.out.println(
                    "Number of Words beginning with Letter \"M\" or \"M\" : "
                            + w.countWordsBeginWith('m'));
            System.out.println("Number of Words with Length 5 or more : "
                    + w.countWordsWithLength(5));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

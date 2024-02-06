package CountWords;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileIO {

    private static final Logger logger= Logger.getLogger("FileIO");
    /**
     * @param filepath string path of the file
     * @return array list of string read from file
     */
    public static List<String> readFileToList(String filepath){
        List<String> list = new ArrayList<String>();
        try{
            Scanner s = new Scanner(new File(filepath));
            while (s.hasNext()){
                list.add(s.next());
            }
            s.close();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading file" + "\n" + e);
        }
        return list;
    }
}

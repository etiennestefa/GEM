package GEM.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class FileSaver that saves files
 */
public class FileSaver {
    /**
     * Class Builder is Private
     */
    private FileSaver(){}
    /**
     * Method writeFile that writes a file and returns the outcome
     * @param file
     * @param ls
     * @return
     */
    public static Boolean writeFile(String file,Lines ls){
       try{
           write(file, ls);
       }
       catch(IOException e){
           return false;
       }
       return true;
    }
    /**
     * Method write that writes the file
     * @param file
     * @param ls
     * @throws IOException
     */
    protected static void write(String file,Lines ls) throws IOException {
        FileWriter f = new FileWriter(new File(file));
        f.write(ls.toString());
        f.close();
    }
}
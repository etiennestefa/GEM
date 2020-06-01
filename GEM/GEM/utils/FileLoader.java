package GEM.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Class FileLoader that implements a tool for files
 */
public class FileLoader {
    /**
     * String pathname that contains the path and name of the file
     */
    protected String pathname;
    /**
     * LineNumberReader f that contais the file
     */
    protected LineNumberReader f ;
    /**
     * Class Builder
     * @param pathname
     */
    public FileLoader(String pathname){
        this.pathname = pathname;
    }
    /**
     * Method getLines that returns the file as lines
     * @return
     */
    public Lines getLines(){
        try{
            return read();
        }
        catch(IOException e){
            return new Lines();
        }
    }
    /**
     * Method open that opens the file
     * @throws IOException
     */
    private void open() throws IOException{
        f = new LineNumberReader(new FileReader(new File(pathname)));
    }
    /**
     * Method exists that returns if the file exists
     * @return
     */
    public Boolean exists(){
        try{
            open();
            f.close();
        }
        catch(IOException e){
            return false;
        }
        return true;
    }
    /**
     * Method read that reads the file
     * @return
     * @throws IOException
     */
    protected Lines read() throws IOException{
        Lines ls = new Lines();
        if(!exists()) return ls;
        open();
        String line;
        Words ws;
        do{
            line = f.readLine();
            if(line != null){
                ws = Words.toWords(line);
                ls.add(ws);
            }
        }while(line != null);
        f.close();
        return ls;
    }
}
package GEM.utils;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class Lines that implements a list of Words separated newline and carriage return
 * 
 * Inspired on Haskell 
 * words :: String -> [String]
 * lines :: String -> [String]
 *
 * map words (lines cs)
 */
public class Lines implements Iterable<Words> {
    /**
     * ArryList lines containing all the Words (lines)
     */
    private ArrayList<Words> lines = new ArrayList<Words>();
    /**
     * Method size that returns the number of lines contained
     * @return the number of lines
     */
    public int size(){
        return lines.size();
    }
    /**
     * Method get that return the line at index
     * @param index the chosen index
     * @return the line at index
     */
    public Words get(int index){
        return lines.get(index);
    }
    /**
     * Method add that inserts a String as last in the last line
     * @param cs the String to be added
     */
    public Lines add(String cs){
        int index = lines.size()-1;
        Words last;
        if(index<0){
            last = new Words();
            add(last);
        }
        else{
            last = lines.get(index);
        }
        last.add(cs);
        return this;
    }
    /**
     * Method add that adds a new Words
     * @param ws Words instance added
     */
    public Lines add(Words ws){
        lines.add(ws);
        return this;
    }
    /**
     * Method newline that adds a new line to the data structure
     */
    public Lines newline(){
        lines.add(new Words());
        return this;
    }
    /**
     * Method toString that turns the content into a single String
     */
    public String toString(){
        String cs = ""; 
        for(Words ws : lines){
            cs += ws.toString() + "\n"; 
        }
        cs = cs.substring(0, cs.length()-1);
        return cs;
    }
    /**
     * Iterator
     * @return
     */
    public Iterator<Words> iterator(){
        return lines.iterator();
    }
}
package GEM.utils;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class Words that implements a list of strings separated by spaces
 * 
 * Inspired on Haskell 
 * words :: String -> [String]
 * 
 */
public class Words implements Iterable<String> {
    /**
     * ArryList words containing all the strings composing the words
     */
    private ArrayList<String> words = new ArrayList<String>();
    /**
     * Method size returning the number of words contained
     * @return number of words
     */
    public int size(){
        return words.size();
    }
    /**
     * Method get that return the element in a specific index
     * @param index th index
     * @return the element
     */
    public String get(int index){
        return words.get(index);
    }
    /**
     * Method add that adds a word in the collection
     * @param cs the word that has to be added
     */
    public Words add(String cs){
        words.add(cs);
        return this;
    }
    /**
     * Method toString that returns the line words contains
     */
    public String toString(){
        String r = "";
        for(String cs : words){
            r += cs + " "; 
        }
        r = r.substring(0, r.length()-1);
        return r;
    }
    /**
     * Method toWords that turns a tring into words
     * @param cs
     * @return
     */
    public static Words toWords(String cs){
        Words r = new Words();
        String s = "";
        int l = cs.length();
        int i = 0;
        char current;
        while(i<l){
            current = cs.charAt(i);
            if(!Char.isAlfaNumericPoint(current)){
                if(s.length()>0){
                    r.add(s);
                    s = "";
                }
            }
            else{
                s += current;
            }
            i++;
        }
        if(s.length()>0){
            r.add(s);
        }
        return r;
    }
    /**
     * Iterator
     * @return
     */
    public Iterator<String> iterator(){
        return words.iterator();
    }
}
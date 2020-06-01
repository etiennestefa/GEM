package GEM.utils;
/**
 * Class Char that holds useful functions to deal with chars
 */
public class Char {
    /**
     * Class Builder
     */
    private Char(){}
    /**
     * Method isUpper that returns if a char is UpperCase
     * @param c
     * @return
     */
    public static  Boolean isUpper(char c){
        return (c>='A' && c<='Z');
    }
    /**
     * Method isLower that returs if a char is LowerCase
     * @param c
     * @return
     */
    public static  Boolean isLower(char c){
        return (c>='a' && c<='z');
    }
    /**
     * Method isAlfabetic that returns if a char is Alfabetics
     * @param c
     * @return
     */
    public static  Boolean isAlfabetic(char c){
        return isLower(c) || isUpper(c);
    }
    /**
     * Method isDigit  that returns if a char is Numeric
     * @param c
     * @return
     */
    public static  Boolean isDigit(char c){
        return (c>='0' && c<='9');
    }
    /**
     * Method isAlfaNumeric that returns if a char is Alfanumeric
     * @param c
     * @return
     */
    public static  Boolean isAlfaNumeric(char c){
        return isAlfabetic(c) || isDigit(c);
    }
    /**
     * Method is P1 that checks some of the pointuations chars in ASCII table
     * @param c
     * @return
     */
    private static  Boolean isP1(char c){
        return (c>='!'&&c<='/');
    }
    /**
     * Method is P2 that checks some of the pointuations chars in ASCII table
     * @param c
     * @return
     */
    private static  Boolean isP2(char c){
        return (c>=':'&&c<='@');
    }
    /**
     * Method is P3 that checks some of the pointuations chars in ASCII table
     * @param c
     * @return
     */
    private static  Boolean isP3(char c){
        return (c>='['&&c<=96);
    }
    /**
     * Method is P4 that checks some of the pointuations chars in ASCII table
     * @param c
     * @return
     */
    private static  Boolean isP4(char c){
        return (c>='{'&&c<='~');
    }
    /**
     * Method isPoint that returns if a char is a pointuation
     * @param c
     * @return
     */
    public static  Boolean isPoint(char c){
        return isP1(c)||isP2(c)||isP3(c)||isP4(c);
    }
    /**
     * Method isAlfaNumericPoint that returns if a char is alfabetic or numeric or a pountuation sign
     * @param c
     * @return
     */
    public static  Boolean isAlfaNumericPoint(char c){
        return isAlfaNumeric(c) || isPoint(c);
    }
    /**
     * Method toInt that returns the associated number in alphabeth to a char
     * @param c
     * @return
     */
    public static  int toInt(char c){
        if(isLower(c)) return c - 'a';
        if(isUpper(c)) return c - 'A';
        return -1;
    }
    /**
     * Method toUpper that returns the upper of an int
     * @param c
     * @return
     */
    public static  char toUpper(int c){
        return (char) (c + 'A');
    }
    /**
     * Method toLower that returns the lower of an int
     * @param c
     * @return
     */
    public static  char toLower(int c){
        return (char) (c + 'a');
    }
}
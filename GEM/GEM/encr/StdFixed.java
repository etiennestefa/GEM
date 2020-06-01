package GEM.encr;

/**
 * Class StdFixed that implemets a char parsed encryption that does not encrypt spaces ad newlines
 */
public abstract class StdFixed extends StdDivider {
    /**
     * Method encrypt that returns String cs encrypted
     * @param cs String that has to be encrypted
     * @return String cs encrypted
     */
    protected String encrypt(String cs){
        String r = ""; 
        for(char c : cs.toCharArray()) r += encrypt(c);
        return r;
    }
    /**
     * Method encrypt that returns char c encrypted
     * @param c char that has to be encrypted
     * @return char c encrypted
     */
    protected abstract char encrypt(char c);
}
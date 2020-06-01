package GEM.encr;

/**
 * Class StdVariable that implements Encrypter for systems where char -> String
 */
public abstract class StdVariable extends StdDivider {
    /**
     * Method encrypt that returns String cs encrypted
     * @param cs String that has to be encrypted
     * @return String cs encrypted
     */
    protected String encrypt(String cs){
        String r = "";
        for(char c : cs.toCharArray()) r+= encrypt(c);
        return r;
    }
    /**
     * Method encrypt that returns char c encrypted
     * @param c char that has to be encrypted
     * @return char c encrypted
     */
    protected abstract String encrypt(char c);
}
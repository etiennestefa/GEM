package GEM.val;

import GEM.utils.*;

/**
 * Class StdValidator that implements an Encrypter with only chars restrintion 
 */
public abstract class StdValidator implements Validator {
     /**
     * Method isValid that returns if Lines ls is in a valid alphabet and grammar 
     * @param ls the Line that has to be checked
     * @return the outocome of the check
     */
    public Boolean isValid(Lines ls){
        for(Words ws : ls) if(!isValid(ws)) return false;
        return true;
    }
    /**
     * Method isValid that returns if Words ws is in a valid alphabet and grammar 
     * @param ws the Words that has to be checked
     * @return the outocome of the check
     */
    protected Boolean isValid(Words ws){
        for(String cs : ws) if(!isValid(cs)) return false;
        return true;
    }
    /**
     * Method isValid that returns if String cs is in a valid alphabet and grammar 
     * @param cs the Line that has to be checked
     * @return the outocome of the check
     */
    protected Boolean isValid(String cs){
        for(char c : cs.toCharArray()) if(!isValid(c)) return false;
        return true;
    }
    /**
     * Method isValid that returns if char c is in a valid alphabet and grammar 
     * @param c the char that has to be checked
     * @return the outocome of the check
     */
    protected abstract Boolean isValid(char c);
}
package GEM.val;

import GEM.utils.*;

/**
 * Class Validator that validates a Lines
 */
public interface Validator {
    /**
     * Method isValid that returns if Lines ls is in a valid alphabet and grammar 
     * @param ls the Line that has to be checked
     * @return the outocome of the check
     */
    public Boolean isValid(Lines ls);
}
package GEM.val;

import GEM.utils.*;

/**
 * Class StdAlfaNumeric that accepts only alfanumeric chars
 */
public class StdAlfaNumeric extends StdValidator{
    //DEFINED IN SUPERCLASS
    protected Boolean isValid(char c){
        return Char.isAlfaNumeric(c);
    }
}
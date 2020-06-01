package GEM.val;

import GEM.utils.*;

/**
 * Class StdAlfaNumericPoint that accepts only alfanumeric and symbol chars chars
 */
public class StdAlfaNumericPoint  extends StdValidator   {
    //DEFINED IN SUPERCLASS
    protected Boolean isValid(char c){
        return Char.isAlfaNumericPoint(c);
    }
}
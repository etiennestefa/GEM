package GEM.val;

import GEM.utils.*;

/**
 * Class StdAlfabetic that accepts only alfabetic chars
 */
public class StdAlfabetic extends StdValidator{
    //DEFINED IN SUPERCLASS
    protected Boolean isValid(char c){
        return Char.isAlfabetic(c);
    }
}
package GEM.encr;

import GEM.utils.*;
/**
 * Class StdDivider that partitions the encrypt task
 */
public abstract class StdDivider extends StdSyntax {
    /**
     * Method encrypt that returns Lines encrypted
     */
    public Lines encrypt(Lines ls){
        Lines r = new Lines();
        if(!validator.isValid(ls))
            setError();
        else 
            for(Words ws : ls) 
                r.add(encrypt(ws));
        return r;
    }
    /**
     * Method encrypt that returns Words ws encrypted
     * @param ws Words that has to be encypted
     * @return words ws encrypted
     */
    protected Words encrypt(Words ws){
        Words r = new Words();
        for(String cs: ws) 
            r.add(encrypt(cs));
        return r;
    }
    /**
     * Method encrypt that returns String cs encrypted
     * @param cs String that has to be encrypted
     * @return String cs encrypted
     */
    protected abstract String encrypt(String cs);
}
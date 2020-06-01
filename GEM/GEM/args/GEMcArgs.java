package GEM.args;

import GEM.encr.EncrypterHandler;
import GEM.lan.*;

/**
 * Class GEMcArgs that extends StdArgs for GEMc
 */
public class GEMcArgs extends StdArgs{
    /**
     * GEMcArgs only instance of GEMcArgs
     */
    protected static GEMcArgs instance = new GEMcArgs();
    /**
     * Method getInstance that returns the only instance of the class
     * @return the only instance
     */
    public static GEMcArgs getInstance(){
        return instance;
    }
    /**
     * Method loadC that loads and sets args while executing GEMc
     */
    public void load(){
        //RESET CURRENT
        resetCurrent();
        //LANGUAGE SELECTION
        if(hasNext()){
            if(isLan(current)) setLan(current);
            else goBack();
        }
        //ENCRYPTER.MOD SELECTION
        if(hasNext())
            setMod(current);
        else{
            setError();
            gui.showError(lan.getError(Language.Error.noArgs));
        }
            
        //CONFIGURATION SELECTION
        if(EncrypterHandler.needConfig(mod)){
            if(hasNext())
                setConfig(current);
            else
                setConfig(config);
        }
        else{
            setError();
            gui.showError(mod.name() + lan.getError(Language.Error.confNotNeeded));
        }
        //TOO MANY ARGS
        if(hasNext()){
            setError();
            gui.showError(lan.getError(Language.Error.tooManyArgs));
        } 
        //FINAL CHECK
        if(!isCorrect())
            gui.showError(lan.getError(Language.Error.initFail));
    }
    /**
     * Method is config that returns true
     * (in GEMc a configuration does not need to be valid)
     */
    protected Boolean isConfig(){
        return true;
    }
}
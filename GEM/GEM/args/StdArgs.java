package GEM.args;

import GEM.encr.*;
import GEM.gui.*;
import GEM.lan.*;
import GEM.utils.*;

/**
 * Abstract Class StdArgs that gives some tools to analyze args
 */
public abstract class StdArgs extends Args {
    /**
     * GUI gui, reference to GUI that makes shorter the code
     */
    protected GUI gui = GUI.getInstance();
    /**
     * Languages lan, reference to Languages that makes shorter the code
     */
    protected Languages lan = Languages.getInstance();
    /**
     * Languages.Mod lMod, Languages.Mod
     */
    protected Languages.Mod lMod = Languages.Mod.en;
    /**
     * Method isLan that check if name is Languages.Mod l
     * @param name the string passed
     * @param l Languages.Mod passes
     * @return 
     */
    protected Boolean isLan(String name, Languages.Mod l){
        return name.equals(l.name());
    }
    /**
     * Mehod isLan that returns if a string is a language
     * @param cs
     * @return
     */
    protected Boolean isLan(String cs){
        for(Languages.Mod l : Languages.Mod.values()) if(isLan(cs, l)) return true; 
        return false;
    }
    /**
     * Method setLan that sets the Languages.Mod
     * @param cs string Languages.Mod
     */
    protected void setLan(String cs){
        lMod = Languages.Mod.en;
        Boolean notFound = true;
        for(Languages.Mod l : Languages.Mod.values()) if(isLan(cs, l)){
            lMod = l;
            notFound = false;
        } 
        if(notFound){
            gui.showError("\"" + cs +"\"" + lan.getError(Language.Error.notLanguage) );
            setError();
        }
        else lan.setLan(lMod);
    }
    /**
     * EncrypterHandler.Mod mod, Encryption modality
     */
    protected EncrypterHandler.Mod mod = EncrypterHandler.Mod.none;
    /**
     * String config that contains the name of the configuration file
     */
    protected String config = "config";
    /**
     * Method isMod that check if name is EncrypterHandler.Mod m
     * @param name the string passed
     * @param m EncrypterHandler.Mod passed
     * @return 
     */
    protected Boolean isMod(String name, EncrypterHandler.Mod m){
        return name.equals(m.name());
    }
    /**
     * Method setMod that sets mod according to String cs
     * @param cs
     */
    protected void setMod(String cs){
        mod = EncrypterHandler.Mod.none;
        for(EncrypterHandler.Mod m : EncrypterHandler.Mod.values()) if (isMod(cs, m)) mod = m;
        if(mod == EncrypterHandler.Mod.none){
            gui.showError("\"" + cs +"\"" + lan.getError(Language.Error.notEncryptMod));
            setError();
        } 
    }
    /**
     * Method setConfig that sets configuration
     * @param cs
     */
    protected void setConfig(String cs){
        config = DirHandler.getInstance().getConfFile(mod, cs);
        if(!isConfig()){
            GUI.getInstance().showError("\"" + cs +"\"" + lan.getError(Language.Error.notConfig));
            setError();
        }
    }
    /**
     * Method isConfig that returns if config is a configuration
     * @return
     */
    protected Boolean isConfig(){
        FileLoader f = new FileLoader(config);
        if(!f.exists()) return false;
        return true;
    }
    /**
     * Method getConfig that returns configuration path
     * @return config
     */
    public String getConfig(){
        return config;
    }
    /**
     * Method getMod that return mod
     * @return mod
     */
    public EncrypterHandler.Mod getMod(){
        return mod;
    }
}
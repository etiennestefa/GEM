package GEM.lan;

import GEM.gui.*;

/**
 * Class Languages that implements desing pattern singleton and design pattern state with classes Language
 */
public class Languages {
    /**
     * Languages instance only instance of Languages
     */
    private static Languages instance = new Languages();
    /**
     * Method getInstance that returns the only instance of Languages
     * @return
     */
    public static Languages getInstance(){
        return instance;
    }
    /**
     * Enum Mod that represents the languages that can be used
     */
    public static enum Mod {
        en,
        it,
        fr
    }
    /**
     * Language current that is an instance of the current language
     */
    private Mod current = Mod.en;
    /**
     * Method setLan that sets the state current
     * @param l
     */
    public void  setLan(Languages.Mod l){
        current = l;
        GUI.getInstance().showMsg(instance.getMsg(Language.Msg.switchLan) + l.name());
    }
    /**
     * Method getError that return the error string in the correct language
     * @param e
     * @return
     */
    public String getError(Language.Error e){
        switch(current){
            case en: return English.getError(e);
            case it: return Italiano.getError(e);
            case fr: return Francais.getError(e);
            default : return Language.fake;
        }
    }
    /**
     * Method getWarning that return the warning string in the correct language
     * @param w
     * @return
     */
    public String getWarning(Language.Warning w){
        switch(current){
            case en: return English.getWarning(w);
            case it: return Italiano.getWarning(w);
            case fr: return Francais.getWarning(w);
            default : return Language.fake;
        }
    }
    /**
     * Method getMsg that return the msg string in the correct language
     * @param m
     * @return
     */
    public String getMsg(Language.Msg m){
        switch(current){
            case en: return English.getMsg(m);
            case it: return Italiano.getMsg(m);
            case fr: return Francais.getMsg(m);
            default : return Language.fake;
        }
    }
}
package GEM.encr;

import GEM.utils.*;
import GEM.val.*;
import GEM.gui.*;
import GEM.lan.Language;
import GEM.lan.Languages;

/**
 * Class StdCesare that implements Cifrario di Cesare
 */
public class StdCesare extends StdFixed {
    /**
     * Class Builder
     */
    private StdCesare(){}
    /**
     * int key key of the encryption
     */
    int key;
    /**
     * Validator validator that validates the input
     */
    protected Validator validator = new StdAlfaNumericPoint();
    /**
     * Method encrypt that encrypts a char
     */
    protected char encrypt(char c){
        if(Char.isPoint(c)) return c;
        if(Char.isDigit(c)) return c;
        int a = Char.toInt(c);
        a = (a + key) % 26;
        if(Char.isLower(c)) return Char.toLower(a);
        else return Char.toUpper(a);
    }
    /**
     * Method is key that returns if a Words is a key
     * @param ws
     * @return
     */
    protected static Boolean isKey(Words ws){
        if(ws.size()!=1) return false;
        String cs = ws.get(0);
        if(cs.length()!=1) return false;
        char c = cs.charAt(0);
        return Char.isLower(c);
    }
    /**
     * Method getKey that returns a key from a word
     * @param ls
     * @return
     */
    protected char getKey(Lines ls){
        return ls.get(0).get(0).charAt(0);
    }
    /**
     * Method getConfig that returns a loaded StdFixed
     * @param config the path of the configuration
     * @return
     */ 
    public static Encrypter getConfig(String config){
        FileLoader fl = new FileLoader(config);
        Lines ls = fl.getLines();
        StdCesare s = new StdCesare();
        s.key = Char.toInt(s.getKey(ls));
        return s;
    }
    /**
     * Method setConfig that makes a new configuration and returns the outcome
     * @param config
     * @return
     */
    public static Boolean setConfig(String config){
        GUI gui = GUI.getInstance();
        Lines ls = new Lines();
        Words ws;
        do{
            gui.showMsg(Languages.getInstance().getMsg(Language.Msg.keyAZ));
            ws = gui.getInputLn();
            if(!isKey(ws)) GUI.getInstance().showError(Languages.getInstance().getError(Language.Error.notKey));
        }while(!isKey(ws));
        ls.add(ws);
        return FileSaver.writeFile(config, ls);
    }
}
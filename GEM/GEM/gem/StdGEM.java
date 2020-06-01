package GEM.gem;

import GEM.lan.*;
import GEM.args.*;
import GEM.gui.*;
import GEM.encr.*;

/**
 * Abstract class StdGEM that 
 */
public abstract class StdGEM {
    /**
     * StdGEM instance only instance of the class
     */
    protected static StdGEM instance;
    /**
     * GUI gui, reference to GUI to make the code shorter
     */
    protected GUI gui = GUI.getInstance(); 
    /**
     *  Languages lan, reference to Lnaguages to make the code shorter
     */ 
    protected Languages lan = Languages.getInstance();
    /**
     * Args Args
     */
    protected Args Args ;
    /**
     * EncrypterHandler.Mod mod, encrypter modality used
     */
    protected EncrypterHandler.Mod mod;
    /**
     * String config configuration used
     */
    protected String config;
    /**
     * String args that contains execution arguments
     */
    protected String args[];
    /**
     * Abstract Method run that runs the program
     */
    protected abstract void run();
    /**
     * Method main that must be implemented in each subclass
     * @param args
     */
    public static void main(String args[]){
        instance.args = args;
        instance.run();
    }
}
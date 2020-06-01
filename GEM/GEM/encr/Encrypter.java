package GEM.encr;

import GEM.gui.GUI;
import GEM.utils.Lines;
import GEM.corr.StdCorrect;

/**
 * Abstract class Encrypter that contains all the methods needed to encrypt
 */
public abstract class Encrypter extends StdCorrect {
    /**
     * GUI gui reference to GUI to make the code shorter
     */
    protected GUI gui = GUI.getInstance();
    /**
     * Method encrypt that returns Lines encrypted
     * @param ls Lines that has to be encrypted
     * @return Lines ls encrypted
     */
    public abstract Lines encrypt(Lines ls);
    /**
     * Method setConfig that creates a new configuration (config) using the GUI
     * @param config
     * @return
     */
    public static Boolean setConfig(String config){return false;}
    /**
     * Method getConfig that returns an Encrypter configured
     * @param config
     * @return
     */
    public static Encrypter getConfig(String config){return null;}
}
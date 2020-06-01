package GEM.utils;

import GEM.encr.*;

/**
 * Class DirHandler that controls the paths
 */
public class DirHandler {
    /**
     * Enum OS possible operating systems
     */
    private enum OS{
        linux,
        windows
    }
    /**
     * OS os current operative system
     */
    private OS os = OS.linux;
    /**
     * String sub that returns ther right subdir symbol
     */
    private String sub(){
        switch(os){
            case linux:
                return "/";
            case windows:
                return "\\";
            default:
              return "/";
        }
    }
    /**
     * DirHandler instance that is the only instance of DirHandler
     */
    private static DirHandler instance = new DirHandler();
    /**
     * Method getInstance that returns the only instance of DirHandler instance
     * @return
     */
    public static DirHandler getInstance(){
        return instance;
    }
    /**
     * Protected Class Builder
     */
    private DirHandler(){} 

    /**
     * Method getMain that returns the current path of the program
     * @return
     */
    final public String getMain(){
        return  System.getProperty("user.dir") + sub();
    }
    /**
     * Method getData that returns the path of the Data directory
     * @return
     */
    final public String getData(){
        return getMain() + "GEMData" + sub();
    }
    /**
     * Method getEncrypter that return the directory where the Encrypters are saved
     * @return
     */
    final protected String getEncrypter(){
        return getData() + "Encrypter" + sub();
    }
    /**
     * Method getEncrypter that returns the directory where the Encrypters of Class encrypter are saved
     * @param encrypter
     * @return
     */
    final public String getEncrypter(EncrypterHandler.Mod mod){
        //if(encrypter == Encrypter.class) return getEncrypter();
        return getEncrypter() + mod.name() + sub();
    }
    /**
     * String addExt that adds GEM extensions to the configuration file
     * @param cs
     * @return
     */
    final public String addExt(String cs){
        return cs + ".gemc";
    }
    /**
     * Strinf getConfFile that returns the configuration file from an Encrypter and a String 
     * @param encrypter
     * @param cs
     * @return
     */
    final public String getConfFile(EncrypterHandler.Mod mod, String cs){
        return getEncrypter(mod) + addExt(cs);
    }
}
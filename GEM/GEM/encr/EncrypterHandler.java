package GEM.encr;

public class EncrypterHandler {
    /**
     * Enum Mod : all the possible Encrypters
     */
    public static enum Mod{
        none,
        StdCesare,
        StdMorse
    }
    /**
     * Method getEncrypter that returns the right encrypter according to the arguments
     * @return
     */
    public static Encrypter loadConfig(Mod mod, String config){
        switch (mod){
            case StdCesare:
                return StdCesare.getConfig(config);
            case StdMorse :
                return new StdMorse();
            default:
                return null;
        }
    }
    /**
     * Method set that calls the appropriate instance of EncrypterHandler.setConfig and returns outcome
     * @return outcome
     */
    public static Boolean setConfig(Mod mod, String config){
        switch(mod){
            case StdCesare:
                return StdCesare.setConfig(config);
            default:
                return false;
        }
    }
    /**
     * Method need config that returns if a modality needs configuration
     * @param mod
     * @return
     */
    public static Boolean needConfig(Mod mod){
        switch (mod){
            case StdCesare:
                return true;
            case StdMorse:
                return false;
            default : 
                return false;
        }
    }
}
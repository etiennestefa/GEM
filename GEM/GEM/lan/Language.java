package GEM.lan;
/**
 * Interface Language that defines every language methods
 */
public interface Language{
    /**
     * Enum Msg that contains every message identifier
     */
    public static enum Msg{
        msg,
        goodBye,
        switchLan,
        taskSuccess,
        keyAZ
    }
    /**
     * String fake that is the string shown when a function is not implemented
     */
    public static String fake = "_NOT_IMPLEMENTED_";
    /**
     * Method getMsg that returns the msg as string in the correct language
     * @param m
     * @return
     */
    public static String getMsg(Msg m){return fake;}
    /**
     * Enum Error that contains every error identifier
     */
    public static enum Error{
        error,
        noArgs,
        notLanguage,
        notEncryptMod,
        notConfig,
        notInput,
        tooManyArgs,
        initFail,
        fileWriteFail,
        notValidInput,
        confNotNeeded,
        notKey
    }
    /**
     * Method getError that returns the error as string in the correct language
     * @param e
     * @return
     */
    public static String getError(Error e){return fake;}
    /**
     * Enum Warning that contains every Warning identifier
     */
    public static enum Warning{
        warning
    }
    /**
     * Method getWarning that returns the warning as string in the correct language
     * @param w
     * @return
     */
    public static String getWarning(Warning w){return fake;}
}

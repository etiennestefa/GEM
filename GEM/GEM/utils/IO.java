package GEM.utils;

/**
 * Class IO that gives utilities about GUI IO modalities
 */
public class IO {
    /**
     * Enum Mod that represents the different ways GEM can handle IO
     */
    public static enum Mod{
        IO,
        file
    }
    /**
     * Method isMod that checks if a string represents an IO.Mod
     * @param cs
     * @param mod
     * @return
     */
    protected static Boolean isMod(String cs, IO.Mod mod){
        return cs.contentEquals(mod.name());
    }
    /**
     * Method isModIO that returns if a string represents IO.Mod.IO
     * @param cs
     * @return
     */
    public static Boolean isModIO(String cs){
        return isMod(cs, Mod.IO);
    }
    /**
     * Method isModFile that returns if a string does not represent IO.Mod.IO
     * @param cs
     * @return
     */
    public static Boolean isModFile(String cs){
        return !isMod(cs, Mod.IO);
    }
}
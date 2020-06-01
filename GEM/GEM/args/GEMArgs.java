package GEM.args;

import GEM.encr.EncrypterHandler;
import GEM.lan.*;
import GEM.utils.*;
import GEM.utils.IO.Mod;

/**
 * Class GEMArgs that extends StdArgs for GEM
 */
public class GEMArgs extends StdArgs {
    /**
     * GEMArgs only instance of GEMArgs
     */
    protected static GEMArgs instance = new GEMArgs();
    /**
     * Method getInstance that returns the only instance of the class
     * @return
     */
    public static GEMArgs getInstance() {
        return instance;
    }
    /**
     * IO.Mod input, input modality
     */
    private IO.Mod input = IO.Mod.IO;
    /**
     * IO.Mod output, output modality
     */
    private IO.Mod output = IO.Mod.IO;
    /**
     * String inputFile, input file path
     */
    private String inputFile = "";
    /**
     * String outputFile, output file path
     */
    private String outputFile = "";

    /**
     * Method setI that sets input according to String cs
     * 
     * @param cs
     */
    private void setI(String cs) {
        input = Mod.IO;
        if (IO.isModFile(cs)) {
            input = IO.Mod.file;
            setInputFile(cs);
        }
    }
    /**
     * Method setInputFile that sets input file
     * @param cs
     */
    protected void setInputFile(String cs){
        inputFile = cs;
        FileLoader fl = new FileLoader(inputFile);
        if (!fl.exists()) {
            setError();
            gui.showError("\"" + cs + "\"" + lan.getError(Language.Error.notInput));
        }
    }
    /**
     * Method seto that sets output according to String cs
     * @param cs
     */
    private void setO(String cs){
        if(IO.isModFile(cs)){
            output = IO.Mod.file;
            setOutputFile(cs);
        }
    }
    /**
     * Method setOutputFile that sets outputFile
     * @param cs
     */
    protected void setOutputFile(String cs){
        outputFile = cs;
    }
    /**
     * Method getInputFile that returns inputFile
     * @return inputFile
     */
    public String getInputFile(){
        return inputFile;
    }
    /**
     * Method getOutputFile that returns outputFile
     * @return outputFile
     */
    public String getOutputFile(){
        return outputFile;
    }
    /**
     * Method getIMod that returns input
     * @return
     */
    public IO.Mod getIMod(){
        return input;
    }
    /**
     * Method getOMod that returns output
     * @return output
     */
    public IO.Mod getOMod(){
        return output;
    }
    /**
     * Method load, loads args and sets all the fields while executing GEM
     */
    public void load(){
        //RESETS THE CURRENT
        resetCurrent();
        //LANGUAGE SELECTION
        if(hasNext()){
            if(isLan(current)) setLan(current);
            else goBack();
        }
        //ENCRYPT.MOD SELECTION
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
        //INPUT SELECTION
        if(hasNext())
            setI(current);
        //OUTPUT SELECTION
        if(hasNext())
            setO(current);
        //CHECK IF THERE ARE TOO MANY ARGS    
        if(hasNext()){
            setError();
            gui.showError(lan.getError(Language.Error.tooManyArgs));
        }
        //CHECK IF CORRECT 
        if(!isCorrect())
            gui.showError(lan.getError(Language.Error.initFail));
    }
}
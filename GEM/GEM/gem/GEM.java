package GEM.gem;

import GEM.args.*;
import GEM.encr.*;
import GEM.utils.*;
import GEM.lan.*;

/**
 * Class GEM that implements the Generic Encrypting Machine
 */
public class GEM extends StdGEM{
    /**
     * GEM instance that is the only instance of GEM
     */
    protected static StdGEM instance = new GEM();
    /**
     * Private Class Builder
     */
    private GEM(){}
    /**
     * GEMArgs Args instance of GEMArgs used
     */
    protected GEMArgs Args = GEMArgs.getInstance(); 
    /**
     * Encrypter encrypter that is the encrypter GEM is going to use
     */
    protected Encrypter encrypter;
    /**
     * IO.Mod iMod that is the input modality
     */
    protected IO.Mod iMod;
    /**
     * IO.Mod oMod that is the output modality
     */
    protected IO.Mod oMod;
    /**
     * String iPath input file path
     */
    protected String iPath;
    /**
     * String oPath output file path
     */
    protected String oPath;
    /**
     * Lines task that is the task encrypter is going to encrypt
     */
    protected Lines task;
    /**
     * Method run that runs the program
     */
    protected void run(){
        gui.initialize();
        Args.setArgs(args);
        Args.load();
        if(Args.isCorrect()) translate();
        gui.close();
    }
    /**
     * Method translate that loads, gets the task, translates it and shows it
     */
    protected void translate(){
        loadArgs();
        getInput();
        task = encrypter.encrypt(task);
        setOutput();
    }
    /**
     * Method loadAgs that loads the arguments
     */
    protected void loadArgs(){
        mod = Args.getMod();
        config = Args.getConfig();
        iMod = Args.getIMod();
        oMod = Args.getOMod();
        iPath = Args.getInputFile();
        oPath = Args.getOutputFile();
        encrypter = EncrypterHandler.loadConfig(mod, config);
    }
    /**
     * Method getInput that gets the input
     */
    protected void getInput(){
        if(iMod == IO.Mod.IO) 
            task = gui.getInput();
        else{
            FileLoader fl = new FileLoader(iPath);
            task = fl.getLines();
        }
    }
    /**
     * Method setOuptut that shows the output
     */
    protected void setOutput(){
        if(oMod == IO.Mod.IO) gui.showOutput(task);
        else {
            if(FileSaver.writeFile(oPath, task)) 
                gui.showMsg(lan.getMsg(Language.Msg.taskSuccess));
            else 
                gui.showError(lan.getError(Language.Error.fileWriteFail));
        }
    }
    /**
     * Method main that executes the program
     * @param args
     */
    public static void main(String args[]){
        instance.args = args;
        instance.run();
    }
}
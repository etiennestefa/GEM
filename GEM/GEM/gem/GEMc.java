package GEM.gem;

import GEM.args.*;
import GEM.encr.*;
import GEM.lan.*;

/**
 * Class GEMc that implements the configurer
 */
public class GEMc extends StdGEM {
    /**
     * GEMc instance that is the only instance of GEMc
     */
    protected static StdGEM instance = new GEMc();
    /**
     * Private Class Builder
     */
    private GEMc(){}
    /**
     * Args Args reference to GEMcArgs
     */
    private GEMcArgs Args = new GEMcArgs();
    
    /**
     * Method run that runs GEMc
     */
    protected void run() {
        instance.args = args;
        gui.initialize();
        Args.setArgs(args);
        Args.load();
        mod = Args.getMod();
        config = Args.getConfig();
        if (EncrypterHandler.setConfig(mod, config)) {
            gui.showMsg(lan.getMsg(Language.Msg.taskSuccess));
        } else
            System.out.println(config);
        gui.close();
    }
    /**
     * Method Main that runs the GEM Configurer (GEMc)
     * @param args
     */
    public static void main(String args[]){
        instance.args = args;
        instance.run();
    }
}
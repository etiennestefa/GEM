package GEM.gui;

import GEM.lan.*;
import GEM.utils.*;
import java.util.Scanner;
/**
 * Class Shell that extends
 */
public class Shell extends GUI {
    /**
     * Private Builder
     */
    private Shell(){}
    /**
     * GUI instance, only instance of Shell
     */
    protected static GUI instance = new Shell();
    /**
     * Method getInstance that returns GUI instance
     * @return instance
     */
    public static GUI getInstance(){
        return instance;
    }
    /**
     * Languages lan, reference to Languages that makes the code shorter
     */
    protected Languages lan = Languages.getInstance();
    /**
     * Method goodBye that returns the line to print as goodBye message
     * @return
     */
    protected String goodBye(){
        return gap + lan.getMsg(Language.Msg.goodBye);
    }
    /**
     * Method error that returns the service column in case of error
     * @return
     */
    protected String error(){
        return lan.getError(Language.Error.error) + gap;
    }
    /**
     * Method msg that returns the service column in case of msg
     * @return
     */
    protected String msg(){
        return lan.getMsg(Language.Msg.msg) + gap;
    }
    /**
     * Method warning that returns the service column in case of warning
     * @return
     */
    protected String warning(){
        return lan.getWarning(Language.Warning.warning) + gap;
    }
    /**
     * String delimiter that must be added in a new line to conclude input
     */
    private final String delimiter = ";;";
    /**
     * String prompt that is shown while recieving input
     */
    private final String prompt = "\t| -> ";
    /**
     * String gap that makes the GUI more readable making space between operations
     */
    private final String gap = "\t| ";
    /**
     * Scanner sc that reads user's input
     */
    private Scanner sc = new Scanner(System.in);
    //DESCRIBED IN SUPERCLASS
    public void initialize(){
        System.out.println("GEM" + "\t| Generic Encrypting Machine\t: 2020 Stefano Savino x81000841 UniCt");
        System.out.println("GEM" + "\t| Graphic User Inteface\t\t: Shell");
    }
    //DESCRIBED IN SUPERCLASS
    public Lines getInput(){
        Lines input = new Lines();
        String line;
        System.out.println("Input\t|");
        do{
            prompt();
            line = sc.nextLine();
            if( ! line.equals(delimiter) )
                input.add( Words.toWords(line) );
        }while( ! line.equals(delimiter) );
        return input; 
    }
    //DESCRIBED IN SUPERCLASS
    public Words getInputLn(){
        String line;
        System.out.println("Input\t|");
        prompt();
        line = sc.nextLine();
        return Words.toWords(line);  
    }
    //DESCRIBED IN SUPERCLASS
    public void showError(String cs){
        System.out.println(error() + cs);
    }
    //DESCRIBED IN SUPERCLASS
    public void showMsg(String cs){
        System.out.println(msg()+ cs);
    }
    //DESCRIBED IN SUPERCLASS
    public void showOutput(Lines ls){
        System.out.println("Output\t| ");
        for(int i = 0; i<ls.size(); i++) {
            System.out.print(gap);
            showWords(ls.get(i));
        }
        System.out.println(gap);
    }
    /**
     * Method showWords that shows a line
     * @param ws words (line)
     */
    private void showWords(Words ws){
        for(int i = 0; i<ws.size(); i++) {
            System.out.print(ws.get(i));
            if(i!=ws.size()-1) System.out.print(" ");
        }
        System.out.println("");
    }
    //DESCRIBED IN SUPERCLASS
    public void showWarning(String cs){
        System.out.println(warning() + cs);
    }
    //DESCRIBED IN SUPERCLASS
    public void reset(){
        initialize();
    }
    //DESCRIBED IN SUPERCLASS
    public void close(){
        System.out.println("GEM" + goodBye());
    }
    /**
     * Method prompt that shows the prompt
     */
    private void prompt(){
        System.out.print(prompt);
    }
}
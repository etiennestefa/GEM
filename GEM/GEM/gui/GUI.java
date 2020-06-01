package GEM.gui;

import GEM.utils.*;

/**
 * Abstract Class GUI that implements a Graphic User Interfaca with
 * - Error channel
 * - Warning channel
 * - Msg channel
 * - I/O channel
 * 
 * Class GUI implements design pattern Singleton
 */
public abstract class GUI {
    /**
     * GUI instance that is the only GUI instance
     */
    protected static GUI instance;
    /**
     * Method initialize that initializes the GUI
     */
    public abstract void initialize();
    /**
     * Method getInput that return User input as Lines
     * @return Lines input
     */
    public abstract Lines getInput();
    /**
     * Method getInputLn that return User input as Words
     * @return Words input
     */
    public abstract Words getInputLn();
    /**
     * Method showError that shows errors
     * @param cs error
     */
    public abstract void showError(String cs);
    /**
     * Method showError that shows warnings
     * @param cs warning
     */
    public abstract void showWarning(String cs);
    /**
     * Method showMsg that shows msgs
     * @param cs msg
     */
    public abstract void showMsg(String cs);
    /**
     * Method showOutput that shows Lines Output
     * @param ls output
     */
    public abstract void showOutput(Lines ls);
    /**
     * Method reset that resets the GUI
     */
    public abstract void reset();
    /**
     * Method close that closes the GUI
     */
    public abstract void close();
    /**
     * Method getInstance that returns the only instance of GUI instance
     * @return instance
     */
    public static GUI getInstance(){
        return Shell.getInstance();
    }
}
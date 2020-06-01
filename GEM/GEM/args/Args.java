package GEM.args;

import GEM.corr.*;

/**
 * Abstract Class Args is an anrguments analyzer
 */
public abstract class Args extends StdCorrect {
    /**
     * Method SetArgs that set Args according to execution arguments
     * @param args execution arguments
     */
    public void setArgs(String args[]){
        this.args = args;
    }
    /**
     * Method Args, private Builder
     */
    protected Args(){}
    /**
     * String args[], execution arguments
     */
    protected String args[];
    /**
     * int curr index of the current argument analyzed
     */
    private int curr = -1;
    /**
     * Method hasNext that returns is there is another argument to check
     * @return outcome
     */
    private Boolean checkNext(){
        return args.length>curr && curr>=0;
    }
    /**
     * Method hasNext that returns if there is another argument to check and sets the following one
     * @return outcome
     */
    protected Boolean hasNext(){
        nextCurrent();
        return checkNext();
    }
    /**
     * Method nextCurrent that increases current and sets the new current if present
     */
    private void nextCurrent(){
        curr ++;
        if(checkNext())
            current = args[curr];
    }
    /**
     * Method resetCurrent that sets curr -1
     */
    protected void resetCurrent(){
        curr = -1;
    }
    /**
     * Method goBack that returns to previous curr
     */
    protected void goBack(){
        curr--;
        if(checkNext()){
            current = args[curr];
        }
    }
    protected String current = "";
    /**
     * Abstract Method load that must be implemented in each subclass and analyzes the arguments
     */
    public abstract void load();
}
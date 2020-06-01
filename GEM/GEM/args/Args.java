package GEM.args;

import GEM.corr.*;

/**
 * Abstract Class Args is an anrguments analyzer
 */
public abstract class Args extends StdCorrect {
    /**
     * Method getInstance that return an instance of args
     * @return
     */
    public static Args getInstance(){
        return null;
    }
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
     * current
     */
    private int curr = -1;
    /**
     * Method hasNext that returns is there is another argument to check
     * @return
     */
    private Boolean checkNext(){
        return args.length>curr && curr>=0;
    }
    /**
     * Method hasNext that returns is there is another argument to check
     * @return
     */
    protected Boolean hasNext(){
        nextCurrent();
        return checkNext();
    }
    /**
     * Method nextCurrent that increases current
     */
    private void nextCurrent(){
        curr ++;
        if(checkNext())
            current = args[curr];
    }
    /**
     * Method resetCurrent that sets current 0
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
     * Abstract Method load that must be implemented in each subclass
     */
    public abstract void load();
}
package GEM.corr;

/**
 * Abstract Class StdCorrect that implements a class where :
 * - initial status is correct
 * - status can be changed only to incorrect
 * - correctess is an information that can be obtained from outside
 */
public abstract class StdCorrect {
    /**
     * Boolean error, check if Args is valid
     */
    private Boolean correct = true;
    /**
     * Method is correct that returns if Arguments are correct
     * @return
     */
    public Boolean isCorrect(){
        return correct;
    }
    /**
     * Method setError that sets correct to false
     */
    protected void setError(){
        correct = false;
    }
}
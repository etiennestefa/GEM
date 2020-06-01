package GEM.encr;

import GEM.val.*;

/**
 * Class StdSyntax that adds to Encrypter a validator
 */
public abstract class StdSyntax extends Encrypter {
    /**
     * Validator validator that validates the input
     */
    protected Validator validator = new StdAlfaNumericPoint();
}
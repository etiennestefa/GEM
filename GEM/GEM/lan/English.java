package GEM.lan;

/**
 * Class English that implements Language for English
 */
public class English implements Language {
    //DEFINED IN SUPERCLASS
    public static String getMsg(Msg m){
        switch(m){
            case msg:
                return "Msg";
            case goodBye:
                return "Good bye!";
            case switchLan:
                return "Switching language to ";
            case taskSuccess:
                return "Task completed successfully";
            default: 
                return "UNKNOWN MESSAGE";
        }
    }
    //DEFINED IN SUPERCLASS
    public static String getError(Error e){
        switch(e){
            case error:
                return "Error";
            case noArgs: 
                return "Lack of arguments";
            case notLanguage: 
                return " is not a valid language";
            case notEncryptMod: 
                return " is not a valid encrypting modality"; 
            case notConfig: 
                return " is not a known configuration";
            case notInput: 
                return " does not exist, it is not a valid input file";
            case tooManyArgs: 
                return "Too many arguments given!" ;
            case initFail:
                return "Initialization failed" ;
            case fileWriteFail: 
                return "File Writing Process Failed";
            case notValidInput:
                return " is not a valid input";
            case confNotNeeded:
                return " does not need configuration";
            default: 
                return "UNKNOWN ERROR";
        }
    }
    //DEFINED IN SUPERCLASS
    public static String getWarning(Warning w){
        switch(w){
            case warning:
                return "Warning";
            default:
                return "UNKNOWN WARNING";
        }
    }
}
package GEM.lan;

/**
 * Class Italiano that implements Language for Italian
 */
public class Italiano implements Language {
    //DEFINED IN SUPERCLASS
    public static String getMsg(Msg m){
        switch(m){
            case msg:
                return "Msg";
            case goodBye:
                return "A presto!";
            case switchLan:
                return "Passaggio alla lingua ";
            case taskSuccess:
                return "Compito portato a termine con successo";
            default: 
                return "MESSAGGIO SCONOSCIUTO";
        }
    }
    //DEFINED IN SUPERCLASS
    public static String getError(Error e){
        switch(e){
            case error:
                return "Errore";
            case noArgs: 
                return "Argomenti insufficienti";
            case notLanguage: 
                return " non e' una lingua valida";
            case notEncryptMod: 
                return " non e' una modalita' d'uso valida"; 
            case notConfig: 
                return " non e' una configurazione predisposta";
            case notInput: 
                return " non esiste, none' un file di input valido";
            case tooManyArgs: 
                return "Forniti troppi argomenti!" ;
            case initFail:
                return "Inizializzazione fallita" ;
            case fileWriteFail: 
                return "Processo di scrittura fallito";
            case notValidInput:
                return " non è un input valido";
            case confNotNeeded:
                return " non necessita configurazione";
            default: 
                return "ERRORE SCONOSCIUTO";
        }
    }
    //DEFINED IN SUPERCLASS
    public static String getWarning(Warning w){
        switch(w){
            case warning:
                return "Avviso";
            default:
                return "AVVERTIMENTO SCONOSCIUTO";
        }
    }
}
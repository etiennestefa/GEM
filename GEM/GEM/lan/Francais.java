package GEM.lan;

/**
 * Class Francais that implements Language for Franch
 */
public class Francais implements Language {
    //DEFINED IN SUPERCLASS
    public static String getMsg(Msg m){
        switch(m){
            case msg:
                return "Msg";
            case goodBye:
                return "A' bien tot!";
            case switchLan:
                return "Pasage a' la langue ";
            case taskSuccess:
                return "Tache terminee avec succes ";
            case keyAZ:
                return "Tapez une cle entre 'a' et 'z'";
            default: 
                return "MESSAGE INCONNU";
        }
    }
    //DEFINED IN SUPERCLASS
    public static String getError(Error e){
        switch(e){
            case error:
                return "Erreur";
            case noArgs: 
                return "Arguments insuffisants";
            case notLanguage: 
                return " n'est pas une langue valide";
            case notEncryptMod: 
                return " n'est pas une modalite' valide"; 
            case notConfig: 
                return " n'est pas une configuration counnue";
            case notInput: 
                return " n'existe pas, ce n'est pas une source valide";
            case tooManyArgs: 
                return "Trops d'arguments!" ;
            case initFail:
                return "Initialization sans succes" ;
            case fileWriteFail: 
                return "Ecriture sans success";
            case notValidInput:
                return " n'est pas une source valide";
            case confNotNeeded:
                return " ne deande pas de configuration";
            case notKey:
                return "Ceci n'est pas une cle !";
            default: 
                return "ERREUR INCOUNNU";
        }
    }
    //DEFINED IN SUPERCLASS
    public static String getWarning(Warning w){
        switch(w){
            case warning:
                return "Avis";
            default:
                return "AVIS INCONNU";
        }
    }
}
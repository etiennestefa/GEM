package GEM.encr;

import GEM.utils.*;

/**
 * Class StdMorse that implements Morse
 */
public class StdMorse extends StdVariable {
    /**
     * Class Builder
     */
    protected StdMorse(){}
    //DEFINED IN SUPERCLASS
    public Lines encrypt(Lines ls){
        Lines r = super.encrypt(ls);
        if(isCorrect()) return adjust(r);
        else return new Lines();
    }
    /**
     * Method adjust that adds '/' at the beginning and at the end of the line
     * @param ls
     * @return
     */
    protected Lines adjust(Lines ls){
        String r = "/";
        Lines rls = new Lines();
        for(int i = 0; i<ls.size(); i++){
            Words u = ls.get(i);
            for(int j = 0; j<u.size(); j++){
                r += u.get(j);
            }
        }
        r += "/"; 
        return rls.add(r);
    }
    //DEFINED IN SUPERCLASS
    protected String encrypt(String cs){
        return super.encrypt(cs)+"/";
    }
    //DEFINED IN SUPERCLASS
    protected String encrypt(char c){
        if(!Char.isAlfaNumeric(c)) return "";
        if(Char.isDigit(c)) return morseAlfabetic(c);
        else return morseAlfabetic(c);
    }
    /**
     * Method morseDigit that translates Digits
     * @param c
     * @return
     */
    protected String morseDigit(char c){
        switch(c){
            case '0': return "/-----";
            case '1': return "/.----";
            case '2': return "/..---";
            case '3': return "/...--";
            case '4': return "/....-";
            case '5': return "/.....";
            case '6': return "/-....";
            case '7': return "/--...";
            case '8': return "/---..";
            case '9': return "/----.";
            default : return "/";
        }
    }
    /**
     * Method morseAlfabetic that translates alfabetic chars
     * @param c
     * @return
     */
    protected String morseAlfabetic(char c){
        c = Char.toLower(Char.toInt(c));
        switch(c){
            case 'a': return "/.-";
            case 'b': return "/..";
            case 'c': return "/-.-.";
            case 'd': return "/-..";
            case 'e': return "/.";
            case 'f': return "/..-.";
            case 'g': return "/--.";
            case 'h': return "/....";
            case 'i': return "/..";
            case 'j': return ".---";
            case 'k': return "/-.-";
            case 'l': return "/.-..";
            case 'm': return "/--";
            case 'n': return "/-.";
            case 'o': return "/---";
            case 'p': return "/.--.";
            case 'q': return "/--.-";
            case 'r': return "/.-.";
            case 's': return "/...";
            case 't': return "/-";
            case 'u': return "/..-";
            case 'v': return "/...-";
            case 'w': return "/.--";
            case 'x': return "/-..-";
            case 'z': return "/--..";
            default: return "/";
        }
    }
}
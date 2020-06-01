package GEM.tests;
/**
 * Class Test that prints on screen all the information about the outcome of a test
 */
public class Test {
    /**
     * Method init that shows the header of the test output conducted on class c
     * @param c is the class tested
     */
    public static void init(Class<?> c){
        System.out.println("Now running test on class " + c.getName());
        System.out.println("{");
    }
    /**
     * Method ok that shows that test on method is successful
     * @param method is the metod tested
     */
    public static void ok(String method){
        System.out.println("OK : " + method + " concluded successfully");
    }
    /**
     * Method fail that shows that test on method has failed
     * @param method is the method tested
     */
    public static void fail(String method){
        System.out.println("FAIL : " + method + " failed miserably");
    }
    /**
     * Method end that shows the end of the test and the outcome
     * @param c is the class tested
     * @param n is the number of tests done
     * @param m is the number of tests successfully completed
     */
    public static void end(Class<?> c,int n, int m){
        System.out.println("}");
        System.out.println("Test on Class " + c.getName() + " concluded");
        System.out.println("Among them " + m + "/" + n + " succesfully passed : " + (100.0*m/n) + "%");
    }
}
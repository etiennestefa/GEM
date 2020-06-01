package GEM.tests;
/**
 * Abstract Class TestAbstract that implements an efficient test class able to count successes
 * 
 * Well implemented in the following way
 * 
 * protected void init(){
 *      c = <CLASS>;
 *      <INITIALIZATION> 
 * }
 * 
 * private void test<METHOD>(){
 *      String method = "<METHOD>";
 *      if(<TEST>) success(method);
 *      else fail(method);
 * }
 * 
 * protected void test(){
 *      init();
 *      begin();
 *      test<METHOD_1>();
 *      test<METHOD_2>();
 *      [...]
 *      test<METHOD_n>();
 *      end();
 * 
 * }
 *
 */
public abstract class TestAbstract {
    /**
     * int n that is the counter of the tests done
     */
    protected int n = 0;
    /**
     * int m that is the counter of succesfull tests
     */
    protected int m = 0;
    /**
     * Abstract Method init that initialize the test
     */
    protected abstract void init();
    /**
     * Class c that is the class the test is conducted on
     */
    protected Class<?> c;
    /**
     * Method success that is shows that the test is successfully completed ad increases n and m
     * @param method is the String identifing the method tested
     */
    protected void success(String method){
        Test.ok(method);
        m++;
        n++;
    }
    /**
     * Method fail that is shows that the test has failed ad increases n but not m
     * @param method is the String identifing the method tested
     */
    protected void fail(String method){
        Test.fail(method);
        n++;
    }
    /**
     * Method begin that calls method init and shows the begin of the test
     */
    protected void begin(){
        init();
        Test.init(c);
    }
    /**
     * Method end that shows the end of the test 
     */
    protected void end(){
        Test.end(c,n,m);
    }
    /**
     * Method test that runs the test
     */
    public abstract void test();
}
package GEM.tests;

import GEM.utils.*;

public class TestWords extends TestAbstract{
    private Words words = new Words();
    protected void init(){
       c = Words.class;
        words.add("Ciao");
        words.add("Come");
        words.add("va?");
    }
    private void testSize(){
        String name = "testSize";
        if(words.size() == 3){
            success(name);
        } 
        else{
            fail(name);
        }
    }
    private void testGet(){
        String name = "testGet";
        if(words.get(1).equals("Come")) success(name);
        else fail(name);
    }
    private void testToString(){
        String name = "testToString";
        if(words.toString().equals("Ciao Come va?")) success(name);
        else fail(name);
    }
    private void testAdd(){
        String name = "testAdd";
        words.add("Bene");
        if(words.size() == 4) success(name);
        else fail(name);
    }
    public void test(){
        begin();
        testSize();
        testToString();
        testGet();
        testAdd();
        end();
    }
    public static void main (String args[]){
        TestAbstract t = new TestWords();
        t.test();
    }
}
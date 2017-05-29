
package com.huwl.oracle.design_pattern.singleton;

public class HungryMan {
    private static HungryMan hungryMan=new HungryMan();
    private HungryMan() {}
    public static HungryMan getInstance(){
        return hungryMan;
    }
    
}

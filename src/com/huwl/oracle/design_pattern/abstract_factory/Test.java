
package com.huwl.oracle.design_pattern.abstract_factory;

public class Test {
    public static void main(String[] args){
        new MicrosoftFactory().produceDatabase().showName();
        new MicrosoftFactory().produceSystem().showName();
        new OracleFactory().produceDatabase().showName();
        new OracleFactory().produceSystem().showName();
    }
}

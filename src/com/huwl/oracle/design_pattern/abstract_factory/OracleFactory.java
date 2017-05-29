package com.huwl.oracle.design_pattern.abstract_factory;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class OracleFactory implements Factory{

    @Override
    public Product produceDatabase() {
        return new OracleDatabaseProduct();
    }
    @Override
    public Product produceSystem() {
        return new OracleSystemProduct();
    }
}

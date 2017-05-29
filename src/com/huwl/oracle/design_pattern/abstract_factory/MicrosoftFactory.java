package com.huwl.oracle.design_pattern.abstract_factory;

public class MicrosoftFactory implements Factory{

    @Override
    public Product produceDatabase() {
       return new MicrosoftDatabaseProduct();
    }

    @Override
    public Product produceSystem() {
        return new MicrosoftSystemProduct();
    }

    
}

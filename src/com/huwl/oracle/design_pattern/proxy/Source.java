package com.huwl.oracle.design_pattern.proxy;

class Source implements Sourceable{

    @Override
    public void method() {
        System.out.println("the original method!");  
    }
    
}

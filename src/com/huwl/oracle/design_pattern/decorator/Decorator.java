
package com.huwl.oracle.design_pattern.decorator;

class Decorator implements Sourceable{
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source=source;
    }
    

    @Override
    public void method() {
        System.out.println("do something");  
        source.method();  
    }
    
    
}

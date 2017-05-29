
package com.huwl.oracle.design_pattern.factory_method;

public class SmsSenderFactory implements Provider{

    @Override
    public Sender produce() {
       return new SmsSender();
    }
    
}

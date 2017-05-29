
package com.huwl.oracle.design_pattern.builder;

import com.huwl.oracle.design_pattern.common_simple_factory.*;

class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("this is sms sender!");  
    }
    
}

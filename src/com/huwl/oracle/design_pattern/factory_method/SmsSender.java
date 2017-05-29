
package com.huwl.oracle.design_pattern.factory_method;

import com.huwl.oracle.design_pattern.multi_static_simple_factory.*;
import com.huwl.oracle.design_pattern.multi_simple_factory.*;
import com.huwl.oracle.design_pattern.common_simple_factory.*;

class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("this is sms sender!");  
    }
    
}


package com.huwl.oracle.design_pattern.multi_static_simple_factory;

import com.huwl.oracle.design_pattern.multi_simple_factory.*;

class Test {
    public static  void  main(String[] args){
        System.out.println(SenderFactory.produceMailSender());
        System.out.println(SenderFactory.produceSmsSender());
    }
}

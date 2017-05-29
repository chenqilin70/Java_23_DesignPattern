
package com.huwl.oracle.design_pattern.factory_method;

import com.huwl.oracle.design_pattern.multi_static_simple_factory.*;
import com.huwl.oracle.design_pattern.multi_simple_factory.*;

class Test {
    public static  void  main(String[] args){
        new SmsSenderFactory().produce().send();
    }
}

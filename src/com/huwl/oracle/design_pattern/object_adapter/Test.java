
package com.huwl.oracle.design_pattern.object_adapter;

import com.huwl.oracle.design_pattern.class_adapter.*;

public class Test {
    public static void main(String[] args) {
        Targetable targetable=new Wrapper(new Source());
        targetable.method1();
        targetable.method2();
    }
}

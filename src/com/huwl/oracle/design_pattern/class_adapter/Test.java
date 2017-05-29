
package com.huwl.oracle.design_pattern.class_adapter;

public class Test {
    public static void main(String[] args) {
        Targetable targetable=new Adapter();
        targetable.method1();
        targetable.method2();
    }
}

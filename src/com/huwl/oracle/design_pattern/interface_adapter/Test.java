package com.huwl.oracle.design_pattern.interface_adapter;

public class Test {
    public static void main(String[] args) {
        SourceSub1 sub1=new SourceSub1();
        sub1.method1();
        SourceSub2 sub2=new SourceSub2();
        sub2.method2();
    }
}

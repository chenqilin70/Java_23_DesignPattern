
package com.huwl.oracle.design_pattern.builder;

public class Test {
    public static void main(String[] args) {
        Builder builder=new Builder();
        builder.produceMailSender(10);
        System.out.println(builder.getList());
    }
}

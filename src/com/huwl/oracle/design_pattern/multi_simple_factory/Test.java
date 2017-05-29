
package com.huwl.oracle.design_pattern.multi_simple_factory;

class Test {
    public static  void  main(String[] args){
        System.out.println(new SenderFactory().produceMailSender());
        System.out.println(new SenderFactory().produceSmsSender());
    }
}

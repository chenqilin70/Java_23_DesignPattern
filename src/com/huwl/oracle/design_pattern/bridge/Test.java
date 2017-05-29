/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.bridge;

/**
 *
 * @author aierxuan
 */
public class Test {
    public static void main(String[] args) {
         Bridge bridge = new MyBridge();  
          
        /*调用第一个对象*/  
        Sourceable source1 = new SourceSub1();  
        bridge.setSource(source1);  
        bridge.method();  
          
        /*调用第二个对象*/  
        Sourceable source2 = new SourceSub2();  
        bridge.setSource(source2);  
        bridge.method();  
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.chain_of_responsibility;

/**
 *
 * @author aierxuan
 */
public class Test {
    public static void main(String[] args) {
        MyHandler h1=new MyHandler("h1");
        MyHandler h2=new MyHandler("h2");
        MyHandler h3=new MyHandler("h3");
        h1.setHandler(h2);
        h2.setHandler(h3);
        h1.operator();
    }
    
}

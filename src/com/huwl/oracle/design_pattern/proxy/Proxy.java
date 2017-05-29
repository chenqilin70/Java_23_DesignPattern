/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.proxy;

public class Proxy implements Sourceable{
    private Source source;

    public Proxy() {
        this.source=new Source();
    }
    
    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before() {
        System.out.println("before method is running……");
    }

    private void after() {
        System.out.println("after method is running");
    }
    
}

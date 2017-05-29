/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.object_adapter;

import com.huwl.oracle.design_pattern.class_adapter.*;

/**
 *
 * @author aierxuan
 */
public class Wrapper implements Targetable{
    private Source source;
    public Wrapper(Source source) {
        this.source=source;
    }
    
    @Override
    public void method2() {
       System.out.println("this is the targetable method!");  
    }

    @Override
    public void method1() {
        source.method1();
    }
    
    
}

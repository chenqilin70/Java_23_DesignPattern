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
public class SourceSub1 implements Sourceable{

    @Override
    public void method() {
        System.out.println("this is sub1");
    }
    
}

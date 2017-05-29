/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.observer;

/**
 *
 * @author aierxuan
 */
public class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObserver();;
    }
    
}

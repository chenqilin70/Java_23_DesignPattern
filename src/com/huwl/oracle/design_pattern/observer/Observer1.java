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
class Observer1 implements Observer {  
  
    @Override  
    public void update() {  
        System.out.println("observer1 has received!");  
    }  
}  

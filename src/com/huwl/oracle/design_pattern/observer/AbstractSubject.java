/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author aierxuan
 */
abstract  class AbstractSubject  implements Subject {
    private Vector<Observer> vector = new Vector<Observer>();  
     @Override  
    public void add(Observer observer) {  
        vector.add(observer);  
    }  
  
    @Override  
    public void del(Observer observer) {  
        vector.remove(observer);  
    }  

    @Override
    public void notifyObserver(){
        Enumeration<Observer> enumo=vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
    
}

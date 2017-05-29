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
interface Subject {
    public void add(Observer observer);
    public void del(Observer observer);
     /*通知所有的观察者*/  
    public void notifyObserver();
    public void operation();
}

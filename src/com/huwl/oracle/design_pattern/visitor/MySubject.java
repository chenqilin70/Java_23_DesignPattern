/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.visitor;

/**
 *
 * @author aierxuan
 */
public class MySubject   implements Subject {

    @Override
    public void accept(Visitor visitor) {
         visitor.visit(this);  
    }

    @Override
    public String getSubject() {
        return "love";  
    }
    
}

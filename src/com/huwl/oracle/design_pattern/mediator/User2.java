/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.mediator;

/**
 *
 * @author aierxuan
 */
class User2  extends User {
 public User2(Mediator mediator){  
        super(mediator);  
    }  
    @Override
    public void work() {
        System.out.println("user2 exe!");  
    }
    
}

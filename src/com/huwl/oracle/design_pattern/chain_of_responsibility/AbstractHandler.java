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
abstract class AbstractHandler {
    private  Handler handler;
    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
   
}

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
class MyHandler extends AbstractHandler implements Handler{
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }
    

    @Override
    public void operator() {
        System.err.println(name+" deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
    
}

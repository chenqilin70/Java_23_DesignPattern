/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.command;

/**
 *
 * @author aierxuan
 */
class MyCommand implements Command{
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void exe() {
        receiver.action();
    }
}

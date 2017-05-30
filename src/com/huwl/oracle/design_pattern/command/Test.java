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
public class Test {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command cmd=new MyCommand(receiver);
        Invoker invoker=new Invoker(cmd);
        invoker.action();
    }
}

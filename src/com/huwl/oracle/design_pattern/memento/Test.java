/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.memento;

/**
 *
 * @author aierxuan
 */
class Test {
    public static void main(String[] args) {
        Original ori=new Original("kylin");
        Storage sto=new Storage(ori.createMemento());
        System.out.println(ori.getValue());
        ori.setValue("chen");
        System.out.println(ori.getValue());
        ori.restoreMemento(sto.getMemento());
        System.out.println(ori.getValue());
    }
}

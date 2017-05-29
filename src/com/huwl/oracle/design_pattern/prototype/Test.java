/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aierxuan
 */
public class Test {
    public static void main(String[] args) {
        Prototype prototype=new Prototype();
        System.out.println(prototype.getStu());
        try {
            Prototype clone=prototype.deepClonePrototype();
            System.out.println(clone.getStu());
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

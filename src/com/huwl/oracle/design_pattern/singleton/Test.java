/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.singleton;

/**
 *
 * @author aierxuan
 */
public class Test {
    public static void main(String[] args) {
       for(int i=0;i<10;i++){
           new Thread(){
               @Override
               public void run() {
                   System.out.println(IdlerSingleton.getInstance());
               }
               
           }.start();
       }
       
         System.out.println(HungryMan.getInstance());
         System.out.println(HungryMan.getInstance());
         System.out.println(HungryMan.getInstance());
         System.out.println(HungryMan.getInstance());
    }
}

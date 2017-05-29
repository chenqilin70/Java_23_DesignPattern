/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.strategy;

/**
 *
 * @author aierxuan
 */
public class Test {
    public static void main(String[] args) {
        String exp="2+3";
        ICalculator cal=new Plus();
        int result=cal.caculate(exp);
        System.out.print(result);
    }
    
}

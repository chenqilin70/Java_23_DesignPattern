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
class Plus extends AbstractCalculator implements ICalculator{

    @Override
    public int caculate(String exp) {
        int arrayInt[]=split(exp, "\\+");
        return arrayInt[0]+arrayInt[1];
    }
    
}

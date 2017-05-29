/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.abstract_factory;

/**
 *
 * @author aierxuan
 */
public class OracleSystemProduct extends OracleProduct{

    @Override
    public void showName() {
       System.out.println(BRAND+"_system");
    }
    
}

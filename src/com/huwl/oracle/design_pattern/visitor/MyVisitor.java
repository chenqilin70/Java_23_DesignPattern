/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.visitor;

/**
 *
 * @author aierxuan
 */
class MyVisitor  implements Visitor  {

    @Override
    public void visit(Subject sub) {
        System.out.print("visit the subject："+sub.getSubject());
    }
    
}

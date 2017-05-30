/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.iterator;

/**
 *
 * @author aierxuan
 */
public class MyCollection implements Collection{
    public String string[]={"A","B","C","D","E","F","G"};
    @Override
    public Iterator iterator() {
      return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
      return string[i];
    }

    @Override
    public int size() {
       return string.length;
    }
    
}

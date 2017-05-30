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
class MyIterator implements Iterator{
    private Collection collection;
    private int pos=-1;

    public MyIterator(Collection collection) {
        this.collection=collection;
    }
    
    @Override
    public Object previous() {
        if(pos>0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object first() {
        pos=0;
        return collection.get(pos);
    }
    
}

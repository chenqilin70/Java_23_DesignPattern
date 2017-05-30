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
class Original {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }
    public Memento createMemento(){
        return new Memento(value);
    }
    public void restoreMemento(Memento memento){
        this.value=memento.getValue();
    }
    
    
}

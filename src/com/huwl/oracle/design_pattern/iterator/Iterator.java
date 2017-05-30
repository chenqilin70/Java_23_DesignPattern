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
interface Iterator {
    public Object previous();
    public Object next();
    public boolean hasNext();
    public Object first();
}

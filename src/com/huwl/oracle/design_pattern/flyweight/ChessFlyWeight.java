/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.flyweight;

/**
 *
 * @author aierxuan
 */
interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}

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
class ConcreteChess implements ChessFlyWeight{
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public ConcreteChess(String color) {
        this.color=color;
    }
    

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+c.getX()+"--"+c.getY());
    }
    
}

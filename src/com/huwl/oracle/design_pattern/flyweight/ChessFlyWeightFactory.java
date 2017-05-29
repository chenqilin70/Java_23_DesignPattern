/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aierxuan
 */
public class ChessFlyWeightFactory {
    private static Map<String,ChessFlyWeight> map=new HashMap<>();
    public ChessFlyWeight getChess(String color){
        if(map.get(color)!=null){
            return map.get(color);
        }else{
            ChessFlyWeight cfw=new ConcreteChess(color);
            map.put(color, cfw);
            return cfw;
        }
    }
    
}

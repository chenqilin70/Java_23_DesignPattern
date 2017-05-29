/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author aierxuan
 */
class Prototype implements Cloneable,Serializable{
    private Student stu=new Student("kylin",12, true);
    private int testInt=12;
    /*
        浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
        深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制
                      进行了完全彻底的复制，而浅复制不彻底。
    */
    
    /*浅复制*/
    public Prototype shallowClonePrototype() throws Exception {
        Prototype proto=(Prototype) super.clone();
        return proto;
    }
      /*深复制*/
    public Prototype deepClonePrototype() throws Exception{
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutput oop=new ObjectOutputStream(bos);
        oop.writeObject(this);
        
        ByteArrayInputStream bai=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bai);
        return (Prototype) ois.readObject();
    }

    public Student getStu() {
        return stu;
    }

    public int getTestInt() {
        return testInt;
    }
    
}

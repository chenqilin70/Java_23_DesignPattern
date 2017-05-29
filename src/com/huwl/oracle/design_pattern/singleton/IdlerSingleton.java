package com.huwl.oracle.design_pattern.singleton;

public class IdlerSingleton {
    private static IdlerSingleton idlerSingleton=null;
    private IdlerSingleton() {}
    public static IdlerSingleton getInstance(){
        if(idlerSingleton==null){
            synchronized(IdlerSingleton.class){
                if(idlerSingleton==null){
                    idlerSingleton=new IdlerSingleton();
                }
            }
        }
        return idlerSingleton;
    }
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return idlerSingleton;  
    } 
}

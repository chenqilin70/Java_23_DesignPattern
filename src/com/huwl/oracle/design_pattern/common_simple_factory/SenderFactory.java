
package com.huwl.oracle.design_pattern.common_simple_factory;

/**
 * 简单工厂模式不属于23中涉及模式
 * 简单工厂一般分为：普通简单工厂、多方法简单工厂、静态方法简单工厂
 * @author aierxuan
 */
//普通简单工厂
class SenderFactory {
        public static final int MAIL=1;
        public static final int SMS=2;
    
        public Sender produce(int type){
            if(type==MAIL){
                return new MailSender();
            }else if(type==SMS){
                return  new SmsSender();
            }else{
                System.out.println("没有这种类型的发送器");
            }
            return null;
        }
}

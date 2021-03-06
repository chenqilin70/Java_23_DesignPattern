
package com.huwl.oracle.design_pattern.multi_simple_factory;


/**
 * 简单工厂模式不属于23中涉及模式
 * 简单工厂一般分为：普通简单工厂、多方法简单工厂、静态方法简单工厂
 * @author aierxuan
 */
//多个方法简单工厂
public class SenderFactory {
       public SmsSender produceSmsSender(){
           return new SmsSender();
       }
       public MailSender produceMailSender(){
           return new MailSender();
       }
}

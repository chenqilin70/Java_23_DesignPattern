/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.factory_method;

/**
 *
 * @author aierxuan
 */
public class MailSenderFactory implements  Provider{

    @Override
    public Sender produce() {
      return new MailSender();
    }
    
}

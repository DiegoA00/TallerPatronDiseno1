/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienarau.taller;

/**
 *
 * @author arauj
 */
public class VirtualAtention {
    private WebSubsystem web;
    private MobileSubsystem mobile;
    private PhoneSubsystem phone;
    
    public void makeWebTransaction(){
        web = new WebSubsystem();
        web.processPurchase();
    }
    
    public void makeMobileTransaction(){
        mobile = new MobileSubsystem();
        mobile.processPurchase();
    }
    
    public void makePhoneTransaction(){
        phone = new PhoneSubsystem();
        phone.processPurchase();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienarau.taller;

/**
 *
 * @author arauj
 */
public class Client {
    
    public static void main(String[] args) {
        
        VirtualAtention virtualAtention = new VirtualAtention();
        
        //Este cliente usa el servicio móvil
        System.out.println("Cliente 1");
        virtualAtention.makeMobileTransaction();
        
        //Otro cliente usa el servicio web
        System.out.println("Cliente 2");
        virtualAtention.makeWebTransaction();
        
        //Otro cliente usa el servicio telefónico
        System.out.println("Cliente 3");
        virtualAtention.makePhoneTransaction();
    }
    
}

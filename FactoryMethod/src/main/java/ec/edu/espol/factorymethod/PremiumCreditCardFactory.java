/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author USER
 */
public class PremiumCreditCardFactory extends CreditCardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new PremiumCreditCard(50.0, 5000.0);
    }
} 

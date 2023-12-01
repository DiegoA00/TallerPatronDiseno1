/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author USER
 */
public class VipCreditCardFactory extends CreditCardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new VipCreditCard(100.0, 10000.0);
    }
}

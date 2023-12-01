/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author USER
 */
public class BasicCreditCardFactory extends CreditCardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new BasicCreditCard(20.0, 1000.0);
    }
}

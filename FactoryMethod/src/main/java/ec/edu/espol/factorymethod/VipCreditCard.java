/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author USER
 */
public class VipCreditCard implements CreditCard {
    private double annualCost;
    private double creditLimit;

    public VipCreditCard(double annualCost, double creditLimit) {
        this.annualCost = annualCost;
        this.creditLimit = creditLimit;
    }

    @Override
    public double getAnnualCost() {
        return annualCost;
    }

    @Override
    public double getCreditLimit() {
        return creditLimit;
    }
}

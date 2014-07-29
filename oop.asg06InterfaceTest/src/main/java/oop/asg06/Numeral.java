/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.asg06;
/**
 *
 * @author Sony
 */
public class Numeral implements Expression {
    
    //value variable contain value of expression as type int
    private int value;
    
    //constructor with a argument type int
    public Numeral(int theValue) {
        value = theValue;
    }
    
    //constructor copy from Numeral object
    public Numeral(Numeral numeral) {
        value = numeral.value;
    }
    
    //method set the value for Numeral
    public void setValue(int theValue) {
        value = theValue;
    }
    
    //override method evalute
    public int evaluate() {
        return value;
    }
    
    //override method toString()
    public String toString() {
        return String.format("%d", value);
    }
    
    //override method clone()
    public Numeral clone() {
        return new Numeral(this);
    }
}

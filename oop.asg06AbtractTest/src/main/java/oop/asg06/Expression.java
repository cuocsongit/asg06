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
public abstract class Expression {

    //return type String for expression
    public abstract String toString();
    
    //return value of expression
    public abstract int evaluate();
    
    //method clone() 
    public abstract Expression clone();
}

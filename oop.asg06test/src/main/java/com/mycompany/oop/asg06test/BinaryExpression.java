/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.oop.asg06test;

/**
 *
 * @author Sony
 */
public class BinaryExpression extends Expression{
  

    //override method toString()
    public String toString() {
        return String.format("( %s, %s )", left().toString(), 
                right().toString());
    }
    
    //method left() retun left expression
    public Expression left() {
        return null;
    }
    
    //method right() return right expression
     public Expression right() {
        return null;
    }
 
}

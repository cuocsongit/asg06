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
public abstract class BinaryExpression extends Expression{
  
    //method left() retun left expression
    public abstract Expression left();
    
    //method right() return right expression
     public abstract Expression right();
}

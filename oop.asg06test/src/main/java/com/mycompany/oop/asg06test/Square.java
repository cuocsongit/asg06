/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.oop.asg06test;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

/**
 *
 * @author Sony
 */
public class Square extends Expression{
    Expression expression;
    
    //contructor with a agurment type expression
    public Square(Expression theExpression) {
        expression = theExpression;
    }
    
    //constructor copy from a Square object
    public Square(Square square) {
        expression = square.expression;
    }
    
    //override method toString()
    public String toString() {
        return String.format("%s^2",expression.toString());
    }
    
    //override method evalute()
    public int evaluate() {
        return (int)power(expression.evaluate(), 2);
    }
    
}
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
public class Addition extends BinaryExpression{
    
    private Expression left, right;
    //constructor with two agurments expression
    public Addition(Expression left, Expression right) {
        this.left = left.clone();
        this.right = right.clone();
    }
    
    //constructor copy from Addition object
    public Addition(Addition addition) {
        this.left = addition.left.clone();
        this.right = addition.right.clone();
    }
    
//override method evaluate()
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
    
    //override method toString()
    public String toString() {
        return String.format("(%s + %s)", left.toString(), right.toString());
    }
    
    //override method left()
    public Expression left() {
        return left;
    }
    
     //override method left()
    public Expression right() {
        return right;
    }
    
    //override method clone()
    public Addition clone() {
        return new Addition(this);
    }
}

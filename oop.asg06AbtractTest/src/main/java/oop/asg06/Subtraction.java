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
public class Subtraction extends BinaryExpression{
     private Expression left, right;
    //constructor with two agurments expression
    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    //contructor copy from Subtraction object
    public Subtraction(Subtraction subtraction) {
        this.left = subtraction.left.clone();
        this.right = subtraction.right.clone();

    }
    
//override method evaluate()
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
    
    //override method toString()
    public String toString() {
        return String.format("(%s - %s)", left.toString(), right.toString());
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
    public Subtraction clone() {
        return new Subtraction(this);
    }
}

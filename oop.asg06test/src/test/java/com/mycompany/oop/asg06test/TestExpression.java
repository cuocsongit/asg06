package com.mycompany.oop.asg06test;

import com.mycompany.oop.asg06test.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: chauttm
 * Date: 10/19/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestExpression {
    @Test
    public void testNumeralEvaluate() {
        Expression two = new Numeral(2);
        assertEquals(2, two.evaluate());
    }

    @Test
    public void testNumeralToString() {
        Expression two = new Numeral(2);
        assertEquals("2", two.toString());
    }

    @Test
    public void testSquareEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals(4, twoSquare.evaluate());
    }

    @Test
    public void testSquareToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals("2^2", twoSquare.toString());
    }

    @Test
    public void testAdditionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals(6, twoPlusTwoSquare.evaluate());
    }
    
    @Test
    public void testAdditionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals("(2 + 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testAdditionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Addition(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());
    }
    
    @Test
    public void testSubtractionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoSubtractTwoSquare = new Subtraction(two, twoSquare);
        assertEquals("(2 - 2^2)", twoSubtractTwoSquare.toString());
    }

    @Test
    public void testSubtractionParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Subtraction(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 - 1)^2", theBigSquare.toString());
    }
    
    @Test
    public void testMuliplicationToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoMultiplyTwoSquare = new Multiplication(two, twoSquare);
        assertEquals("(2 * 2^2)", twoMultiplyTwoSquare.toString());
    }

    @Test
    public void testMuliplicationWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Multiplication(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 * 1)^2", theBigSquare.toString());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import lambda.parser.*;

/**
 *
 * @author Masilo
 */
public class Driver {
    public static void main(String[] args) {
    System.out.println(LambdaTermParser.parse("Y = x;").toString());
    /*System.out.println(parse("\\ x . x"));
    System.out.println(parse("x y"));
    System.out.println(parse("\\z.x z"));
    System.out.println(parse("\\x.(y)y(\\z.x z)"));*/
  }
}

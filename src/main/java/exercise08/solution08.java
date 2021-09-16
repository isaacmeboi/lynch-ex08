/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise08;

import java.util.Scanner;

class Pizza {
    int ppl;
    int p;
    int sl;

    public void scn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many party people? ");
        this.ppl = sc.nextInt();

        System.out.print("How many silly pizzas do you have? ");
        this.p = sc.nextInt();

        System.out.print("How many goofy slices per pizza? ");
        this.sl = sc.nextInt();
    }

    public void prt() {
        int t = sl*p;

        System.out.println(ppl +" party people with "+ p +" pizzas ("+ t +" slices)");

        if(t/ppl==1) //print statements for each person getting one slice
        {
            System.out.println("Each person gets "+ t/ppl +" piece of the silly pizza.");
            System.out.println("There are "+ (t%ppl) +" leftover pieces, for later!");
        }

        else //print statements for more than one slice each
        {
            System.out.println("Each person gets "+ t/ppl+" pieces of the silly pizza.");
            System.out.println("There are "+ (t%ppl) +" leftover pieces, for later!");
        }
    }
}
public class solution08 {
        public static void main(String[] args) {
            Pizza ca = new Pizza();
            ca.scn();
            ca.prt();

        }
    }

/* winds in the east... anywho, first we import the scanner function. the a class titled
pizza is created which will store the ints  for people, pizzas, and slices of pizza.
there are also two void functions inside the class. one is "scn" which scans in the
data the user gives and the "prt" which does the math and prints out the solutions.
the main function just calls these two public voids to run the program.
 */
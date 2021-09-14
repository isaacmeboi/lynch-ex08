/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise08;

import java.util.*;

public class solution08 {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print("How many party people? ");
            int ppl = s.nextInt();

            System.out.print("How many silly pizzas do you have? ");
            int p = s.nextInt(); //pizza read

            System.out.print("How many goofy slices per pizza? ");
            int sl = s.nextInt(); //slice read

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

/* psuedocode: the first that happens in this code is that we import java.util.*, after that we make an
instance of the scanner function to be used to read in the users inputs. then, the number of people, pizzas
and slices each pizza serves are scanned and stored. the number of total slices is found by multiplying
the number of pizzas by the number of slices. slices is stored in an int called "sl", pizza in one
called "p", total slices in "t", and the amount of people in "ppl". the statement relays the information
given back to the user and then does one of two things with the help of an if/else statement. if the total
number of slices divided by the number of total people equals one, meaning each person only get one slice,
then the code prints out "piece". if it's more than 1, then "pieces" is printed out instead.
 */
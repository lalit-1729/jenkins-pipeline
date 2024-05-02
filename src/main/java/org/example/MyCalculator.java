package org.example;

import static java.lang.System.*;

public class MyCalculator {

    int sum(int a, int b){
        return a+b;
    }

    int diff(int a, int b){
        return a-b;
    }

    int div(int a, int b){
        return a/b;
    }

    int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        out.println("The sum of " + 10 + " & " + 20 + " is " + myCalculator.sum(10, 20));
        out.println("The div of " + 10 + " & " + 20 + " is " + myCalculator.div(10, 20));
        out.println("The diff of " + 10 + " & " + 20 + " is " + myCalculator.diff(10, 20));
        out.println("The mult of " + 10 + " & " + 20 + " is " + myCalculator.multiply(10, 20));
    }
}
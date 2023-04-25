package org;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value : ");
        int a = sc.nextInt();
        System.out.println("enter B value : ");
        int b = sc.nextInt();
        float sum = a+b;
        float average = (a+b)/2;
        System.out.println("sum of the numbers "+a+" and "+ b+" = "+sum);
        System.out.println("average of two numbers "+a+" and "+b+" = "+average);
    }
}

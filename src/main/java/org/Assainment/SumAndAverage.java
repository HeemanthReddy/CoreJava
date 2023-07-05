package org.Assainment;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter A Value :");
        int a = sc.nextInt();
        System.out.printf("Enter B Value :");
        int b = sc.nextInt();
        float sum = a+b;
        float average = (a+b)/2;
        System.out.println("Sum of the Numbers"+a+"And"+b+"="+sum);
        System.out.println("Average of Numbers"+a+"And"+b+"="+average);
    }
}

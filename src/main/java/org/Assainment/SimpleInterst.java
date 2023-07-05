package org.Assainment;

import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle Amount");
        double p = sc.nextInt();
        System.out.println("Enter Rate of Interst");
        double r = sc.nextFloat();
        System.out.println("Enter Tenure");
        double t = sc.nextFloat();

        double amount = (p * t * r)/100;
        System.out.println("Simple Interst ="+amount);
    }
}

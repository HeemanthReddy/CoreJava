package org.Assainment;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        System.out.printf("Enater a Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float cube = num * num * num;
        System.out.println("Cube of" +num+ " is " +cube);
    }
}

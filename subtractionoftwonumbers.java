package com.subtractionoftwonumbers;

import java.util.Scanner;

public class subtractionoftwonumbers {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a value");
        a= sc.nextInt();
        System.out.println("Enter b value");
        b=sc.nextInt();
        c=a-b;
        System.out.println("subtraction of two numbers is:"+c);
    }
}

package com;

import java.util.Scanner;

public class down_traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
//inner loop
        for (int i= n; i>=1 ; i--)
        {
//outer loop
            for (int j=1; j<=i; j++)
            {
//prints star and space
                System.out.print("*");
            }
//throws the cursor in the next line after printing each line
            System.out.println();
        }
    }
}

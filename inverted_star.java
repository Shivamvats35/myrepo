package com;

import java.util.Scanner;

public class inverted_star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n-i;k<=n;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

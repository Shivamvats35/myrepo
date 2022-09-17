package com;

import java.util.Scanner;

public class print_all_even_number_upto_N {
    public static void main(String[] args) {
        int k=2;
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();;
        if(N>0)
        {
            for(int i=0;i<N/2;i++)
            {
                System.out.println(k);
                k=k+2;
            }

        }
    }
}

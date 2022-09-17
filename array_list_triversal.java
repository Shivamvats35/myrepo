package com;

import java.util.ArrayList;
import java.util.Scanner;

public class array_list_triversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int k =0;k<n;k++)
        {
            al.add(arr[k]);
        }
        for(int j=0;j<al.size();j++)
        {
            System.out.print(al.get(j)+" ");
        }
    }
}

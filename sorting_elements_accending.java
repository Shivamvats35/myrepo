package com;

import java.util.Arrays;
import java.util.Scanner;

public class sorting_elements_accending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements you want to enter in array: ");
        int no=sc.nextInt();
        int[]arr=new int[no];
        System.out.println("Enter "+no+" of elements");
        for(int i=0;i<no;i++)
            arr[i]=sc.nextInt();
        System.out.println("Array before sorting"+ Arrays.toString(arr));
        sortTheArray(arr,no);
    }
    static void sortTheArray(int []arr,int no){
        int temp;
        for(int i=0;i<no;i++){
            for(int j=i+1;j<no;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array after sorting"+Arrays.toString(arr));
    }
}

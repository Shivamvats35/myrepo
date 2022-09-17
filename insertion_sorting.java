package com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class insertion_sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of element you want to add in array:  ");
        int n=sc.nextInt();
        System.out.println("Enter elements in array: ");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting: "+ Arrays.toString(arr));
        insertionSort(arr,n);
        System.out.println("array after sorting: "+Arrays.toString(arr));
    }
    public static void insertionSort(int[]arr,int n){
        for(int i=1;i<n;i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}

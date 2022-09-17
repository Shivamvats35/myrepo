package com;

import java.util.Arrays;
import java.util.Scanner;

public class adding_element_to_array_at_certian_position {
    public static void main(String[] args) {
        int arr[]={45,25,85,74,96,38};
        int n=arr.length;
        int []newarr=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the index of the element");
        int index=sc.nextInt();
        System.out.println("enter the element");
        int value=sc.nextInt();
        System.out.println("array before adding new element"+ Arrays.toString(arr));
        for(int i=0,j=0;i<newarr.length;i++){
            if(index!=i){
                //passing array value to new array
                newarr[i]=arr[j];
                j++;
            }
            else{
                //passing new value to array
                newarr[i]=value;
            }
        }
        System.out.println("new arrAY"+Arrays.toString(newarr));
    }
}

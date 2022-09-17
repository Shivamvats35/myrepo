package com;

public class duplicate_element_in_array {
    public static void main(String[] args) {
        int arr[]={2,43,3,23,23,2,3,23,33,23,2,5,3,4,5};
        int n=arr.length;
        duplicateValue(arr,n);
    }
    static void duplicateValue(int []arr,int n)
    {
        for(int i=0;i<n-1;i++){
            int count=0;
            for(int j=i+1;j<n-1;j++){
                if((arr[i]==arr[j]) && (i!=j)) {
                    count++;
                    System.out.println("the duplicate element is"+arr[i]);
                }
            }
            System.out.println("the frequency of number is"+count);
        }
    }
}

package com;

import java.util.Scanner;

public class cal_pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        int count=0;
        int result = calPower(num,count);
        System.out.println(result);
    }

    public static int calPower(int number, int count) {
        if (number % 2 == 0) {
            if(count<3){
            return number * calPower(number,count+1);
            }
        }
        else if(number==0){
            number=0;
        }
        else if(number==1){
            number=1;
        }
        else {
            if(count<2){
                return number * calPower(number,count+1);
            }
        }
    return number;
    }
}

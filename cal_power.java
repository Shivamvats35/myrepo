package com;

import java.util.Scanner;

public class cal_power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int num=sc.nextInt();
        System.out.println("enter power: ");
        int power=sc.nextInt();
        System.out.println(calPower(num,power));
    }
    public static int calPower(int num,int power){
        int result=1;
        for(int i=1;i<power;i++){
            result=num*num;
        }
        return result;
    }
}


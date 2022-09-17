package com;
import java.util.Arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;

public class java_new_project {
    public static void main(String[] args) {
        System.out.println("hellow world");
        String name="shivam";
        int age = 30;
        System.out.println(name +" "+ age);
        String ankita="shviam";
        ankita=name;
        System.out.println(ankita);//string is immutable in java
        System.out.println(name.length());
        String friend = new String("shiva,");
        String passout = new String("sam");
        System.out.println(name.charAt(0));
        String name1=name.replace('a','b');
        System.out.println(name1);
        String name3= "there is no world like your world";
        System.out.println(name3.substring(0,8));

        //ARRAY
        int[] marks=new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=79;
        System.out.println(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}

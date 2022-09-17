package com;

public class Main {
    static int x=5;

    public static void main(String[] args) {
        Main myObj=new Main();
        System.out.println(x);

        myObj.star();
    }
    public void star ()
    {
        System.out.println(x);
    }

}

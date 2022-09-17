import java.util.Scanner;

public class cal_pow_using_reccursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int num=sc.nextInt();
        System.out.println("enter power: ");
        int power=sc.nextInt();
        System.out.println(calPowerr(num,power));
    }
    public static int calPowerr(int num,int pow){
        if(pow>0)
            return num*calPowerr(num,pow-1);
        else
            return 1;
    }
}

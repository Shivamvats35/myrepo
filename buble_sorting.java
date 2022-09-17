import java.util.Arrays;
import java.util.Scanner;

public class buble_sorting {
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
        int[] result =bubleSort(arr,n);
        System.out.println(Arrays.toString(result));
    }
    public static int[] bubleSort(int []arr,int n){
        for(int i=0;i<n-1;i++){
            int count=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            if(count==0)
                break;
        }
        return arr;
    }
}

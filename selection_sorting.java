import java.util.Arrays;
import java.util.Scanner;

public class selection_sorting {
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
        selection_sorting(arr,n);
        System.out.println("array after sorting: "+Arrays.toString(arr));
    }
    public static void selection_sorting(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}

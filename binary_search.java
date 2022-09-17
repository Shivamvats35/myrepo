import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        System.out.println("Enter no of elements you want to input in array: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter data what you want to search: ");
        int data=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("sorted array: ");
        String a=Arrays.toString(arr);
        System.out.println(a);
        int result=bubleSort(arr, n,data);
        if(result!=-1)
            System.out.println("Element found at index: "+result);
        else
            System.out.println("Element not found");
    }
    public static int bubleSort(int[]arr, int n, int data){
        int l=0;int r=n-1;
            while(l<r){
                int mid=(l+r)/2;
                if(data==arr[mid])
                    return mid;
                else if(data<arr[mid])
                    r=mid-1;
                else
                    l=mid+1;
            }
            return -1;
    }
}

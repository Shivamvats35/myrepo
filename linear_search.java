import java.util.Scanner;

public class linear_search {
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
        int result=linearSearch(arr,n,data);
        System.out.println("Element found at index: "+result);
    }
    public static int linearSearch(int []arr, int n, int data){
        int i=0;
        for(i=0;i<n;i++){
           if(arr[i]==data){
               return i;
           }
           else{
               System.out.println("Element not found");
                break;
           }
        }
        return i;
    }
}

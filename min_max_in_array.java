public class min_max_in_array {
    public static void main(String[] args) {
        int arr[]={2,4,435,43,23,523,423,124,23,4,234};
        int n=arr.length;
        findMaxAndMin(arr,n);
    }
    static void findMaxAndMin(int []arr,int n)
    {
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}

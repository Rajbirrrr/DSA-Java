import java.util.*;
class prefixsum{
    
    
    public static void prefix_sum(int arr[]){
        int i,j;
        int prefix[]= new int[arr.length];
        int max = Integer.MIN_VALUE;
        int sum=0;

        prefix[0]=arr[0];

        //creating prefix array
        for(i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+arr[i];
        }

        for(i=0; i<prefix.length ; i++){

            int start= i;
            for(j=i ; j<prefix.length ; j++){
                int end= j;
                sum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println("Maximum sum of subarray is: " + max);

    }
    
    
    
    public static void main(String args[]){
        int arr[]= {1,-2,6,-1,3};
        prefix_sum(arr);
    }
}
import java.util.*;
class ij{
    
    
    public static void prefix_sum(int arr[]){
        int i,j;
        
        int max = Integer.MIN_VALUE;
        int sum=0;
        int temp=0;

        for(i=0; i<arr.length ; i++){
            sum=0;

            int start= i;
            for(j=i ; j<arr.length ; j++){
                temp= arr[j];
                sum = sum+temp;
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
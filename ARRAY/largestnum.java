import java.util.*;
class largestnum{
    
    public static int large(int arr[]){
        int i;
        //sabse chota le for comparison takisab aa paye
        int max= Integer.MIN_VALUE;
        for(i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }
        }
        return max;
    }
    
    
    public static void main(String args[]){

        int arr[]= {2,4,2,6,7,8,10,2};
        int result = large(arr);
        System.out.println("The largest element is: " + result);
        
    }
}
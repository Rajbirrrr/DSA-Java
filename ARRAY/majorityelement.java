import java.util.*;
class majorityelement{
    
    public static void majority(int arr[]){

        int n = arr.length;
        
        int freq_arr[]= new int[10];

        for(int i=0 ;i<n ; i++){
            freq_arr[arr[i]]++;
        }

        for(int j=0 ; j<freq_arr.length ; j++){
            if(freq_arr[j]>n/2){
                System.out.println(j);
            }
        }
    }
            
    
    
    public static void main(String args[]){
        int arr[]= {1,1,2,2,3,2,2,2};
        majority(arr);
    }
}
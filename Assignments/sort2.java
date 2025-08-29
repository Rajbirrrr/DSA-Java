import java.util.*;
class sort2{
    
    public static void insertion(int arr[]){

        for(int i=1 ; i<arr.length ; i++){
            int currval= arr[i];
            int prev = i-1;

            //finding position to insert 
            while(prev>=0 && currval>arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insert
            arr[prev+1]= currval;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String args[]){

        int arr[] = {2,3,4,1,5,7,1,8,1};
        insertion(arr);
    }
}
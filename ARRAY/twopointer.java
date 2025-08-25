import java.util.*;
class twopointer{
    
    public static void duplicacy(int arr[]){

        int i=arr[0];
        for(int j= 1; j<arr.length ; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr , 0 , i+1)));
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,3,4,5};
        duplicacy(arr);
    }
}
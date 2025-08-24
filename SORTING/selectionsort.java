import java.util.Arrays;
class selectionsort{
     
     public static void selection(int arr[]){

        int n= arr.length;
        for(int i=0; i<n-1 ; i++){

            int minpos=i;
            for(int j=i+1; j<n ; j++){
                if(arr[j]<arr[minpos]){
                    minpos= j;
                }
            }

            //outerloop e swap
            int temp=arr[minpos];
            arr[minpos]= arr[i];
            arr[i]= temp;
        }

        System.out.println(Arrays.toString(arr));
     }
     public static void main(String args[]){
        int arr[] = {5,4,1,3,2};

        selection(arr);
     }
}
import java.util.Arrays;
class bubblesort{
    
    public static void bubble(int arr[]){

        int n = arr.length;//5
        for(int i=0; i<n-1 ; i++){//turn no. (3)

            boolean swap= false;
            for(int j=0 ; j<n-1-i ; j++){
                
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

                swap=true;
                
            }


            if(!swap) break;  //reduces complexity for already sorted array.
        } 
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        bubble(arr);
    }
}
class sort1{
    
    public static void bubble(int arr[]){

        //counts
        for(int i=0 ;i<arr.length-1 ; i++){
            
            for(int j = 0 ;j<arr.length-1-i ;j++){

                //swap
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    
    public static void main(String args[]){
        int arr[] = {2,3,4,1,5,6,1};
        bubble(arr);
        System.out.print("{");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);

            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}
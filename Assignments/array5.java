class array5{
    
    public static void sums(int arr[]){
        int n= arr.length;
        int i,j,k;
        int res= 0;
        boolean find=false;


        System.out.print("The triplets are:" );
        for(i=0; i<n ; i++){
            for(j=i+1; j<n ; j++){
                for(k=j+1; k<n ; k++){

                    if(arr[i]+arr[j]+arr[k] == 0){
                        
                        System.out.println("[" +arr[i]+","+arr[j]+","+arr[k]+"]");
                        find= true;
                    }
                }
            }
        }
        if(!find){
            System.out.println("No triplets found");
        }

        
    }
    
    public static void main(String args[]){
        int arr[] = {-1,0,1,2,-1,4};
        sums(arr);
    }
}
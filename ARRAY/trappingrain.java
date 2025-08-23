class trappingrain{
    
    
    public static int watervolume(int arr[]){
        int i,j;
        int width= 1;
        int waterlevel=0;
        int trappedwater=0;
        int n = arr.length;
        //auxillary arrays
        int leftmax[]= new int[arr.length];
        int rightmax[]= new int[arr.length];
        //leftmax value for every i
        leftmax[0]= arr[0];
        for(i=1;i<n;i++){
            leftmax[i]= Math.max(arr[i],leftmax[i-1]);
        }

        //rightmax value for every i
        rightmax[n-1]=arr[n-1];
        for(i=n-2; i>=0; i--){
            rightmax[i]= Math.max(arr[i],rightmax[i+1]);
        }

        //watertrapped
        for(i=0 ; i<n ; i++){
            waterlevel= Math.min(leftmax[i], rightmax[i]);
            trappedwater += ((waterlevel-arr[i])*width);
        }

        return trappedwater;
    }
    
    
    public static void main(String args[]){

        int arr[]= {4,2,0,6,3,2,5};
        System.out.println("The total voulume of water stored is : " + watervolume(arr));
    }
}
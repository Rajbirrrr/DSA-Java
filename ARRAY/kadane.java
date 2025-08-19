class kadane{
    
    public static void kadanes(int arr[]){
        int i;
        int ms= Integer.MIN_VALUE;;
        int cs= 0;

        for(i=0; i<arr.length ; i++){
            cs = cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }
        System.out.println("maximum sum is:" + ms);
    }
    
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
        }
}
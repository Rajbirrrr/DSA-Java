class matrix2{
    
    public static void secondsum(int arr[][]){

        int sum=0;
        int i=1;
        for(int j=0;j<arr.length;j++){
            sum+= arr[i][j];
            
        }
        System.out.println(sum);
    }
    
    public static void main(String args[]){
        int arr[][]= {{1,4,9},
                    {11,4,3},
                    {2,2,3}};
        secondsum(arr);
    }
}
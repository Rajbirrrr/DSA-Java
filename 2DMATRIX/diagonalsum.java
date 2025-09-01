class diagonalsum{

    //BRUTE-FORCE:- O(n^2)

    public static int diagonal(int arr[][]){
        int sum=0;
        int i,j;
        for(i=0 ; i<arr.length ;i++){
            for(j=0 ; j<arr[0].length; j++){
                if(i==j){
                    sum+=arr[i][j];
                }else if(( i+j) == arr.length-1){
                    sum+=arr[i][j];
                }
            }

            
        }

        return sum;
    }



    //OPTIMIZED:-O(n)
    
    public static int optimal(int arr[][]){
        int i;
        int sum=0;
        for(i=0 ; i<arr.length ; i++){
        sum+= arr[i][i];

        //to remove overlap
        if(i!=arr.length-1-i){
            sum+= arr[i][arr.length-1-i];
        }
    }
    return sum;
}
    

    
    public static void main(String args[]){
        int arr[][]= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

        System.out.println(diagonal(arr));            
        System.out.println(optimal(arr));            
    }
}
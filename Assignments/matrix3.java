class matrix3{
    
    public static void transpose(int arr[][]){
        int rows=arr.length;
        int cols= arr[0].length;

        int result[][]= new int[cols][rows];

        System.out.println("Transposed matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0 ; j<cols; j++){
                result[j][i]= arr[i][j];
            }
        }

        for(int i=0 ; i<result.length ;i++){
            for(int j=0 ;j<result[0].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6}};
        transpose(arr);
    }
}
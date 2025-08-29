import java.util.*;
class matrix{
    
    
    //for searching a key
    public static void search(int matrix[][] , int key){

        boolean found = false;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    found= true;
                }
            }
        }
       
        if (!found){
            System.out.println("no keys found");
        }else{
            System.out.println("keys found!");
        }
    }
    
    
    public static void main(String args[]){

        int matrix[][]= new int[3][3];
        int m= matrix.length;
        int n=matrix[0].length;
        int key= 10;
         //taking input
        for(int i=0; i<m ; i++){
            for (int j=0 ; j<n ; j++){
                Scanner sc = new Scanner(System.in);
                matrix[i][j] = sc.nextInt();
                
            }
            
        }
        //printing
        for(int i =0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix,key);
    }
}




class spiralmatrix{
   
    public static void spiral(int arr[][]){
        int startrow= 0;
        int endrow= arr.length-1;
        int startcol=0;
        int endcol= arr[0].length-1;
        int num=1;

        //output array
        int res[][] = new int [arr.length][arr[0].length];


        while(startrow<=endrow && startcol<=endcol){

            //top
            for(int j=startcol; j<= endcol; j++){
               res[startrow][j] = num++; 
            }

            //right
            for(int i=startrow+1 ; i<=endrow ; i++){
                res[i][endcol] = num++;
            }

            //bottom
            for(int j=endcol-1 ; j>=startcol ; j--){
                if(startcol==endcol){
                    break;
                }
                res[endrow][j]=num++;
            }

            //left
            for(int i=endrow-1 ; i>=startrow+1 ; i--){
                if(startrow==endrow){
                    break;
                }
                res[i][startcol]= num++;
            }
            
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }

        //printingarray

        for(int i=0 ; i<res.length ; i++){
            for(int j=0 ; j<res[0].length ; j++){
                System.out.print(res[i][j] + "\t");
            }

            System.out.println();
        }
        
    }
   
    public static void main(String args[]){

        int arr[][]= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

        spiral(arr);
    }
}
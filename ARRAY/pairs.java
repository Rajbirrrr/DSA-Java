class pairs{
    
    public static void totalpair(int arr[]){
        int i,j;
        int pc=0;
        for(i=0;i<arr.length; i++){
            int current_element= arr[i];
            for(j=i+1; j<=arr.length ; j++){
                System.out.print("(" + current_element + "," +j+ ")");
                pc++;
            }
            System.out.println(" ");
           
        }

         System.out.print("Total pairs: " + pc);
    }
    
    public static void main(String args[]){
        int arr[]= {2,3,4,5,6,7,8};
        totalpair(arr);
        
    }
}
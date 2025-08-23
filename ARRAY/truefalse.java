class truefalse{
    
    public static boolean checker(int arr[]){
        for (int j=0;j<arr.length; j++){
            int check = arr[j];

            
            for(int i=j+1 ; i< arr.length ; i++){
                if(check==arr[i]){
                    return true;
                }

            }

        }
        
        
        return false;
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,4,2};
        System.out.println(checker(arr));

    }
}
class largeststring{
    
    public static void lexicographic(String arr[]){
        String largest = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(largest.compareToIgnoreCase(arr[i])<0){  //can also use compareTo
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    
    public static void main(String args[]){
        String arr[] = {"Apple" , "Banana" , "Mango" , "Dragonfruit"};
        lexicographic(arr);
    }
}
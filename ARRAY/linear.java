class linear{
    
    public static int findvalue(int arr[],int key){
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }

        return -1;
    }
    
    
    
    public static void main(String args[]){
        int arr[]= {2,3,4,5,6,7,8};
        int key= 16;
        findvalue(arr,key);
        if(findvalue(arr,key)==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("element found!!");
        }
       

    }
}
class binarysearch{
    
    public static int binary(int arr[],int key){
        int start=0;
        int end= arr.length-1;//zeroth index
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){      //right-half
                start=mid+1;
            }else{                //left-half
                end = mid-1;
            }

            
        }
        return -1;

    }
    
    
    
    public static void main(String args[]){
        int arr[] ={2,4,6,8,10,14};
        int target = 8;
        int result = binary(arr,target);
        System.out.println("The index of target is: " + result);
    }
}
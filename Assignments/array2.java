import java.util.*;
class array2{
    public static void main(String args[]){
        int mid=0;
        int result=0;
        int arr[]= {4,5,6,7,1,2,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int start = 0;
        int  end = arr.length-1;

        while(start<=end){
            mid = (start+end)/2;
            
            if(arr[mid]==target){
                result=mid;
                break;
            }
             //lefthalf sorted....
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<=arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }



                //if in onno test case right half is sorted
            }else{
                if(target>arr[mid] && target<=arr[end]){
                    start = mid+1;
                }else{
                    end=mid-1;
                }
            }

            
        }

        System.out.println("The target value is at index:" + result);
    }
    
    
}
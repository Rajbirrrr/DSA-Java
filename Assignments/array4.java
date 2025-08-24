//trappingrain inn O(1) space complexity

class array4{
    
    public static int watervol(int arr[]){
        int n = arr.length;
        int l= 0;
        int r= n-1;
        int lmax = arr[0];
        int rmax=arr[n-1];
        int res= 0;

        while(l<r){
            if(lmax<rmax){
                l++;
                lmax= Math.max(arr[l],lmax);
                res+= lmax-arr[l];
            }else{
                r--;
                rmax= Math.max(arr[r], rmax);
                res+= rmax-arr[r];
            }

            
        }
        return res;
    }
    
    public static void main(String args[]){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        
        System.out.println("The total watervolume would be: " + watervol(arr));
    }
}
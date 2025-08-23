class repeatingandmissing{
    public static void main(String args[]){
        int arr[]= {4,3,6,2,1,1};
        int n = arr.length;
        int freq[]= new int[n+1];

        int i;

        int missing= -1;
        int repeat= -1;

        for(i=0 ; i< arr.length; i++){
            freq[arr[i]]++;
        }

        for( i=1; i<=n ; i++){
            if(freq[i]==0){
                missing= i;
            }
            if(freq[i]==2){
                repeat= i;
            }

            
        }

        System.out.println("(" + repeat+" "+ missing+ ")");
    }
}
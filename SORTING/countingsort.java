class countingsort{
    
    public static void count(int arr[]){

        //freq array r range
        int largest= Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>largest){
                largest = Math.max(arr[i],largest);
            }
        }
        //freq array te value fill
        int freq[] = new int[largest+1];
        for(int i=0 ; i<arr.length ; i++){
            freq[arr[i]]++;
        }

        //put values in original array
        int j=0;
        
        for(int i=1 ; i<freq.length; i++){
            while(freq[i]>0){
                arr[j] = i;
                j++;
                freq[i]--;


            }
        }
        
    }
    
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,3,2,4,3,7};
        count(arr);
        System.out.print("{");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);

            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}
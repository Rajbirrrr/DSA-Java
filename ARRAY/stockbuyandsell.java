class stockbuyandsell{
    
    public static void broker(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit = 0;

        for (int i = 0; i<arr.length ; i++){
            if(buyprice<arr[i]){
                profit = arr[i]-buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }else{
                buyprice = arr[i];
            }

            
        }

        if(buyprice==arr[arr.length-1]){
            System.out.println("You will get better price day to sell in future so wait!!");

        }else{
            System.out.println("The maximum profit would be:" + maxprofit);
        }
       
    }
    public static void main(String args[]){
        int arr[] = {7,5,3,6,4,1};
        broker(arr);
    }
}
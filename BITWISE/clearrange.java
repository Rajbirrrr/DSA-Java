class clearrange{
   
   public static void range(int n, int i, int j){
    int a = ((~0)<<j); //11100000
    int b = ((1<<i)-1); //returns me values having 1 at last //000011
    int bitmask = (a | b);
    System.out.println("cleared in range:" + " " + Integer.toBinaryString(n&bitmask));
   }
    public static void main(String args[]){
        int n = 745; //1011101001
        int i= 2;
        int j= 7;
        System.out.println("Initial num:" + n);
        range(n , i , j);
    }
}
class clearlastibits{
    
    public static void lasti(Integer n , int i){
        int bitmask = ((~0)<<i);
        System.out.println("cleared ith bit:" + " " + (n&bitmask));
        System.out.println("cleared ith bit in bin:" + " " + Integer.toBinaryString((n&bitmask)));
    }
    
    
    public static void main(String args[]){
        Integer n = 15; //1111
        int i= 2;
        System.out.println("Before clearing:" + Integer.toBinaryString(n));
        lasti(n,i);
    }
}
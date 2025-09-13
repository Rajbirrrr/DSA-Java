class updatebit{

    
    public static void clearbit(int n, int i){
        int bitmask = ~(1<<i);
        System.out.println("Changed bit is:" + ((n & bitmask)));
    }
    
    public static void setbit(int n, int i){
        int bitmask = (1<<i);
        System.out.println("Changed bit is:" + ((n | bitmask)));
    }
    
    
    public static int update(int n , int i, int newbit){
        if(newbit==0){
            clearbit(n , i);
        }else{
            setbit(n , i);
        }
        return 1;
    }
    
    public static void main(String args[]){
        int n = 20; //10100 -> 10000(16)
        int i= 2;
        int newbit = 0;
        update(n , i , newbit);
    }
}
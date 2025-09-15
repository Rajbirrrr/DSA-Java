class countsetbits{
    
    public static void count(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = (n>>1);
        }
        System.out.println("No of set bits:" + count);
    }
    public static void main(String args[]){
        int n = 10; //1010
        count(n);
    }
}
class cleearbit{
    public static void main(String args[]){
        int n = 10;
        int i = 2;
        int bitmask = ~(1<<i);  //ith pos always 0

        System.out.println("Clear val:" + ((n & bitmask)));
    }
}
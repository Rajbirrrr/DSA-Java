class setbit{
    public static void main(String args[]){
        int n= 10;
        int i=2;
        int leftshift = 1<<i; //ith pos e 1

        System.out.println("Set num is:" + ((n | leftshift)) ); //always ith 1 as or with num 
    }
}
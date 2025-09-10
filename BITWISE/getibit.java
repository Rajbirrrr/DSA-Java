class getibit{
    public static void main(String args[]){
        int n= 9;
        int i=2;
        int rightshift = n>>i ;

        if((1 & rightshift) == 1){
            System.out.println("ith bi is 1");
        }else{
            System.out.println("ith bit is 0");
        }
    }
}
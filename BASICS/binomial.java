class binomial{

    public int fact(int n){

        int f=1;
        for (int i = 1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String args []){
        int n = 5;
        int r = 2;
        System.out.println("The binomial coefficient of n=5 and r=2 is :");      
        binomial f1= new binomial();  
        System.out.println( f1.fact(n)/f1.fact(r)*f1.fact((n-r)));        

    }
}
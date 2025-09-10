class oddeve{
    
    public static void numcheck(int n){
        int bit = 1;
        if((n & bit) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    
    
    public static void main(String args[]){
        numcheck(2);
        numcheck(3);
    }
}
class bit2{
    public static void main(String args[]){
        int n = 10;
        System.out.println((-~n));
    }
}

// -n = ~n+1  (2's complement)
// -~n = n+1
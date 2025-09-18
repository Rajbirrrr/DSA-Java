import java.util.*;
class primemover{
    
    
    public static void primeno(int n){
        int count = 0;
        int prime_at_pos = 1;

        while(count<n){
            prime_at_pos++;
            if(isprime(prime_at_pos)){
                count++;
            }
        }

        System.out.println("The "+ n +"th prime number is:" + " " + prime_at_pos);
    }

    public static boolean isprime(int num){
        if(num==2) return true;
        if(num<2) return false;
        if(num%2 == 0) return false;
        for(int i=3; i<=Math.sqrt(num) ; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth num :");
        int n= sc.nextInt();
        primeno(n);
    }
}
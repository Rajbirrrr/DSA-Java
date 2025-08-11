import java.util.*;
class dtobsec{
    
    public static int dtob(int n){
        int pow = 0;
        int bin = 0;
        int rem;
        
        while(n>0){
            rem = n%2;
            bin = bin+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }

        return bin;
    }
    
    
    
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number:");
        int dec = sc.nextInt();
        
        System.out.println("the binary value of decimal "+dec+" is:\n"+dtob(dec));

        sc.close();
    }
    
    
}
import java.util.*;
class btodsec{
    
    public static int btod(int n){
        int pow = 0;
        int dec = 0;
        int lastdigit;
        while(n>0){
            lastdigit = n%10;
            dec= dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }

        return dec;
    }
    
    
    
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number:");
        int bin = sc.nextInt();
        
        System.out.println("the decimal value of binary "+bin+" is:\n"+btod(bin));

        sc.close();
    }
    
    
}
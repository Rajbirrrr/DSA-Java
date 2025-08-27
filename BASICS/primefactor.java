import java.util.*;
class primefactor{
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime factor:");
        int a = sc.nextInt();
        int i;
        System.out.println("The prime factors are:");
        for (i=2 ;i<=a ; i++){
            while(a%i==0){
                System.out.print(i);
                a = a/i;

                if(a>1){
                    System.out.print("*");
                }
            }

           
        }
    }
}
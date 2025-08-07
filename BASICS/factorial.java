import java.util.*;
class factorial{
    public static void main(String args[]){
        int i;
        int fact=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        for(i=num ; i>0;i--){
            fact = fact*i;

        }
        System.out.println("factorial of the number:" + fact);
    }
}
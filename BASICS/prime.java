import java.util.*;
class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int a= sc.nextInt();

        for(int i=1 ; i<=Math.sqrt(a) ; i++){
            if(a == 1){
                System.out.println("1 is a prime");
                break;
            }else if(a == 2){
                System.out.println("2 is a prime");
                break;
            }else if(a%(i+1) ==0){
                System.out.println("Not a prime number");
                break;
            }else{
                System.out.println("It's a primee!");
                break;
            }
         
        }

    sc.close();

    }
}
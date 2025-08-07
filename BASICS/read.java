import java.util.*;
class read{
    public static void main(String args[]){
        int evensum=0;
        int oddsum=0;
        int a;
        int choice;

        Scanner sc = new Scanner(System.in);
        

        do{
            System.out.println("Enter number :");

            a =sc.nextInt();

            if(a%2==0){
                evensum+= a;
            }else{
                oddsum += a;
            }

            System.out.println("Press 1 to add more number or 0 to discontinue");

            choice = sc.nextInt();
            

        }while(choice==1);

        System.out.println("Among the inserted numbers sum of even numbers is :"+ evensum);
        System.out.println("Among the inserted numbers sum of odd numbers is :"+ oddsum);
                

    }
}
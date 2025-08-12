import java.util.*;
class invhalfwno{
     
     
     public static void inverted(int n){
        int i;
        int j;
        for(i=1;i<=n;i++){
            //number
            for(j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            //spaces
            for(j=1;j<=i-1 ; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
     }
     
     
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        System.out.println("pattern:");
        
        inverted(n);
    }
}
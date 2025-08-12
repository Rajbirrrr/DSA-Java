import java.util.*;
class invhalfpyramid{

    public static void inverted(int n){

        int i;
        int j;
        
        for(i=1; i<=n ; i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(j=1;j<=i;j++){
                System.out.print("*");
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
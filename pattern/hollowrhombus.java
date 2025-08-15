import java.util.*;
class hollowrhombus{
    
    
    public static void hollow(int n){
        int i,j;
        for( i = 1; i<=n; i++){
            //spaces
            for(j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println(" ");
        }  
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        hollow(a);
    }
}
import java.util.*;
class diamond{
    public static void diamonds(int n){

        int i,j;
        for(i=1; i<=n; i++){
            //spaces
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(j=1; j<=(2*i-1); j++){
                if(i==1 || j==1 || j== (2*i)-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(i=n;i>=1;i--){
             //spaces
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(j=1; j<=(2*i)-1; j++){
                if(i==1 || j==1 || j== (2*i)-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        diamonds(a);
        
    }
}
import java.util.*;
class gapnum{
    
    public static void gapn(int n){
        int i,j;
        int num=1;
        for(i=1; i<=n ; i++){
            //spaces
            for(j=1; j<=(n-i) ; j++){
                System.out.print("  ");
            }
            //nums
            for(j=1; j<= (2*i)-1 ;j++ ){
                //for gaps
                if(j%2==0){
                    System.out.print("  ");
                }else{ //for nums
                    System.out.print(num+ " ");
                    num++;
                }
            }
            System.out.println();

        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        gapn(n);
    }
}
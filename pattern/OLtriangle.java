import java.util.*;
class OLtriangle{

    public static void oitriangle(int n){
        int i;
        int j;
        
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    
    
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        System.out.println("pattern:");
        
        oitriangle(n);
    }
}
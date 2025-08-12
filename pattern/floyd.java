import java.util.*;
class floyd{

    public static void floydtriangle(int n){
        int i;
        int j;
        int counter=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    
    
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        System.out.println("pattern:");
        
        floydtriangle(n);
    }
}
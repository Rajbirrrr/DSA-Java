import java.util.*;
class inputsumoddeve{
    public static void main(String args[]){
    int odd=0;
    int even=0;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("The range of numbers: ");
    int n = sc.nextInt();
    System.out.println("Enter digits: ");
    for(int i=0; i<n ; i++){
        int a= sc.nextInt();

        if(a%2==0){
            even+= a;
        }else{
            odd+= a;
        }
    }
    System.out.println("Sum of even inputs: " + even);
    System.out.println("Sum of odd inputs: " + odd);

    }
    

}
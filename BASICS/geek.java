import java.util.*;
class geek{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%3==0 && a%5 == 0){
            System.out.println("d by 3&5");
        }else if(a%5==0){
            System.out.println("d by 5");
        }else if(a%3==0){
            System.out.println("d by 3");

        }else{
            System.out.println("No match");
        }
    }
    
}
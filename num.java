import java.util.*;
public class num {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("You entered: " + n);

        if(n%2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");

        }

        sc.close();
    }

}

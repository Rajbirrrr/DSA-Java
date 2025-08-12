import java.util.*;
class butterfly{

    public static void butter(int row_size) {
    int i, j;

    // Upper half
    for (i = 1; i <= row_size; i++) {
        // stars
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }

        // spaces 
        for (j = 1; j <= 2 * (row_size - i); j++) {
            System.out.print(" ");
        }

        
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    // Lower half
    for (i = row_size; i >= 1; i--) {
        // stars 
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }

        // spaces 
        for (j = 1; j <= 2 * (row_size - i); j++) {
            System.out.print(" ");
        }

        // stars 
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

    
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size:");
        int row = sc.nextInt();

        
        
        butter(row);
    }
}
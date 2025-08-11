import java.util.Scanner;

public class btod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        
        int decimal = Integer.parseInt(binary, 2); // base 2 → decimal
        System.out.println("Decimal value: " + decimal);
        
        sc.close();
    }
}

import java.util.Scanner;

public class otob{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        // Step 1: Octal → Decimal (base 8)
        int decimal = Integer.parseInt(octal, 8);

        // Step 2: Decimal → Binary (base 2)
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary value: " + binary);

        sc.close();
    }
}

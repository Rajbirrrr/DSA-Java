import java.util.Scanner;

public class dtob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal); // decimal → binary
        System.out.println("Binary value: " + binary);

        sc.close();
    }
}

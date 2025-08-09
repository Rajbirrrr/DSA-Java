import java.util.*;

class rangeprime {

    public static void prime(int n) {
        int i, j;

        System.out.println("The non_prime numbers are:");
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    System.out.println(i + " ");
                    break; 
                }
            }
        }

        System.out.println("The prime numbers are the following:");
        for (i = 2; i <= n; i++) {
            if (i == 2) {
                System.out.println(i + " ");
            } else {
                for (j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        break; // not prime, stop checking
                    }
                }
                // if loop ended naturally → prime
                if (j > Math.sqrt(i)) {
                    System.out.println(i + " ");
                }
            }
        }
    }

    public static void main(String args[]) {
        int n = 10;
        prime(n);
    }
}

package Jobsheet_5;

import java.util.Scanner;

public class AkarKuadratBruteForce19 {

    public static int akarBruteForce(int n) {
        for (int i = 0; i <= n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return -1;
    }

    public static int akarDivideConquer(int n, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        int midSquared = mid * mid;
        if (midSquared == n) {
            return mid;
        } else if (midSquared < n) {
            return akarDivideConquer(n, mid + 1, high);
        } else {
            return akarDivideConquer(n, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();

        int akarBruteForce = akarBruteForce(n);
        double akarRoundedDownBruteForce = Math.floor(akarBruteForce);

        int akarDivideConquer = akarDivideConquer(n, 0, n); // Ensure `akarDivideConquer` returns a value
        double akarRoundedDownDivideConquer = Math.floor(akarDivideConquer);

        System.out.printf("Akar kuadrat dari %d dengan Brute Force (dibulatkan ke bawah): %.0f\n", n, akarRoundedDownBruteForce);
        System.out.printf("Akar kuadrat dari %d dengan Divide Conquer (dibulatkan ke bawah): %.0f\n", n, akarRoundedDownDivideConquer);

        scanner.close();
    }
}
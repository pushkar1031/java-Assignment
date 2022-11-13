import java.util.Scanner;
public class recursiveFact {
    static String A = "A";
   static String C = "C";
     static String B = "B";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Disk:");
        int n = scanner.nextInt();
        toh(n, A, C, B);
        scanner.close();
    }
    private static void toh(int n, String A, String C, String B) {
        if (n == 1) {
            System.out.println(A + " --> " + C);
        } else {
            toh(n - 1, A, B, C);
            System.out.println(A + " --> " + C);
            toh(n - 1, B, C, A);
        }

    }
}
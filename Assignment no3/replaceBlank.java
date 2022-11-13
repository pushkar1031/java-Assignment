import java.util.Scanner;

public class replaceBlank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String with Blank Spaces");
        String str = sc.nextLine();

        System.out.println(str.replaceAll(" ","%20"));
    }
}

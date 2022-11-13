import java.util.Scanner;

public class digitInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                System.out.println("Digit is Present" + str.charAt(i));

            else {
                System.out.println("Not Present");

            }

        }
    }
}


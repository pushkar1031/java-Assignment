import java.util.Scanner;

public class DuplicateCharacterinString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter The String = >");
        String str= sc.nextLine();


        char[] ch=str.toCharArray();
        System.out.println("Duplicate Characters are == > ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if(ch[i]==ch[j]){
                    System.out.println(ch[j]);
                    break;
                }
            }
        }
    }
}

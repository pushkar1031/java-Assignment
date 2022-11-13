import java.util.Scanner;

public class removeDupfromString {

    public static  String Duplicate(String str){
        String temp="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(temp.indexOf(ch)== -1){
                temp=temp+ch;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your String");
        String str=sc.nextLine();
        System.out.println("After Removing Duplicate  "+Duplicate(str));

    }
}

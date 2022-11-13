import java.util.HashMap;
import java.util.Scanner;

public class firstNonRepChar {

    // Using map
//    public static int NonRepeat(String str){
//        HashMap<Character , Integer> map= new HashMap<>();
//        for(char ch: str.toCharArray()){
//            map.put(ch,map.getOrDefault(ch ,0)+1);
//        }
//        for (int i = 0; i <str.length() ; i++) {
//            char ch=str.charAt(i);
//            if(map.get(ch)==1){
//                return ;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        System.out.print(NonRepeat(str));
//    }

    //*********** Without map **********
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String => ");
        String str=sc.nextLine();


//        System.out.println("Non Repeating Characters in Strings are ==>");
        System.out.println("First Non Repeating Characters are :");
        for (int i = 0; i <str.length() ; i++)
        {
            int temp=0;
            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)){
                    temp++;
                }

            }
            if(temp ==1){
                System.out.println(str.charAt(i));
                break;
            }

        }
    }
}

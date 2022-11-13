import java.util.HashMap;
import java.util.Scanner;

public class StringAnagrams {
    public static boolean Anagrams(String str1, String str2, int k) {
        HashMap<Character , Integer> map=new HashMap<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length() ; i++) {
            char ch=str1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) +1);
        }
        for (int i = 0; i <str2.length() ; i++) {
            char ch=str2.charAt(i);
            if(map.getOrDefault(ch,0) > 0){
                map.put(ch,map.get(ch) -1 );
            }
        }
        int count =0;
        for (char ch:map.keySet()) {
            count +=map.get(ch);
        }
        if(count > k){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String str1=s.nextLine();
        String str2=s.nextLine();

        int k=s.nextInt();
        System.out.println(Anagrams(str1,str2,k));
            // Take a Input as ABABADDCCC  & BBBAACCCED   K=3  op=> True
    }
}

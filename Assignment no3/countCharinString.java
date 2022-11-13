import java.lang.String;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countCharinString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        Map<Character,Integer> m=new TreeMap<>();
        int count=0;
        for (int i = 0; i <s.length(); i++) {
            count=0;
            for (int j = 0; j <s.length() ; j++) {
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            m.put(ch[i],count);
        }
        System.out.println(m);
    }
}

public class reverseWithoutLib {
//    public static void main(String[] args) {
//        String name="Hello There";
//        String rev="";
//        int len=name.length();
//        for(int i = len-1; i >=0 ; i--) {
//            rev=rev+name.charAt(i);
//        }
//        System.out.println(rev);
//    }

    // Approach 2 Recursive
public static String reverse(String str) {
    if ((null == str) || (str.length() <= 1)) {
        return str;
    }
    return reverse(str.substring(1)) + str.charAt(0);
}
    public static void main(String[] args) {
        System.out.println(reverse("RAHUL"));

    }
}

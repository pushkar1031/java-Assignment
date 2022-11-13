public class highOccuOfCharinString {
    static final int Size=256;

    public static int find(String str) {
        int count[]=new int[Size];
        int count2=0;
        int max=-1;
        char res= ' ';
        for (int i = 0; i <str.length() ; i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i <str.length(); i++) {
            if(max<count[str.charAt(i)]){
                max=count[str.charAt(i)];
                res=str.charAt(i);
            }
        }
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==res){
                count2++;
            }
        }
//        char c=(char)count2;
        return  str.charAt(count2);
    }

    public static void main(String[] args) {
        String str="SUCCESS";
        System.out.println(find(str));
    }
}

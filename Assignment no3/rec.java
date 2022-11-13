public class rec {

    public static void display(String str,String res ) {

        if (str.length() == 0) {
            System.out.println(res);  //to print empty String
            return;
        }
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                String op = str.substring(0, i) + str.substring(i + 1);
                display(op, res+temp);
            }

        }




    public static void main(String[] args) {
            String s="ABCD";
            display(s,"");
    }

}

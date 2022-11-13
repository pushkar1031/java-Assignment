public class validShuffelOfTwoStrngs {
        private static void validShuffle(String s1, String s2, String result) {
            String s3 = s1 + s2;
            StringBuffer s = new StringBuffer(s3);
            boolean flag = false;
            char[] ch = result.toCharArray();
            if (s.length() != result.length()) {
                flag = false;
            } else {

                for (int i = 0; i < ch.length; i++) {
                   String temp = Character.toString(ch[i]);
                    if (s3.contains(temp)) {
                       s.deleteCharAt(s.indexOf(temp));
                        s3 = new String(s);
                        flag = true;

                    } else {
                        flag = false;
                        break;
                    }

                }

            }

            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    public static void main(String[] args) {

        String s1 = "AABBCCDD";
        String s2 = "ABCDF";

        String result = "AAABBBCCCDDDF";

        validShuffle(s1, s2, result);

    }

    }


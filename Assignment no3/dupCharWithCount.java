public class dupCharWithCount {

    public void Findrepeter(){
        String s="Programming";
        int distinct = 0 ;

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(i)==s.charAt(j))
                {
                    distinct++;

                }
            }
            if(distinct >1){
                System.out.println(s.charAt(i)+" "+distinct);
            }

            String d=String.valueOf(s.charAt(i)).trim();
            s=s.replaceAll(d,"");
            distinct = 0;

        }

    }

    public static void main(String[] args) {
        dupCharWithCount d=new dupCharWithCount();
        d.Findrepeter();
//        System.out.println(dupCharWithCount.firstNonRepChar);
    }
}

public class Java_14_Pattern_Matching_instanceOf_Update {
    public static void main(String[] args) {
        Object obj ="Hello World!";
       /* if(obj instanceof String){                for java 8
            String string =(String)obj;
            System.out.println(string.toUpperCase());
        }*/

        //In order to Run below line of code
        //ctrl+alt+shift+s
        //Project -> SDK ->openjdk-14
        //Project Language Level -> 14(Preview) Records,Pattern,text block
        //Modules ->Language Level -> 14(Preview) Records,Pattern,text block

        if(obj instanceof String s){                //for java 14
            System.out.println(s.toUpperCase());
        }
    }
}

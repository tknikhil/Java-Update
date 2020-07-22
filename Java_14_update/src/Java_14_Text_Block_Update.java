public class Java_14_Text_Block_Update {
    public static void main(String[] args) {
        String html="<html>\n"+
                "<body> \n"+
                "<p>Hello World </p>\n"+
                "</body>\n"+
                "<html>";
        String java13Html= """
                <html>
                    <body>
                        <p>Hello, Java 13</p>
                    </body>
                </html>
                """;
        String java14Html= """
                <html>
                    <body>\
                        <p>Hello,'\s' Java 14</p>\
                    </body>
                </html>
                """;
        System.out.println("====x====x====Before java 13====x====x====x====");
        System.out.println(html);
        System.out.println("====x====x====From java 13====x====x====x====");
        System.out.println(java13Html);
        System.out.println("====x====x====From java 14====x====x====x====");
        System.out.println(java14Html);
    }
}

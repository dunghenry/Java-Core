public class App {
    public static void main(String[] args) throws Exception {
       String str1 = "Hello world 123, Hello world";
       String str2 = "Hello";
       String str3 = "Hello 123";
       String str4 = "123";
       char c = '3';
       
       System.out.println(str1.indexOf(str2));//0
       System.out.println(str1.indexOf(str3));//-1

       System.out.println(str1.indexOf(str4, 5));
       System.out.println(str1.indexOf(c));

       System.out.println(str3.lastIndexOf(str2));
    }
}

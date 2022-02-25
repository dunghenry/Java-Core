public class App {
    public static void main(String[] args) throws Exception {
        String fullName ="Tran Van Dung ";
        String age = "21";

        System.out.println(fullName.concat(age));
        System.out.println(fullName + age);

        System.out.println(fullName.replaceAll("Tran", "Nguyen"));

        String str = fullName.replace("Tran", "Nguyen");
        System.out.println(str);

        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());

        String msg = "     Hehe      ";
        System.out.println(msg.trim());


        String str1 = "Xin chao cac ban";
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(4, 8));

    }
}

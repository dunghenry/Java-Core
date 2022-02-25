public class App {
    public static void main(String[] args) throws Exception {
        String str1 = "Hello world";
        String str2 = "No msg";
        String str3 = "Hello world";
        String str4 = "HellO world";
        //Output int
        System.out.println(str1.hashCode());

        // Output boolean
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//true

        System.out.println(str1.equalsIgnoreCase(str4)); //true
        System.out.println(str1.equalsIgnoreCase(str3));//true

        String sv1 = "Tran Van A";
        String sv2 = "Tran Van B";
        String sv3 = "Tran Van";
        String sv4 = "Tran Van A";
        String sv5 = "Tran Van a";

        System.out.println(sv1.compareTo(sv2)); //-1
        System.out.println(sv1.compareTo(sv3)); //2
        System.out.println(sv1.compareTo(sv4)); //0

        System.out.println(sv1.compareToIgnoreCase(sv5)); //0

        String msg1 = "Hello world";
        String msg2 = "ello";
        boolean check = msg1.regionMatches(1, msg2, 0, 4);
        System.out.println(check);// true

        String tel = "0346588890";
        System.out.println(tel.startsWith("034")); //true
        System.out.println(tel.endsWith("890")); //true

        String filename1 = "Anh1.JPG";
        String filename2 = "Hocjava.PDF";
        if(filename1.endsWith(".JPG")){
            System.out.println("Day la file anh");
        }
        else if(filename1.endsWith(".PDF")){
            System.out.println("Day la file slide");
        }

        if(filename2.endsWith(".JPG")){
            System.out.println("Day la file anh");
        }
        else if(filename2.endsWith(".PDF")){
            System.out.println("Day la file slide");
        }
    }
}

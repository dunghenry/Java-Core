package code;

import java.util.Arrays;

public class ViDu {
    public static void main(String[] args) {
        String str = "Xin chao cac ban nhe ! , Toi la dunghenry";
        String[] a = str.split(" ");
        String[] b = str.split(",");
        String str2 = "Xin chao. Minh la DungHenry, minh o NB";
        String[] c = str2.split("\\.|\\,");
        System.out.println(Arrays.toString(a)); //[Xin, chao, cac, ban, nhe, !, ,, Toi, la, dunghenry]
        System.out.println(Arrays.toString(b)); //[Xin chao cac ban nhe ! ,  Toi la dunghenry]
        System.out.println(Arrays.toString(c)); // [Xin chao,  Minh la DungHenry,  minh o NB]

        String fullName = "Tran Van Dung";
        String[] arr = fullName.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 1]);

    }

}

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Kieu dl nguyen thuy
        int[] mang1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        System.out.println(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang1_a));

        int[] mang1_b = mang1.clone();
        mang1_b[0] = 10;
        
        System.out.println(Arrays.toString(mang1_b));
        System.out.println(Arrays.toString(mang1));

        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1_c.length);
        mang1_c[0] = 20;
        System.out.println(Arrays.toString(mang1_c));
        System.out.println(Arrays.toString(mang1));

        //Kieu dl doi tuong;
        String[] mang_dt = {"Dung", "Nam"};
        String[] mang_dt_a = mang_dt;
        mang_dt_a[0] = "Haha"; 

        System.out.println(Arrays.toString(mang_dt_a));
        System.out.println(Arrays.toString(mang_dt));

        String[] mang_dt_b = mang_dt.clone();
        mang_dt_b[0] = "Oke";
        System.out.println(Arrays.toString(mang_dt_b));
        System.out.println(Arrays.toString(mang_dt));

        String[] mang_dt_c = new String[mang_dt.length];
        System.arraycopy(mang_dt, 0, mang_dt_c, 0, mang_dt_c.length);
        mang_dt_c[0] = "Mangdt";
        
        System.out.println(Arrays.toString(mang_dt_c));
        System.out.println(Arrays.toString(mang_dt));

    }
}

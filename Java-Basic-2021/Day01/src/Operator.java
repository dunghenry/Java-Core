public class Operator {
    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 10;
        int t = a + b;
        int h = b - a;
        int ti = a * b;
        float th = (float) b / a;
        System.out.println(t);//13
        System.out.println(h);//7
        System.out.println(ti);//30
        System.out.println(th);//3.3333333

        //Số thực
        float c = 1.4f;
        float d = 2.2f;
        System.out.println(c + d);//3.6

        //Nâng kiểu trong java byte → short → int → long → float → double

        byte e = 3;
        short f = 60;
        int i = 100;
        long l = 1000L;
        long tongL = e + f + i + l;//long 1163
        System.out.println(tongL);//1163
       
        //Toán tử gán
        int k = 10;
        k += 5;
        k -= 5;
        k *= 5;
        k /= 5;
        System.out.println(k);//15

    }
}

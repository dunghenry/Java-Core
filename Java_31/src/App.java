public class App {
    public static void main(String[] args) throws Exception {
       int[] arr1 = new int[10];
       double arr2[] = new double[]{1, 2, 3, 4, 5};

       MyMath m = new MyMath();
       System.out.println(m.timMax(10, 1));
       System.out.println(m.timMax(10.5, 1.5));
       System.out.println(m.tinhTong(arr2));
       System.out.println(m.tinhTong(1, 2));
    }
}

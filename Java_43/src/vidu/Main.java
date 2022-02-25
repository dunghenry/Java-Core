package vidu;

import java.util.Arrays;

public class Main {
    public static int[] reverse(int[] x){
        int[] rs = new int[x.length];
        int index = 0;
        for (int i = x.length - 1; i >= 0; i--){
            rs[index] = x[i];
            index++;
        }
        return rs;

    }
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 3, 2, 5, 7, 6, 8};
        int[] b = new int[10];
        
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 4));

        Arrays.fill(b, 4);

        a = Main.reverse(a);
        System.out.println(Arrays.toString(a));
        
    }
}

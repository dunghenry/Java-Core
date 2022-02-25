package vidu;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100, "Tran Van Dung", "Lop 10", 10);
        SinhVien sv2 = new SinhVien(10, "Tran Van A", "Lop 5", 4);
        SinhVien sv3 = new SinhVien(20, "Tran Van B", "Lop 7", 7);

        SinhVien[] arr_sv = {sv1, sv2, sv3};
        System.out.println(Arrays.toString(arr_sv));
        //Sap xep

        Arrays.sort(arr_sv);
        System.out.println("Sap xep");
        System.out.println(Arrays.toString(arr_sv));

        //Tim kiem

        System.out.println("Tim kiem: " + Arrays.binarySearch(arr_sv,sv1));

    }
}

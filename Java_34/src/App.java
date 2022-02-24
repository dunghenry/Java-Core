public class App {
    public static void main(String[] args) throws Exception {
        MayTinhVinacal500 a = new MayTinhVinacal500();
        MayTinhVinacal500 b = new MayTinhVinacal500();

        System.out.println(a.chia(10, 2));
        System.out.println(a.chia(10, 0));
        double[] arr1 = new double[] {1, 2, 3, 4};
        double[] arr2 = new double[] {4, 3, 2, 1};
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();
        sxchen.sapXepGiamDan(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();

        sxchon.sapXepTangDan(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();

        double[] arr3 = new double[] {6,2,7,9,2,4,5};
        PhanMemMayTinh pm = new PhanMemMayTinh();
        pm.sapXepGiamDan(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
    }
}

public class MyMath {
    public int timMax(int a, int b){
        if(a <= b){
            return b;
        }else{
            return a;
        }
    }
    public double timMax(double a, double b){
        if(a <= b){
            return b;
        }else{
            return a;
        }
    }
    public int tinhTong(int a, int b){
        return a + b;
    }
    public double tinhTong(double[] arr){
        double tong = 0;
        for(int i=0; i<arr.length; i++){
            tong += arr[i];
        }
        return tong;
    }
}

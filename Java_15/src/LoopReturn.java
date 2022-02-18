public class LoopReturn {
    public static void main(String[] args) {
        for (int  i = 2; i <= 9; i++){
            System.out.println("Bang cuu chuong " + i);
            for (int j = 1; j <= 10; j++){
                if(j > 6)
                    return;
                    //Thoat vong lap
                System.out.println( i + " x " + j + "=" + i * j);
            }
            System.out.println("");
            System.out.println("--------------Het---------------");
            System.out.println("");
        }
    }
}

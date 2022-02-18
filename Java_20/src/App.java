public class App {
    public static void main(String[] args) throws Exception {
        MyDate date = new MyDate(10, 10, 2021);
        date.printDate();
        date.setDay(32);
        System.out.println(date.getDay());
    }
}

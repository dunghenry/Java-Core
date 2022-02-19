public class App {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(15, 5, 2025);
        MyDate date2 = new MyDate(15, 5, 2025);
        // if(date1 == date2) {
        //     System.out.println("date1 = date2");
        // }
        // else {
        //     System.out.println("date1 != date2");
        // }
        System.out.println(date2.equals(date1));
        System.out.println("hashCode date1: " + date1.hashCode());
        System.out.println("hashCode date2: " + date2.hashCode());
    }
}

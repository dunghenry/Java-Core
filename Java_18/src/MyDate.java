public class MyDate {

    public int day = 0;
    public int month = 0;
    public int year = 0;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDay() {
        System.out.println("Day = " + day);
    }

    public void printMonth() {
        System.out.println("Month = " + month);
    }

    public void printYear() {
        System.out.println("Year = " + year);
    }

    public void printDate(){
        System.out.println("Date = " + day + "-" + month + "-" + year);
    }

}

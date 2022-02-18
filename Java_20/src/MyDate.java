public class MyDate {
    private int day = 0;
    private int month = 0;
    private int year = 0;
    public MyDate(int day, int month, int year) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }
        else{
            this.day = 1;
        }
        if(month >= 1 && month <= 12){
            this.month = month;
        }
        else{
            this.month = 1;
        }
        if(year > 0){
            this.year = year;
        }else{
            year = 2021;
        }
    }
    public void printDate(){
        System.out.println("Date = " + day + "-" + month + "-" + year);
    }

    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.day;
    }
    public int getYear() {
        return this.day;
    }
    
    public void setDay(int d){
        if(d >= 1 && d <= 31){
            this.day = d;
        }
    }
    public void setMonth(int m){
        if(m >= 1 && m <= 12){
            this.month = d;
        }
    }
    public void setYear(int y){
        if(y >= 1){
            this.year = d;
        }
    }
}

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (year > 0) {
            this.year = year;
        } else {
            year = 2021;
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int d) {
        if (d >= 1 && d <= 31) {
            this.day = d;
        }
    }

    public void setMonth(int m) {
        if (m >= 1 && m <= 12) {
            this.month = m;
        }
    }

    public void setYear(int y) {
        if (y >= 1) {
            this.year = y;
        }
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyDate other = (MyDate) obj;

        if (this.day != other.day)
            return false;
        if (this.month != other.month)
            return false;
        if (this.year != other.year)
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result;
    }
}

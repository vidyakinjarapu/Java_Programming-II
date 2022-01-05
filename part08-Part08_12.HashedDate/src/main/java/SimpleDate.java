
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    public boolean equals(SimpleDate other){
        if(other == this){
            return true;
        }
        if(other == null){
            return false;
        }
        if(!(other instanceof SimpleDate)){
            return false;
        }
        
        SimpleDate others = (SimpleDate) other;
        
        if(this.day == others.day && this.month == others.month && this.year == others.year){
            return true;
        }
        return false;
    }
    

    @Override
    public int hashCode() {
        if(this == null){
            return this.year;
        }
        return this.day + this.month + this.year * 50;
    }   

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 79 * hash + this.day;
//        hash = 79 * hash + this.month;
//        hash = 79 * hash + this.year;
//        return hash;
//    }
    
}

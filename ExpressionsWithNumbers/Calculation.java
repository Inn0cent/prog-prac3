
/**
 * Write a description of class Calculation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculation
{
    double x;
    double y;

    public Calculation(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    //Level 2
    
    public void setXandY(double xSet, double ySet){
        x = xSet;
        y = ySet;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double average(){
        return (x+y)/2.0;
    }
    
    public double max(){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }
    
        public String swap(){
        double temp = x;
        x = y;
        y = temp;
        return x+" "+y;
    }
        
    public double CtoF(){
        y = (x*1.8)+32;
        return y;
    }
    
    public String roots(int a, int b, int c){
        double sqroot = ((b*b)-(4*a*c))/(2*a);
        if (sqroot == 0){
            x = -b;
            y = -b;
        }else if (sqroot < 0) {
            return "eqn has no roots";
        }else{
            x = -b + sqroot;
            y = -b - sqroot;
        }
        return x+" "+y;
    }
    
    public int hoursInWeek()
    {
        return 24*7;
    }
    
    public int secondsInYear(){
        return hoursInWeek() * 52 * 60 * 60;
    }
    
    //Level 3
    
    public String odd(int val){
        if (val%2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
    
    public String dayAndYears(String val){
        String DD = val.split("/")[0];
        String YYYY = val.split("/")[2];
        if (YYYY.length() == 2){
            if (Integer.valueOf(YYYY) < 20){
                YYYY = "20" + YYYY;
            }else{
                YYYY = "19" + YYYY;
            }
        }
        return "Day: " + DD + " Year: " + YYYY;
    }
    
    public int minCoins(int money){
        int coins = 0;
        int[] pennies = {50, 20, 10, 5, 2, 1};
        for (int i = 0; i < pennies.length; i++){
            while (money - pennies[i] >= 0){
                money -= pennies[i];
                coins ++;
            }
        }
        return coins;
    }
    
    public String dayOfWeek(int day, int month, int year){
        year -= 2001;
        day --;
        month --;
        int daysSinceMonday = 0;
        int daysInYear = (365*year) + (year/4);
        int daysInMonth = 0;
        int dayOfWeek;
        int[] listOfMonthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysInWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (year%4 == 0 && month > 2){
            daysInMonth += 1;
        }
        for (int i = 0; i < month; i++){
            daysInMonth += listOfMonthLength[i];
        }
        daysSinceMonday = day + daysInMonth + daysInYear;
        dayOfWeek = daysSinceMonday % 7;
        return daysInWeek[dayOfWeek];
    }
}

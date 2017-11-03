
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
    
    public double CtoF(){
        y = (x*1.8)+32;
        return y;
    }
    
    public String roots(int a, int b, int c){
        double sqroot = ((b*b)-(4*a*c))/(2*a);
        System.out.println(sqroot);
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
    
    public String swap(){
        double temp = x;
        x = y;
        y = temp;
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
    
    public void dayAndYears(String val){
        String DD = val.split("/")[0];
        String YY = val.split("/")[2];
        System.out.println(DD);
        System.out.println(YY);
        System.out.println();
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
    
    public int dayOfWeek(int day, int month, int year){
        year -= 2001;
        day --;
        month --;
        int daysSinceMonday = 0;
        int daysInYear = (365*year) + (year/4);
        int daysInMonth = 0;
        int dayOfWeek;
        int[] listOfMonthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year%4 == 0 && month > 2){
            daysInMonth += 1;
        }
        for (int i = 0; i < month; i++){
            daysInMonth += listOfMonthLength[i];
        }
        daysSinceMonday = day + daysInMonth + daysInYear;
        dayOfWeek = daysSinceMonday % 7;
        return dayOfWeek;
    }
}

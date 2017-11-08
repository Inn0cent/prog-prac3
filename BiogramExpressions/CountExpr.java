
/**
 * A simple class to apply a transformation iteratively
 * 
 * @author Steven Bradley
 */
public class CountExpr
{
  
    private double x;
    public double y;
    private double z;
    
    public CountExpr(int startx, int starty){
        x=startx/5.0;
        y=starty/5.0;
        z=Math.sqrt(x*x+y*y);
    }
    
    public void doOnce(int count){
        if (count<3){
            y=(x-(count*10))*Math.tan(y/5) - (y-count)*Math.sqrt(x/3);
        }else{
            swap();
            y=(x-(count*10))*Math.sqrt(y/5) - (y-count)*Math.tan(x/3);
        }
    }
    
    public void swap(){
        double temp = y;
        y = x;
        x = temp;
    }
    
    public boolean finished(){
            return x+y>z*10; 
    }
}


/**
 * A simple class to apply a transformation iteratively
 * 
 * @author Steven Bradley
 */
public class CountExpr
{
  
    private double x;
    public double y;
    
    public CountExpr(int startx, int starty){
        x=startx/10.0;
        y=starty/10.0;
    }
    
    public void doOnce(){
        y=(x-55)*Math.tan(y/5) - (y-10)*Math.sqrt(x/3);
    }
    
    public boolean finished(){
            return x+y>100; 
    }
}

import greenfoot.*; 


public class Explosion extends Actor
{
    private int time = 20;
    public void act()
    {
        time--;
        if ( time== 0){
            getWorld().removeObject(this);
        }
    }
}

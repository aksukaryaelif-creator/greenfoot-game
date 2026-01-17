import greenfoot.*;  
public class Enemy extends Actor
{
    
    public void act()
    {
     setLocation(getX(), getY() +2);
     if(isAtEdge())
     {
         getWorld().removeObject(this);
     }
    }
}

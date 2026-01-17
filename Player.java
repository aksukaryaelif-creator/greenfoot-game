import greenfoot.*;

public class Player extends Actor
{
       public Player(){
      
      
    }
       public void act()
    {
        hareket();
        atesEt();
        carpismaKontrol();
        
    }
       public void hareket(){
    
       if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
    }

    public void atesEt()
    {
        if (Greenfoot.isKeyDown("space") ) {
            getWorld().addObject(new Bullet(), getX(), getY() - 20);
            Greenfoot.delay(10); 
            
        }
    }
    public void carpismaKontrol()
    {
          World w = getWorld();
        if(w == null) return;

        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        if(enemy != null){
            if(w.getObjects(Enemy.class).contains(enemy)) {
                w.removeObject(enemy);
            }
            if(MyWorld.life != null) MyWorld.life.loseLife();
            w.addObject(new Explosion(), getX(), getY());
            
        }
    }
    
}

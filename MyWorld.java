import greenfoot.*;  


 
public class MyWorld extends World
{
public static Score score;
public static Life life;
private int enemyTimer = 0;

    public MyWorld()
    {    
      
        super(600, 400, 1); 
        
       
        addObject(new Player(), 100, 350);
        score = new Score();
        addObject(score, 550, 20);
        life = new Life();
        addObject(life, 50,20);
         
}
public void act()
{
    enemyTimer++;
    
    if (enemyTimer>=60)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            addObject(new Enemy(), x,0);
            enemyTimer = 0;
        } 
}
} 


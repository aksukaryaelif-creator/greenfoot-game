import greenfoot.*;

public class Life extends Actor
{
    private int life = 3;

    public Life()
    {
        updateLife();
    }

    public void loseLife()
    {
        life--;
        updateLife();

        if (life <= 0)
        {
             World world = getWorld();
        world.addObject(new GameOver(), world.getWidth()/2, world.getHeight()/2);
            Greenfoot.stop();
        }
    }

    private void updateLife()
    {
        setImage(new GreenfootImage("Life: " + life,
                24, Color.WHITE, Color.BLACK));
    }
}


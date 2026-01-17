import greenfoot.*; 


public class Score extends Actor
{
    private int score = 0;
    public Score(){
        updateScore();
    }
    public void addScore()
    {
        score++;
        updateScore();
    }
     private void updateScore()
    {
        setImage(new GreenfootImage("Score: " + score, 
                                    24, Color.WHITE, Color.BLACK));
    }
}

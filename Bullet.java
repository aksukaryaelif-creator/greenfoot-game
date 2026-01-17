import greenfoot.*;

public class Bullet extends Actor
{
    public void act()
    {
        World w = getWorld();
        if(w == null) return;

        // Yukarı hareket
        setLocation(getX(), getY() - 7);

        // Düşmana çarpma kontrolü
        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        if(enemy != null) {
            int ex = enemy.getX();
            int ey = enemy.getY();

            if(w.getObjects(Enemy.class).contains(enemy)) {
                w.removeObject(enemy);   // düşmanı sil
            }
            if(w.getObjects(Bullet.class).contains(this)) {
                w.removeObject(this);    // mermiyi sil
            }

            w.addObject(new Explosion(), ex, ey);  // patlama
            if(MyWorld.score != null) MyWorld.score.addScore();

            return; // başka işlemleri yapma
        }

        // Ekran dışına çıkarsa mermiyi sil
        if(isAtEdge()) {
            if(w.getObjects(Bullet.class).contains(this)) {
                w.removeObject(this);
            }
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Police here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Police extends Person
{
    private String up;
    private String down;
    private String left;
    private String right;
    /**
     * Act - do whatever the Police wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Police(String up, String down, String left, String right){
        super(3);
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }
    public void act(){
        super.act();
        if (this.isTouching(Robber.class)){
            World world = this.getWorld();
            Beach beach = (Beach)world;
            if (beach!=null){
                beach.endTheGame(true);
            }    
        }
    }
    public void movement()
    {
        int x = this.getX();
        int y = this.getY();
        if (Greenfoot.isKeyDown(up)){
            this.setRotation(270);
            //this.move(1); 
            //this.setLocation(x, y-1);
            y--;
        } else if (Greenfoot.isKeyDown(down)){
            this.setRotation(90);
            //this.move(1);
            //this.setLocation(x, y+1);
            y++;
        } else if (Greenfoot.isKeyDown(right)){
            this.setRotation(0);
            //this.move(1);       
            //this.setLocation(x+1, y);
            x++;
        } else if (Greenfoot.isKeyDown(left)){
            this.setRotation(180);
            //this.move(1);    
            //this.setLocation(x-1, y);
            x--;
        }
        if (this.getWorld().getObjectsAt(x,y,HidingSpot.class).isEmpty()){
            this.setLocation(x,y);
        }    
    }
}

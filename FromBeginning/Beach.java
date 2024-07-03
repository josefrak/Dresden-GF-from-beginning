import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beach extends World
{
    private int counter;
    /**
     * Constructor for objects of class Beach
     * .
     * 
     */
    public Beach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(15, 10, 60); 
        prepareTheBeach();
        //this.addObject(new Police("8","2","4","6"), 15, 0);
        //this.addObject(new Police(), 5, 5);
    }
    public void endTheGame(boolean win){
        this.removeObjects(this.getObjects(Actor.class));
        int x = this.getWidth()/2;
        int y = this.getHeight()/2;
        String message;
        if (win){
            message = "The robber was caught";
        } else {
            message = "The robber escaped";
        }
        this.showText(message, x, y);
        Greenfoot.delay(40);
        this.showText(null, x, y);
        this.prepareTheBeach();
        Greenfoot.stop();
    }
    public void act(){
        this.counter--;
        if (counter == 0){
            this.endTheGame(false);
        }
    }
    private void prepareTheBeach(){
        this.addObject(new Police("w","s","a","d"), 0, 0);
        this.addObject(new HidingSpot(),5,5);
        this.addObject(
            new Robber(), 
            Greenfoot.getRandomNumber(this.getWidth()), 
            Greenfoot.getRandomNumber(this.getHeight())
        );
        this.counter = 500;        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beach extends World
{
    /**
     * Constructor for objects of class Beach
     * .
     * 
     */
    public Beach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(15, 10, 60); 
        this.addObject(new Police("w","s","a","d"), 0, 0);
        this.addObject(
            new Robber(), 
            Greenfoot.getRandomNumber(this.getWidth()), 
            Greenfoot.getRandomNumber(this.getHeight())
        );
        //this.addObject(new Police("8","2","4","6"), 15, 0);
        //this.addObject(new Police(), 5, 5);
    }
    public void endTheGame(boolean win){
        if (win){
            this.showText("The robber was caught", 1,1);
        } else {
            
        }
    }
}

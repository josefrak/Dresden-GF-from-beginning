import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pearson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    private int delay;
    private int delayCounter;
    public Person(){
        this(3); 
    }  
    public Person(int delay){
        this.delayCounter = 0;
        this.delay = delay;  
    }     
    public void act()
    {
        if (this.delayCounter == this.delay){
            this.movement();
            this.delayCounter=0;
        } else {
            this.delayCounter++;
        }
    }
    public abstract void movement();
}

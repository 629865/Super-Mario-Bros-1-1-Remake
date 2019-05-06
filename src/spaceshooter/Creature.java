/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;
import java.awt.event.KeyEvent;


/**
 *
 * @author jword
 */
public abstract class Creature {
    private static int hp;
    private static int coinCount;
    private boolean hasMushroom;
    private boolean hasFireFlower;
    private boolean hasSuperLeaf;
    private boolean hasPowerStar;
    private boolean hasQuestionBlock;
    private boolean hasQuestionBlockHit;
    

    //Fields
    protected int x;
    protected int y;
    protected int vx;
    protected int vy;
    protected int size;
    

    //Constructor
    public Creature(int x, int y) {
        this.x = x;
        this.y = y;
        this.vx = 3;
        this.vy = 3;
        size = 25;
    }

    public Creature() {
        this(100,100);
    }
    
    public abstract void draw(Graphics g);
    
    public void update() {
        move();
    }
    
    public void move() {
        x += vx;
        y -= vy;
    }
    public void gravity() {
        
    }
    public void reverseX(){
        //TODO Implement this method
        vx = -vx;
        move();
        }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }
    
    
    /**
     * Makes the character "bounce" and reverse direction on Y axis 
     */
    public void reverseY(){
        //TODO Implement this method
        vy = -vy;
    }
    public void die(){
    x = 3000;
    y = 3000;
    vx = 0;
    vy = 0;
}

    int getSize() {
       return size; 
    }
     
}
        

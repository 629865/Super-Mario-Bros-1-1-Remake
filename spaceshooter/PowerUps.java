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
public abstract class PowerUps {
    private int hp;
    private int coinCount;
    private boolean hasFireFlower;
    private boolean hasSuperLeaf;
    private boolean hasPowerStar;

    //Fields
    protected int x;
    protected int y;
    protected int vx;
    protected int vy;
    protected int size;
    

    //Constructor
    public PowerUps(int x, int y) {
        this.x = x;
        this.y = y;
        size = 50;
    }

    public PowerUps() {
        this(100,100);
    }
    
    public abstract void draw(Graphics g);
    
    public void update() {
        
    }
    
    public void gravity() {
        
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = 3;
    }

    public int getCoinCount() {
        return coinCount;
    }

    public void setCoinCount(int coinCount) {
        this.coinCount = coinCount;
    }

    public boolean isHasFireFlower() {
        return hasFireFlower;
    }

    public void setHasFireFlower(boolean hasFireFlower) {
        this.hasFireFlower = hasFireFlower;
    }

    public boolean isHasSuperLeaf() {
        return hasSuperLeaf;
    }

    public void setHasSuperLeaf(boolean hasSuperLeaf) {
        this.hasSuperLeaf = hasSuperLeaf;
    }

    public boolean isHasPowerStar() {
        return hasPowerStar;
    }

    public void setHasPowerStar(boolean hasPowerStar) {
        this.hasPowerStar = hasPowerStar;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}

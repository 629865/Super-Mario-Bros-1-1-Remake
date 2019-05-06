/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 629865
 */
public class Mario extends Creature {
    private int width = 35;
    private int height = 55;
ImageIcon ii = new ImageIcon(getClass().getResource("/images/Mario.gif"));
Image IMG = ii.getImage();
ImageIcon ii2 = new ImageIcon(getClass().getResource("/images/Raccoon Mario.gif"));
Image IMG2 = ii2.getImage();
ImageIcon ii3 = new ImageIcon(getClass().getResource("/images/Fire Mario.gif"));
Image IMG3 = ii3.getImage();
      @Override
    public void draw(Graphics g) {
        g.drawImage(IMG, x, y, width, height, null);
    }
    
   public void draw2(Graphics g) {
g.drawImage(IMG2, x, y, 82, 68, null);
    }
   public void draw3(Graphics g) {
g.drawImage(IMG3, x, y, 170, 170, null);
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

    public int getSize() {
        return size;
    }

    public ImageIcon getIi() {
        return ii;
    }

    public Image getIMG() {
        return IMG;
    }
     public Image getIMG2() {
        return IMG2;
    }
      public Image getIMG3() {
        return IMG3;
    }

    public void setIi(ImageIcon ii) {
        this.ii = ii;
    }

    public void setIMG(Image IMG) {
        this.IMG = IMG;
    }
    public void setIMG2(Image IMG2) {
        this.IMG2 = IMG2;
    }
    public void setIMG3(Image IMG3) {
        this.IMG3 = IMG3;
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

    public void setSize(int size) {
        this.size = size;
    }
    
    public void transform(Mario mario, SuperLeaf superLeaf) {
            mario.setIMG(ii2.getImage());
            width = 82;
            height = 68;
    }
    public void transform(Mario mario, FireFlower fireFlower) {
            mario.setIMG(ii3.getImage());
            width = 170;
            height = 170;
    }

}

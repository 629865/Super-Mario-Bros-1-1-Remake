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
public class Goomba extends Creature {
    
ImageIcon ii = new ImageIcon(getClass().getResource("/images/Goomba.gif"));
Image IMG = ii.getImage();

      @Override
    public void draw(Graphics g) {
        g.drawImage(IMG, x, y, 30, 30, null);
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

   

}

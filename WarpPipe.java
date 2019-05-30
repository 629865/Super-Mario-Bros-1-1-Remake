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
public class WarpPipe extends Blocks{
    ImageIcon ii = new ImageIcon(getClass().getResource("/images/Warp Pipe.png"));
Image IMG = ii.getImage();

@Override
    public void draw(Graphics g) {
    g.drawImage(IMG, 750, 768, 50, 50, null); 
    g.drawImage(IMG, 300, 766, 50, 50, null); 
}
    public boolean characterVsBlock(Mario c1, Blocks c2) {
             if (c1.getX() > 750 
            && c1.getX() < 750 + 25
            && c1.getY() > 768
            && c1.getY() < 768 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }    
             if (c1.getX() > 300 
            && c1.getX() < 300 + 25
            && c1.getY() > 766
            && c1.getY() < 766 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        } 
             
        return false;
    }
}

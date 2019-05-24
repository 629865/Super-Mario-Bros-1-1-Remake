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
public class BrickBlock extends Blocks{
    ImageIcon ii = new ImageIcon(getClass().getResource("/images/Brick Block.png"));
Image IMG = ii.getImage();

    @Override
    public void draw(Graphics g) {
        for (int i = 0; i < 5; i++){
            g.drawImage(IMG, 530, 700, 25, 25, null);
            g.drawImage(IMG, 480, 700, 25, 25, null);
            g.drawImage(IMG, (i*25)+580, 600, 25, 25, null);        
}   
    for (int i = 0; i < 3; i++){
    g.drawImage(IMG, (i*50)+100, 700, 25, 25, null);
}
    for (int i = 0; i < 2; i++){
    g.drawImage(IMG, (i*50)+123, 600, 25, 25, null);
}
}
    public boolean characterVsBlock(Mario c1, Blocks c2) {
        if (c1.getX() > 75 
            && c1.getX() < 75 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  if (c1.getX() > 100 
            && c1.getX() < 100 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
            if (c1.getX() > 150 
            && c1.getX() < 150 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
        
        if (c1.getX() > 100 
            && c1.getX() < 100 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
        
             if (c1.getX() > 123 
            && c1.getX() < 123 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
             if (c1.getX() > 173 
            && c1.getX() < 173 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
             if (c1.getX() > 150 
            && c1.getX() < 150 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
             if (c1.getX() > 175 
            && c1.getX() < 175 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
             if (c1.getX() > 200 
            && c1.getX() < 200 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
             if (c1.getX() > 125 
            && c1.getX() < 125 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
             if (c1.getX() > 100 
            && c1.getX() < 100 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
             if (c1.getX() > 555 
            && c1.getX() < 555 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
             if (c1.getX() > 580 
            && c1.getX() < 580 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }if (c1.getX() > 605 
            && c1.getX() < 605 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
            if (c1.getX() > 630 
            && c1.getX() < 630 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        } 
        if (c1.getX() > 655 
            && c1.getX() < 655 + 25
            && c1.getY() > 550
            && c1.getY() < 550 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
        if (c1.getX() > 455 
            && c1.getX() < 455 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }        
        if (c1.getX() > 480 
            && c1.getX() < 480 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
                if (c1.getX() > 505 
            && c1.getX() < 505 + 25
            && c1.getY() > 650
            && c1.getY() < 650 + 25){
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


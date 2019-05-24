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
public class TileBlock extends Blocks{
    ImageIcon ii = new ImageIcon(getClass().getResource("/images/Tile block.png"));
Image IMG = ii.getImage();


@Override
    public void draw(Graphics g) {
        for (int i = 0; i < 10; i++){
    g.drawImage(IMG, (i*25)+800, 790, 25, 25, null);}
            
    for (int i = 0; i < 9; i++){
    g.drawImage(IMG, (i*25)+825, 765, 25, 25, null);
        }
    for (int i = 0; i < 8; i++){
    g.drawImage(IMG, (i*25)+850, 740, 25, 25, null);
        }
    for (int i = 0; i < 7; i++){
    g.drawImage(IMG, (i*25)+875, 715, 25, 25, null);
        }
    for (int i = 0; i < 6; i++){
    g.drawImage(IMG, (i*25)+900, 690, 25, 25, null);
        }
    for (int i = 0; i < 5; i++){
    g.drawImage(IMG, (i*25)+925, 665, 25, 25, null);
        }
    for (int i = 0; i < 4; i++){
    g.drawImage(IMG, (i*25)+950, 640, 25, 25, null);
        }
    for (int i = 0; i < 3; i++){
    g.drawImage(IMG, (i*25)+975, 615, 25, 25, null);
        }
    for (int i = 0; i < 2; i++){
    g.drawImage(IMG, (i*25)+1000, 590, 25, 25, null);
        }
    for (int i = 0; i < 1; i++){
    g.drawImage(IMG, (i*25)+1025, 565, 25, 25, null);
        }
}
public boolean characterVsBlock(Mario c1, Blocks c2) {
             if (c1.getX() > 800 
            && c1.getX() < 800 + 25
            && c1.getY() > 740
            && c1.getY() < 740 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }    
//To change body of generated methods, choose Tools | Templates.
            if (c1.getX() > 275 
            && c1.getX() < 300 + 25
            && c1.getY() > 715
            && c1.getY() < 715 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
            if (c1.getX() > 275 
            && c1.getX() < 300 + 25
            && c1.getY() > 740
            && c1.getY() < 740 + 25){
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
            && c1.getX() < 325 + 25
            && c1.getY() > 715
            && c1.getY() < 715 + 25){
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
            && c1.getX() < 325 + 25
            && c1.getY() > 740
            && c1.getY() < 740 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        } 
            if (c1.getX() > 725 
            && c1.getX() < 750 + 25
            && c1.getY() > 715
            && c1.getY() < 715 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
            if (c1.getX() > 750 
            && c1.getX() < 775 + 25
            && c1.getY() > 715
            && c1.getY() < 715 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }   
            if (c1.getX() > 725 
            && c1.getX() < 750 + 25
            && c1.getY() > 740
            && c1.getY() < 740 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
            if (c1.getX() > 750 
            && c1.getX() < 775 + 25
            && c1.getY() > 740
            && c1.getY() < 740 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
            if (c1.getX() > 1010 
            && c1.getX() < 1010 + 25
            && c1.getY() > 515
            && c1.getY() < 515 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
            if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 515
            && c1.getY() < 515 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }
            if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 540
            && c1.getY() < 540 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }
            if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 565
            && c1.getY() < 565 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 590
            && c1.getY() < 590 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }
        if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 615
            && c1.getY() < 615 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }
        if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 640
            && c1.getY() < 640 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }
        if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 665
            && c1.getY() < 665 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }
        if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 690
            && c1.getY() < 690 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }
        if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 715
            && c1.getY() < 715 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }
        if (c1.getX() > 1000 
            && c1.getX() < 1000 + 25
            && c1.getY() > 740
            && c1.getY() < 740 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(4);
            c1.setVy(0);
           c1.move();
           return true;
        }
            
             if (c1.getX() > 775 
            && c1.getX() < 800 + 25
            && c1.getY() > 740
            && c1.getY() < 740 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
             if (c1.getX() > 800 
            && c1.getX() < 825 + 25
            && c1.getY() > 715
            && c1.getY() < 715 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
             if (c1.getX() > 825 
            && c1.getX() < 850 + 25
            && c1.getY() > 690
            && c1.getY() < 690 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
             if (c1.getX() > 850 
            && c1.getX() < 875 + 25
            && c1.getY() > 665
            && c1.getY() < 665 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
             if (c1.getX() > 875 
            && c1.getX() < 900 + 25
            && c1.getY() > 640
            && c1.getY() < 640 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
             if (c1.getX() > 900 
            && c1.getX() < 925 + 25
            && c1.getY() > 615
            && c1.getY() < 615 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
             if (c1.getX() > 925 
            && c1.getX() < 950 + 25
            && c1.getY() > 590
            && c1.getY() < 590 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
             if (c1.getX() > 950 
            && c1.getX() < 975 + 25
            && c1.getY() > 565
            && c1.getY() < 565 + 25){
            //Characters bounce in opposite directions
            c1.reverseX();
            c1.reverseY();
            c1.move();
            c1.setVx(0);
            c1.setVy(1);
           c1.move();
           return true;
        }  
             if (c1.getX() > 975 
            && c1.getX() < 1000 + 25
            && c1.getY() > 540
            && c1.getY() < 540 + 25){
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

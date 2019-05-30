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
public class Blocks extends PowerUps {
    
ImageIcon ii = new ImageIcon(getClass().getResource("/images/QuestionBlock.gif"));
Image IMG = ii.getImage();
ImageIcon ij = new ImageIcon(getClass().getResource("/images/QuestionBlockHit.png"));
Image IMGA = ij.getImage();

      @Override
    public void draw(Graphics g) {
        for (int i = 0; i < 2; i++){
        g.drawImage(IMG, 500, 696, 33, 33, null);
        //g.drawImage(IMGA, 1000, 27, 30, 30, null);    
    }
    for (int i = 0; i < 2; i++){
    g.drawImage(IMG, (i*50)+123, 696, 33, 33, null);
} 
    for (int i = 0; i < 1; i++){
    g.drawImage(IMG, (i*25)+146, 596, 33, 33, null);
} 
    
    }
}

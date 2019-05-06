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
ImageIcon ik = new ImageIcon(getClass().getResource("/images/Brick Block.png"));
Image IMGB = ik.getImage();
ImageIcon il = new ImageIcon(getClass().getResource("/images/Ground Block.png"));
Image IMGC = il.getImage();
ImageIcon im = new ImageIcon(getClass().getResource("/images/Tile block.png"));
Image IMGD = im.getImage();
ImageIcon in = new ImageIcon(getClass().getResource("/images/Warp Pipe.png"));
Image IMGE = in.getImage();


      @Override
    public void draw(Graphics g) {
        g.drawImage(IMG, x, y, 33, 33, null);
        g.drawImage(IMGA, 1000, 27, 30, 30, null);
        g.drawImage(IMGB, 500, 27, 25, 25, null);
        g.drawImage(IMGC, x, y, 25, 25, null);
        g.drawImage(IMGD, 400, 27, 25, 25, null);
        g.drawImage(IMGE, 750, 27, 75, 75, null);     
    }
    
}

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
public class GroundBlock extends Blocks{
    ImageIcon ii = new ImageIcon(getClass().getResource("/images/Ground Block.png"));
Image IMG = ii.getImage();

@Override
    public void draw(Graphics g) {
        for (int i = 0; i < 60; i++){
            g.drawImage(IMG, i*25, 815, 25, 25, null);

            
}   
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import spaceshooter.PowerUps;

/**
 *
 * @author 629865
 */
public class PowerStar extends PowerUps{
    ImageIcon ii = new ImageIcon(getClass().getResource("/images/PowerStar.png"));
Image IMG = ii.getImage();

      @Override
    public void draw(Graphics g) {
        g.drawImage(IMG, 350, 700, 35, 30, null);
    }
}

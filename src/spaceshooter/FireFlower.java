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
public class FireFlower extends PowerUps{
    ImageIcon ii = new ImageIcon(getClass().getResource("/images/FireFlower.png"));
Image IMG = ii.getImage();

public FireFlower(){
super(100,700);    
}
      @Override
    public void draw(Graphics g) {
        g.drawImage(IMG, x, 700, 50, 50, null);
    }
     public ImageIcon getIi() {
        return ii;
    }

    public Image getIMG() {
        return IMG;
    }

    public int getSize() {
        return size;
    }

    public void setIi(ImageIcon ii) {
        this.ii = ii;
    }

    public void setIMG(Image IMG) {
        this.IMG = IMG;
    }
    
}

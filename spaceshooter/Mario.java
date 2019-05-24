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
    private int width = 38;
    private int height = 58;
    private String state = "Mario";
ImageIcon ii = new ImageIcon(getClass().getResource("/images/Mario.gif"));
Image IMG = ii.getImage();
ImageIcon ii2 = new ImageIcon(getClass().getResource("/images/Raccoon Mario.gif"));
Image IMG2 = ii2.getImage();
ImageIcon ii3 = new ImageIcon(getClass().getResource("/images/Fire Mario.gif"));
Image IMG3 = ii3.getImage();
ImageIcon ii4 = new ImageIcon(getClass().getResource("/images/Marioleft.gif"));
Image IMG4 = ii4.getImage();
ImageIcon ii5 = new ImageIcon(getClass().getResource("/images/Raccoon Mario left.gif"));
Image IMG5 = ii5.getImage();
ImageIcon ii6 = new ImageIcon(getClass().getResource("/images/Fire Mario left.gif"));
Image IMG6 = ii6.getImage();
ImageIcon ii7 = new ImageIcon(getClass().getResource("/images/Mario Jump.png"));
Image IMG7 = ii7.getImage();
ImageIcon ii8 = new ImageIcon(getClass().getResource("/images/Mario Jump left.png"));
Image IMG8 = ii8.getImage();
ImageIcon ii9 = new ImageIcon(getClass().getResource("/images/Fire Mario Jump.png"));
Image IMG9 = ii9.getImage();
ImageIcon ii10 = new ImageIcon(getClass().getResource("/images/Fire Mario Jump left.png"));
Image IMG10 = ii10.getImage();
ImageIcon ii11 = new ImageIcon(getClass().getResource("/images/Raccoon Mario Jump.png"));
Image IMG11 = ii11.getImage();
ImageIcon ii12 = new ImageIcon(getClass().getResource("/images/Raccoon Mario Jump left.png"));
Image IMG12 = ii12.getImage();

      @Override
    public void draw(Graphics g) {
        g.drawImage(IMG, x, y, width, height, null);
    }
    
   public void draw2(Graphics g) {
g.drawImage(IMG2, x, y, 62, 48, null);
    }
   public void draw3(Graphics g) {
g.drawImage(IMG3, x, y, 170, 170, null);
    }
   public void draw4(Graphics g) {
        g.drawImage(IMG4, x, y, 170, 170, null);
    }
    
   public void draw5(Graphics g) {
g.drawImage(IMG5, x, y, 62, 48, null);
    }
   public void draw6(Graphics g) {
g.drawImage(IMG6, x, y, 170, 170, null);
    }
   public void draw7(Graphics g) {
g.drawImage(IMG7, x, y, 170, 170, null);
    }
   public void draw8(Graphics g) {
g.drawImage(IMG8, x, y, 170, 170, null);
    }
   public void draw9(Graphics g) {
g.drawImage(IMG9, x, y, 170, 170, null);
    }
   public void draw10(Graphics g) {
g.drawImage(IMG10, x, y, 170, 170, null);
    }
   public void draw11(Graphics g) {
g.drawImage(IMG11, x, y, 170, 170, null);
    }
   public void draw12(Graphics g) {
g.drawImage(IMG12, x, y, 170, 170, null);
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
      public Image getIMG4() {
        return IMG4;
    }
      public Image getIMG5() {
        return IMG5;
    }
      public Image getIMG6() {
        return IMG6;
    }
      public Image getIMG7() {
        return IMG7;
    }
      public Image getIMG8() {
        return IMG8;
    }
      public Image getIMG9() {
        return IMG9;
    }
      public Image getIMG10() {
        return IMG10;
    }
      public Image getIMG11() {
        return IMG11;
    }
      public Image getIMG12() {
        return IMG12;
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
    public void setIMG4(Image IMG4) {
        this.IMG4 = IMG4;
    }
    public void setIMG5(Image IMG5) {
        this.IMG5 = IMG5;
    }
    public void setIMG6(Image IMG6) {
        this.IMG6 = IMG6;
    }
    public void setIMG7(Image IMG7) {
        this.IMG7 = IMG7;
    }
    public void setIMG8(Image IMG8) {
        this.IMG8 = IMG8;
    }
    public void setIMG9(Image IMG9) {
        this.IMG9 = IMG9;
    }
    public void setIMG10(Image IMG10) {
        this.IMG10 = IMG10;
    }
    public void setIMG11(Image IMG11) {
        this.IMG11 = IMG11;
    }
    public void setIMG12(Image IMG12) {
        this.IMG12 = IMG12;
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
            width = 70;
            height = 57; 
            state = "superLeaf";
    }
    public void transform(Mario mario, FireFlower fireFlower) {
            mario.setIMG(ii3.getImage());
            width = 72;
            height = 58;
            state = "fireFlower";
            //if(faceleft == true){ 
            //mario.setIMG(ii6.getImage());
    //}
    
    }
    public void faceleft() {
            if (state.equals("Mario")){
               setIMG(ii4.getImage());
            width = 39;
            height = 55; 
            }            
        if (state.equals("superLeaf")){
               setIMG(ii5.getImage());
            width = 70;
            height = 60; 
            }  
        if (state.equals("fireFlower")){
               setIMG(ii6.getImage());
            width = 72;
            height = 58; 
            }  
        
    }
    public void faceright() {
            if (state.equals("Mario")){
               setIMG(ii.getImage());
            width = 39;
            height = 55; 
            }            
        if (state.equals("superLeaf")){
               setIMG(ii2.getImage());
            width = 70;
            height = 60;
            }  
        if (state.equals("fireFlower")){
               setIMG(ii3.getImage());
            width = 72;
            height = 58; 
            }  
            
    }
    public void jump(){
         
        {
            
        }
    }
    
    private static boolean facerightup;
    private static boolean faceleftup;
    
    public void facerightup() {
            setIMG(ii7.getImage());
            width = 65;
            height = 58;
    }
    public void faceleftup() {
            setIMG(ii8.getImage());
            width = 65;
            height = 56;
    }

}

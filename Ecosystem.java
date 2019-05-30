/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

/**
 *
 * @author jword
 */
public class Ecosystem extends JPanel {

    private Timer timer;
    private Mario mario;
    private Goomba goomba;
    private Koopa koopa;
    private FireFlower fireFlower;
    private SuperLeaf superLeaf;
    private PowerStar powerStar;
    private FlagPole flagPole;
    private WarpPipe warpPipe;
    private Blocks questionBlock;
    private Blocks questionBlockHit;
    private GroundBlock groundBlock;
    private BrickBlock brickBlock;
    private TileBlock tileBlock;
    private ArrayList<Mario> marios;
    private ArrayList<Goomba> goombas;
    private ArrayList<Koopa> koopas;
    private ArrayList<Blocks> blocks;
    private ArrayList<GroundBlock> groundBlocks;
    private ArrayList<BrickBlock> brickBlocks;
    private ArrayList<TileBlock> tileBlocks;
    private boolean levelComplete;
    private boolean touchFlagpole;
        
    public Ecosystem() {
        super();
        setSize(1200, 960);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 3000, 1000/60);
        mario = new Mario();
        
        fireFlower = new FireFlower();
        superLeaf = new SuperLeaf();
        powerStar = new PowerStar();
        questionBlock = new Blocks();
        questionBlockHit = new Blocks();
        groundBlocks = new ArrayList<>();
        brickBlocks = new ArrayList<>();
        tileBlocks = new ArrayList<>();
        flagPole = new FlagPole();
        warpPipe = new WarpPipe();
        marios = new ArrayList<>();
        goombas = new ArrayList<>();
        koopas = new ArrayList<>();
        blocks = new ArrayList<>();
        groundBlock = new GroundBlock();
        brickBlock = new BrickBlock();
        tileBlock = new TileBlock();
        
        blocks.add(new Blocks());
        spawnenemies();
        spawnblocks();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mario.draw(g);
        fireFlower.draw(g);
        superLeaf.draw(g);
        powerStar.draw(g);
        flagPole.draw(g);
        warpPipe.draw(g);
        groundBlock.draw(g);
        brickBlock.draw(g);
        tileBlock.draw(g);
        questionBlock.draw(g);
        questionBlockHit.draw(g);
        
    
    for (Goomba goomba : goombas) {
            if (goomba != null) {
                goomba.draw(g);
            }
        }
    for (Koopa koopa : koopas) {
            if (koopa != null) {
                koopa.draw(g);
            }
    }
    for (GroundBlock groundBlock : groundBlocks) {
            if (groundBlock != null) {
                groundBlock.draw(g);
            }
    }
    for (BrickBlock brickBlock : brickBlocks) {
            if (brickBlock != null) {
                brickBlock.draw(g);
            }
    }
    for (TileBlock tileBlock : tileBlocks) {
            if (tileBlock != null) {
                tileBlock.draw(g);
            }
    }
    if(levelComplete == true) {
            g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
            g.setColor(Color.black);
            g.drawString("Level Complete", 325, 400);
    }
    }

    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            wallCollisions(mario); 
            mario.update();
            fireFlower.update();
            superLeaf.update();
            powerStar.update();
            questionBlock.update();
            questionBlockHit.update();
            spawnblocks();
            repaint();
            
            for (Goomba goomba : goombas) {
                wallCollisions(goomba);
                characterVsCharacter (mario, goomba);
                    goomba.update();
            } 
            for (Koopa koopa : koopas) {
                wallCollisions(koopa);
                characterVsCharacter (mario, koopa);
                    koopa.update();
            } 
              for(int i = 0; i < Creature.size(); i++) {
                  for (int j = i +1; j < Creature.size(); j++) {
                    characterVsCharacter((Mario)Creature.get(i),(Mario)Creature.get(j));  
                  }
              }  
                    characterVsBlock(mario, flagPole);
                    
              
              for (Goomba goomba : goombas) {
                  for (Koopa koopa : koopas)
                      characterVsCharacter (goomba, koopa);
              }
              for (Koopa koopa : koopas) {
                  for (Goomba goomba : goombas)
                      characterVsCharacter (koopa, goomba);
              }
              
              if (characterVsCharacter(mario, superLeaf)){
                  mario.transform(mario, superLeaf);
                  
              }
              if (characterVsCharacter(mario, fireFlower)){
                  mario.transform(mario, fireFlower);
                  
              }
             
                  tileBlock.characterVsBlock (mario, tileBlock);
                  brickBlock.characterVsBlock (mario, tileBlock);
        
        }
        

        private boolean characterVsBlock(Mario c1, Blocks c2) {
             if (c1.getX() > c2.getX() 
            && c1.getX() < c2.getX() + c2.getSize()
            && c1.getY() > c2.getY()
            && c1.getY() < c2.getY() + c2.getSize()){
            //Characters bounce in opposite directions
            int tempVx = c1.getVx();
            int tempVy = c1.getVy();
            c1.setVx(c2.getVx());
            c1.setVy(c2.getVy());
            c2.setVx(tempVx);
            c2.setVy(tempVy);
           c1.move();
           return true;
        }
        return false;    
//To change body of generated methods, choose Tools | Templates.
        }

    }
    private boolean characterVsCharacter(Creature c1, Creature c2) {
        if (c1.getX() > c2.getX() 
            && c1.getX() < c2.getX() + c2.getSize()
            && c1.getY() > c2.getY()
            && c1.getY() < c2.getY() + c2.getSize()){
            //Characters bounce in opposite directions
            int tempVx = c1.getVx();
            int tempVy = c1.getVy();
            c1.setVx(c2.getVx());
            c1.setVy(c2.getVy());
            c2.setVx(tempVx);
            c2.setVy(tempVy);
           c1.move();
           c2.move();
           return true;
        }
        return false;    
    }
     private boolean characterVsCharacter(Creature c1, PowerUps c2) {
        if (c1.getX() > c2.getX() 
            && c1.getX() < c2.getX() + c2.getSize()
            && c1.getY() > c2.getY()
            && c1.getY() < c2.getY() + c2.getSize()){
            //Characters bounce in opposite directions
            int tempVx = c1.getVx();
            int tempVy = c1.getVy();
            c1.setVx(c2.getVx());
            c1.setVy(c2.getVy());
            c2.setVx(tempVx);
            c2.setVy(tempVy);
           c1.move();
           return true;
        }
        return false;    
    }
     private boolean characterVsBlock(Mario c1, Blocks c2) {
             if (c1.getX() > 1050
            && c1.getX() < 1050 + 250
            && c1.getY() > 365
            && c1.getY() < 365 + 450){
                 int tempVx = c1.getVx();
            int tempVy = c1.getVy();
            c1.setVx(c2.getVx());
            c1.setVy(c2.getVy());
            c2.setVx(tempVx);
            c2.setVy(tempVy);
           c1.move();
             levelComplete = true;
        return true;
        }
     return false;
}

    
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            mario.setVx(8);
            mario.faceright();
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            mario.setVx(-8);
            mario.faceleft();
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (mario.getVy()< 0){
           mario.setVy(14);
        }
    }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            mario.setVy(-8);
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            mario.setVx(0);
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            mario.setVx(0);
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
            if (mario.getVy()< 1)
            mario.setVy(14);
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            mario.setVy(0);
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            
        }  
    } 
    private void wallCollisions (Creature c) {
    //walls = this.getWidth(), this.getHeight(), 0
    //where the hero is = hero.getX(), hero.getY()
    if (c.x <= 0 || c.x + 20 >= this.getWidth()-10 ) {
        c.reverseX();
    }
    if (c.y <= 0 || c.y + 20 >= this.getHeight()-58 ) {
        c.reverseY();
    }
    
//TODO Implement this method

}
                 ArrayList Creature = new ArrayList<>();
                 
            //Polymorphism
    private void spawnenemies () {
        
            Goomba goomba = new Goomba();
            goomba.setX((int)+ 100);
            goomba.setY((int)+ 825);
            goombas.add (goomba);
            wallCollisions(goomba);
            Koopa koopa = new Koopa();
            koopa.setX((int) + 500);
            koopa.setY((int) + 1000);
            koopas.add (koopa);
            wallCollisions(koopa);

              
        }
    private void spawnblocks() {
        for (int i = 0; i < 5; i++){
            Blocks block = new Blocks();
            blocks.add(block);
     
}   
    }
    
    
}
      

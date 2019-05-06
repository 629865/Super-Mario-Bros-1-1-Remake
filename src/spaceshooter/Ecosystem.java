/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

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
    private Blocks questionBlock;
    private Blocks questionBlockHit;
    private ArrayList<Goomba> goombas;
    private ArrayList<Koopa> koopas;
    private ArrayList<Blocks> blocks;
        
    public Ecosystem() {
        super();
        setSize(1200, 960);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 2000, 1000/24);
        mario = new Mario();
        goomba = new Goomba();
        koopa = new Koopa();
        fireFlower = new FireFlower();
        superLeaf = new SuperLeaf();
        powerStar = new PowerStar();
        questionBlock = new Blocks();
        questionBlockHit = new Blocks();
        goombas = new ArrayList<>();
        koopas = new ArrayList<>();
        blocks = new ArrayList<>();
        goombas.add(new Goomba());
        koopas.add(new Koopa());
        blocks.add(new Blocks());
        spawnenemies();
        spawnblocks();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mario.draw(g);
        goomba.draw(g);
        koopa.draw(g);
        blocks.get(2).draw(g);
        fireFlower.draw(g);
        superLeaf.draw(g);
        powerStar.draw(g);
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
    for (Blocks block : blocks) {
            if (block != null) {
                block.draw(g);
            }
        }
    }

    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            wallCollisions(mario); 
            wallCollisions(goomba);
            wallCollisions(koopa);
            mario.update();
            goomba.update();
            koopa.update();
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
              for (Goomba goomba : goombas) {
                  for (Koopa koopa : koopas)
                      characterVsCharacter (goomba, koopa);
              }
              for (Koopa koopa : koopas) {
                  for (Goomba goomba : goombas)
                      characterVsCharacter (koopa, goomba);
              }
              
              if (characterVsCharacter(mario, superLeaf)){
                  mario.transform(mario , superLeaf);
                  
              }
              if (characterVsCharacter(mario, fireFlower)){
                  mario.transform(mario , fireFlower);
                  
              }
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

    
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            mario.setVx(4);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            mario.setVx(-4);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            mario.setVy(4);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            mario.setVy(-4);
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            mario.setVx(0);
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            mario.setVx(0);
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
            mario.setVy(0);
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            mario.setVy(0);
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            
        }
            
    } 
    private void wallCollisions (Creature c) {
    //walls = this.getWidth(), this.getHeight(), 0
    //where the hero is = hero.getX(), hero.getY()
    if (c.x <= 0 || c.x + 20 >= this.getWidth() ) {
        c.reverseX();
    }
    if (c.y <= 0 || c.y + 20 >= this.getHeight() ) {
        c.reverseY();
    }
//TODO Implement this method

}
                 ArrayList Creature = new ArrayList<>();
            //Polymorphism
    private void spawnenemies () {
        for (int i = 0; i < 2; i++){
            Goomba goomba = new Goomba();
            goomba.setX((int) (Math.random() * 800));
            goombas.add (goomba);
            wallCollisions(goomba);
            Koopa koopa = new Koopa();
            koopa.setX((int) (Math.random() * 1000));
            koopas.add (koopa);
            wallCollisions(koopa);
    koopas.add( new Koopa() );
        }        
        }
    private void spawnblocks() {
        for (int i = 0; i < 5; i++){
            Blocks block = new Blocks();
            block.setX(i);
            blocks.add (block);
            
}   
    }
}
      

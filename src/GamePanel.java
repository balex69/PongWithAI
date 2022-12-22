import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable{

    static final int GAME_LARGEUR = 1000, GAME_HAUTEUR = 600;
    static final Dimension TAILLE_ECRAN = new Dimension(GAME_LARGEUR,GAME_HAUTEUR);
    static final int DIAMETRE_BALLE = 24;
    static final int HAUTEUR_RAQUETTE = 100, LARGEUR_RAQUETTE = 24;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Raquette raquette1;
    Raquette raquette2;
    Balle balle;
    Score score;

    GamePanel(){

        reRaquettes();
        reBalle();

        score = new Score(GAME_LARGEUR, GAME_HAUTEUR);

        this.setFocusable(true);
        this.addKeyListener(new ActionListen());
        this.setPreferredSize(TAILLE_ECRAN);

        gameThread = new Thread(this);
        gameThread.start();


    }

    public void reBalle() {

    }
    public void reRaquettes() {
        raquette1 = new Raquette(0,(GAME_HAUTEUR/2)-(HAUTEUR_RAQUETTE/2),LARGEUR_RAQUETTE,HAUTEUR_RAQUETTE,1);
        raquette2 = new Raquette(GAME_LARGEUR-LARGEUR_RAQUETTE,(GAME_HAUTEUR/2)-(HAUTEUR_RAQUETTE/2),LARGEUR_RAQUETTE,HAUTEUR_RAQUETTE,2);
    }
    public void paint(Graphics g) {
        image = createImage(getWidth(),getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0, 0, this);
    }
    public void draw(Graphics g) {
        raquette1.draw(g);
        raquette2.draw(g);
    }
    public void move() {

    }
    public void collision() {

    }
    public void run() {
        long dernierTemps = System.nanoTime();
        double nbDeTicks = 60.0;
        double ns = 1000000000 / nbDeTicks;
        double delta = 0;
        while(true) {
            long maintenant = System.nanoTime();
            delta += (maintenant - dernierTemps);
            dernierTemps = maintenant;
            if(delta >=1) {
                move();
                collision();
                repaint();
                delta--;
            }
        }

    }
    public class ActionListen extends KeyAdapter {
        public void appuiTouche(KeyEvent e){
            raquette1.appuiTouche(e);
            raquette2.appuiTouche(e);
        }
        public void relacheTouche(KeyEvent e){
            raquette1.relacheTouche(e);
            raquette2.relacheTouche(e);
        }
    }
}

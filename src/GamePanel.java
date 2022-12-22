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



    }

    public void reBalle() {

    }
    public void reRaquettes() {

    }
    public void paint(Graphics g) {

    }
    public void draw(Graphics g) {

    }
    public void move() {

    }
    public void collision() {

    }
    public void run() {

    }
    public class ActionListen extends KeyAdapter {
        public void appuiTouche(KeyEvent e){

        }
        public void relacheTouche(KeyEvent e){

        }
    }
}

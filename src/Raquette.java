import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Raquette extends Rectangle {//implements ActionListen {

    int id;
    int yVitesse;
    Raquette(int x, int y, int LARGEUR_RAQUETTE, int HAUTEUR_RAQUETTE, int id) {
        super(x,y,LARGEUR_RAQUETTE,HAUTEUR_RAQUETTE);
        this.id=id;

    }

    public void appuiTouche(KeyEvent e) {

    }
    public void relacheTouche(KeyEvent e) {

    }
    public void definisDirY(int yDirection) { // pas besoin de X; la raquette ne se déplace que verticalement

    }
    public void move() {

    }
    public void draw(Graphics g){
        if(id==1) {
            g.setColor(new Color(0x2d7527));
        }
        else {
            g.setColor(new Color(0x75273c));
        }
        g.fillRect(x,y,width,height);

    }

}

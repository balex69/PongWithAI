import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Balle extends Rectangle{

    int xVitesse;
    int yVitesse;
    Random random;

    private BufferedImage imageBalle = ImageIO.read(getClass().getResource("/res/img/balle.png")); // (c) Freepik
    public Balle() throws IOException {

    }

    public void definisDirX(int randomxDirection) {

    }
    public void definisDiry(int randomyDirection) {

    }
    public void move() {

    }
    public void draw(Graphics g) {

    }
}

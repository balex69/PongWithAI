import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{

    int xVelocity;
    int yVelocity;
    Random random;

    /*private final BufferedImage imageBall; // (c) Freepik

    {
        try {
            imageBall = ImageIO.read(getClass().getResource("/res/img/balle.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

    public Ball(int x, int y, int width, int height) {
        super(x,y,width,height);
        random = new Random();

        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection);

    }

    public void setXDirection(int randomXDirection) {

        xVelocity = randomXDirection;

    }
    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }
    public void move() {
        x += xVelocity;
        y += yVelocity;

    }
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);
        //g.drawImage(imageBall, x, y, (ImageObserver) this);

    }
}

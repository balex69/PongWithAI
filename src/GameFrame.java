import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    GamePanel PongPanel;
    GameFrame(){

        PongPanel = new GamePanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(PongPanel);
        this.setTitle("Pong with AI!");
        this.setResizable(false);
        this.setBackground(new Color(0x1c2a63));
        this.pack();

        this.setVisible(true);

    }
}

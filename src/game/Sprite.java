package game;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Sprite {
int x, dx, y;
Image human;

public Sprite() {
    ImageIcon i = new ImageIcon("human.png");
    human = i.getImage();
    x = 10;
    y = 172;
    
}
public void move() {
    x = x + dx;
}

public int getX() {
    return x;
}

public int getY() {
    return y;
}

public Image getImage() {
    return human;
}

public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT);
        dx = -1;

        if (key == KeyEvent.VK_RIGHT)
            dx = 1;

}

public void keyReleased(KeyEvent e) {
    int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT);
        dx = 0;

        if (key == KeyEvent.VK_RIGHT)
            dx = 0;
    
}
}

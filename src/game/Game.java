package game;

import javax.swing.JFrame;

public class Game extends JFrame {

        public Game()
        {
            add( "board");
            setTitle("Side Scroller");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(960,448);
            setLocationRelativeTo(null);
            setVisible(true);
            setResizable(false);
        }

        private void add(String string) {
        }

        public static void main(String argv[]) {
            new Game();
        }

    }

    
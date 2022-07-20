import javax.swing.JFrame;

public class Game extends JFrame {

        public Game()
        {
            add( "Space Invaders");
            setTitle("Space Invaders");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,800);
            setLocationRelativeTo(null);
            setVisible(true);
            setResizable(true);
        }

        private void add(String string) {
        }

        public static void main(String argv[]) {
            new Game();
        }

    }

    
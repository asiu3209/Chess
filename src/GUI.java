import java.awt.*;
import javax.swing.*;
import java.util.*;
public class GUI extends JFrame{
    private JPanel panel;
    private JButton[][] buttons;
    private Spot[][] spots;
    private Board board;

    public GUI(){
        panel = new JPanel(new GridLayout(8,8));
        buttons = new JButton[8][8];
        board = new Board();
        for (int i = 0;i < buttons.length;i++){
            for (int j = 0;j<buttons[0].length;j++){
                panel.add(buttons[i][j]);
            }
        }
        add(panel);
    }
}
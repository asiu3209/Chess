import java.awt.*;
import javax.swing.*;
import java.util.*;
public class GUI extends JFrame{
    private JPanel panel;
    private JButton[][] buttons;
    private Spot[][] spots;

    public GUI(){
        buttons = new JButton[8][8];
        spots = new Spot[8][8];
        
    }
}
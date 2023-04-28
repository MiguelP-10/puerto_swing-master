package PaqG10_B;

import javax.swing.*;

public class PesoTotal extends JFrame {
    private JPanel contentPane;
    private JTextField mostrarpeso;
    private JLabel Pesotxt;


    public PesoTotal(Puerto hub) {
        setContentPane(contentPane);
        setTitle("Peso total del Hub");
        setSize(640, 420);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);


        mostrarpeso.setText(String.valueOf(hub.sumarPesos()));
    }
}

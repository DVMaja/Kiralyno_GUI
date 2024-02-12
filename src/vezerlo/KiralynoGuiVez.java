package vezerlo;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import modell.Tabla;
import nezet.Gui;

public class KiralynoGuiVez {

    private Gui nezet;
    private Tabla modell;

    public KiralynoGuiVez(Gui nezet, Tabla modell) {
        this.nezet = nezet;
        this.modell = modell;
        

        JRadioButton jRBkdb = nezet.getjRBkdb();
        JSpinner jSKdb = nezet.getjSKdb();
        jRBkdb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                jSKdb.setEnabled(jRBkdb.isSelected());

            }
        });

        JButton jBtujM = nezet.getjBtujM();
        JTextArea tAKHely = nezet.gettAKHely();

        jBtujM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modell.elhelyez(8);
                String i = tAKHely.getText() + modell.megjelenit() + "\n";
                tAKHely.setText(i);
                //tAKHely.getText()
            }
        });
    }

}

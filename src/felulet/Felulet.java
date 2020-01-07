
package felulet;

import java.awt.Container;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Felulet extends JFrame{
    
    private JButton btnFajlValaszto;
    private JPanel pnlHibak, pnlHaromszog, pnlAdat;
    private Container ablak;
    
    public Felulet(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        this.setTitle("Háromszög");
        
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.ablak = this.getContentPane();
        this.ablak.setLayout(null);
        
        /*BEGIN adatok betöltés*/
        this.btnFajlValaszto = new JButton();
        this.btnFajlValaszto.setText("Adatok betöltése");
        this.btnFajlValaszto.setSize(200,25);
        this.btnFajlValaszto.setLocation(20,20);
        
        this.btnFajlValaszto.add(this.btnFajlValaszto);
        
        
        
        /*END adatok betöltés*/
        
        
        
        /*itt kezdődik a hibák panelxd*/
        this.pnlHibak = new JPanel();
        this.pnlHibak.setLocation(20, 70);
        this.pnlHibak.setSize(500, 150);
        this.pnlHibak.setBorder(new TitledBorder("Hibák a kiválaszott állományban"));
        this.ablak.add(this.pnlHibak);
        /*itt végződik a hibák panel xdx*/
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

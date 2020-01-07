
package felulet;

import haromszogek.logika.DHaromszog;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Felulet extends JFrame{
    
    private JButton btnFajlValaszto;
    private JPanel pnlHibak, pnlHaromszog, pnlAdat;
    private Container ablak;
    private List<DHaromszog> haromSzogLista;
    
    private JFileChooser fcFajlValaszto;
    
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
        
        this.btnFajlValaszto.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adatokBetoltes(e);
            }
        }
        );
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
    
    private void adatokBetoltes(ActionEvent ae){
        this.fcFajlValaszto = new JFileChooser();
        if(fcFajlValaszto.showDialog(this, "Fájl megnyitása") != -1){
            String fajlNev = fcFajlValaszto.getSelectedFile().toString();
            fajlBeolvas(fajlNev);
        }
    }
    
    private void fajlBeolvas(String fajlNev){
        this.haromSzogLista = new ArrayList<>();
        try{
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            
            String sor = br.readLine();
            
            int i = 0;
            while (sor != null) {
                try{
                    DHaromszog dh = new DHaromszog(sor, i++);
                    this.haromSzogLista.add(dh);
                    sor = br.readLine();
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            br.close();
            fr.close();
        } catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        
        
    }
}

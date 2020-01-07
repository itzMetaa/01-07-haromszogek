
package felulet;

import javax.swing.JFrame;

public class Felulet extends JFrame{
    
    
    public Felulet(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        this.setTitle("Háromszög");
        
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

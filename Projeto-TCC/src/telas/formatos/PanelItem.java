
package telas.formatos;

import component.WrapLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class PanelItem extends JPanel{
    
    public PanelItem() {
        
        setBackground(new Color(102,102,102));
        setLayout(new WrapLayout(WrapLayout.LEFT, 8, 8));
        
    }
    
}

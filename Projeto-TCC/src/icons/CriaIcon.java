package icons;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class CriaIcon {

    public CriaIcon() {

    }
    
    public ImageIcon criaIcon(String url) {
        
        ImageIcon icon = null;
        
        if (!url.isEmpty()) {

            try{
            
                URL novaUrl = new URL(url);
                Image img = ImageIO.read(novaUrl);
                Image resizedImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                icon = new ImageIcon(resizedImg);
            
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }

        return icon;
    }
    
}

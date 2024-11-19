
package redirecionamentos;

import java.awt.Desktop;
import java.net.URL;


public class Redirecionamento {

    public Redirecionamento() {
    }
    
    public void abreSite() {
        
        try{
            
            Desktop.getDesktop().browse(new URL("http://localhost:8080/ecommerce/inicio").toURI());
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}

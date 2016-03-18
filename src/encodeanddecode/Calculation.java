package encodeanddecode;
import javax.swing.JTextArea;
import my.gui.GUI;
import org.jasypt.util.text.BasicTextEncryptor;
/**
 *
 * @author Hayden Meloche
 */
public class Calculation {
    BasicTextEncryptor bte = new BasicTextEncryptor();
    JTextArea textarea = new JTextArea();
    GUI gui = new GUI();
    
    
    String password = "SuchPassword,SoStrong";
    
    public void test() {
        //Used for testing
        System.out.println("It works!");
    }
    
    public boolean dataValidation(String UserInput) {
        boolean x = UserInput.isEmpty();
        return x;
    }
    
    public boolean passValidation(String UserPass) {
        boolean x = UserPass.isEmpty();
        return x;
    }
    
    public void setPass() {
        bte.setPassword(password);
    }
    
    public void setPass(String UserPass) {
        bte.setPassword(UserPass);
    }
    
     String EncrypteMe;
    
    public String encode(String UserInput) {
        String text = UserInput;
        System.out.printf("Text to be encoded is: %s \n", text);
        String encrypted = bte.encrypt(text);
        System.out.printf("Encoded string is: %s \n", encrypted);
        JTextArea jtext = new JTextArea();
        jtext.setText(encrypted);
        jtext.append(encrypted);  
        EncrypteMe = encrypted;
        return encrypted;
         
    }
          
    public String decode(String DecodeMe) {
        String original = bte.decrypt(DecodeMe);
        
        System.out.printf("Decrypted String is: %s \n", original);
        return original;
    }
}

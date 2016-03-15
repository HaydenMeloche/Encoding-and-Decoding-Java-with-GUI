/*
 *Hayden Meloche - 000363920
 *Mar 14, 2016
 *PURPOSE**
 *I, Hayden Meloche, 000363920 certify that this material is my original work. 
 *No other person's work has been used without due acknowledgment.
 */
package encodeanddecode;
import java.awt.TextArea;
import my.gui.GUI;
import java.util.Scanner;
import javax.swing.JTextArea;
import org.jasypt.util.text.BasicTextEncryptor;
/**
 *
 * @author Hayden Meloche
 */
public class Calculation {
    BasicTextEncryptor bte = new BasicTextEncryptor();
    GUI gui = new GUI();
    
    
    String password = "dfshjksfadjh";
    
    public void test() {
        System.out.println("It works!");
    }

    public void setPass() {
        bte.setPassword(password);
    }
    
     String EncrypteMe;
    
    public String encode(String UserInput) {
        String text = UserInput;
        System.out.printf("Text to be encoded is: %s \n", text);
        String encrypted = bte.encrypt(text);
        System.out.printf("Encoded string is!: %s \n", encrypted);
        EncrypteMe = encrypted;
        return encrypted;
         
    }
    
    private void returnEn(String encrypted) {
        //TextArea.setText(encrypted);
    }
    
    public String decode(String DecodeMe) {
        String original = bte.decrypt(DecodeMe);
        System.out.printf("Decrypted String is: %s \n", original);
        return original;
    }
}

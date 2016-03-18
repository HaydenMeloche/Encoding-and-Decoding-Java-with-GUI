package encodeanddecode;

import javax.swing.JTextArea;
import my.gui.GUI;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 * This class does all the calculations.
 *
 * @author Hayden Meloche
 */
public class Calculation {

    BasicTextEncryptor bte = new BasicTextEncryptor();
    JTextArea textarea = new JTextArea();
    GUI gui = new GUI();

    String password;
    String EncrypteMe;

    /**
     * Constructor sets key to default if user does not enter their own.
     */
    public Calculation() {
        this.password = "SuchPassword,SoStrong";
    }

    /**
     * Method used for testing
     */
    public void test() {
        System.out.println("It works!");
    }

    /**
     * Ensures user doesn't try to encrypt empty string
     *
     * @param UserInput User's Input from textbox
     * @return boolean value for validation
     */
    public boolean dataValidation(String UserInput) {
        boolean x = UserInput.isEmpty();
        return x;
    }

    /**
     * Checks if password field is empty or not
     *
     * @param UserPass String for user's password
     * @return boolean value for decision.
     */
    public boolean passValidation(String UserPass) {
        boolean x = UserPass.isEmpty();
        return x;
    }

    /**
     * Sets password to default if nothing is entered.
     */
    public void setPass() {
        bte.setPassword(password);
    }

    /**
     * Sets password to user's choice if UserPass meets validation
     *
     * @param UserPass User's password.
     */
    public void setPass(String UserPass) {
        bte.setPassword(UserPass);
    }

    /**
     * Encodes string using password.
     *
     * @param UserInput User's input
     * @return encoded string
     */
    public String encode(String UserInput) {
        String text = UserInput;
        System.out.printf("Text to be encoded is: %s \n", text);
        String encrypted = bte.encrypt(text);
        System.out.printf("Encoded string is: %s \n", encrypted);
        EncrypteMe = encrypted;
        return encrypted;
    }

    /**
     * Decodes string
     *
     * @param DecodeMe String to be decoded
     * @return Decoded string
     */
    public String decode(String DecodeMe) {
        String original = bte.decrypt(DecodeMe);

        System.out.printf("Decrypted String is: %s \n", original);
        return original;
    }
}

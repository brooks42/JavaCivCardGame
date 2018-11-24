package console;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Acts as the layer between the console input and game controller
 *
 * @author brooks42
 */
public class TextBasedInputLayer {

    private Scanner scanner;
    
    private final TextBasedGamePresenter textBasedGamePresenter;
    
    public TextBasedInputLayer(TextBasedGamePresenter textBasedGamePresenter) {
        this.textBasedGamePresenter = textBasedGamePresenter;
    }
    
    public void hookToInputStream(InputStream stream) {
        scanner = new Scanner(new InputStreamReader(stream));
        
        while (scanner.hasNext()) {
            String option = scanner.next();
            
            System.out.println("echo: " + option);
            
            if ("exit".equals(option)) {
                break;
            }
            
            if ("look".equals(option)) {
                
            }
        }
    }
}

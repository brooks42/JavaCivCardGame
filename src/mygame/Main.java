package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import components.Card;
import components.CardFactory;
import components.CardInfo;
import components.Game;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        
        System.out.println("Program parameters: " + Arrays.toString(args));
        
        Game game = new Game();
        
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        while (scanner.hasNext()) {
            String option = scanner.next();
            
            System.out.println("echo: " + option);
            
            if ("exit".equals(option)) {
                break;
            }
            
            if ("card".equals(option)) {
                try {
                    CardInfo info = new CardInfo();

                    CardFactory<Card> cardFactory = new CardFactory<>(Card.class);
                    cardFactory.setCardInfo(info);
                    cardFactory.create();
                    
                    System.out.println("built a card");
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        
        // TODO: uncomment the lines below when it's time to make the game itself
        //        Main app = new Main();
        //        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);

        rootNode.attachChild(geom);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}

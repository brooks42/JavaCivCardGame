package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import console.TextBasedGamePresenter;
import console.TextBasedGameDisplay;
import console.TextBasedInputLayer;
import gamemvp.GameModel;
import gamemvp.GamePresenter;
import gamemvp.BaseGameDisplay;
import java.util.Arrays;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    
    private BaseGameDisplay gameView;
    
    private GamePresenter gamePresenter;
    
    private GameModel game;
    
    private TextBasedInputLayer inputLayer;

    public static void main(String[] args) {
        
        System.out.println("Program parameters: " + Arrays.toString(args));
        
        Main main = new Main();
        main.startNewGame();
        
        // TODO: uncomment the lines below when it's time to make the game itself
//        Main app = new Main();
//        app.start();
    }
    
    private void startNewGame() {
        game = new GameModel();
        gameView = new TextBasedGameDisplay(System.out);
        gamePresenter = new TextBasedGamePresenter(game);
        gamePresenter.bindView(gameView);
        inputLayer = new TextBasedInputLayer((TextBasedGamePresenter)gamePresenter);
        inputLayer.hookToInputStream(System.in); // this will loop forever and act as our game loop clock
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

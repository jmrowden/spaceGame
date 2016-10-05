package spacex33;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ship extends Node{
    final int SHIP_GAP = 10; //gap between lanes of the ship
    
    private int width; //width of the ship img
    private int height; //height of the ship img
    private Image ship_src = new Image("file:resource/ship.png", true);
    ImageView shipView = new ImageView();
    
    public Ship(){
        super();
        width = 60;
        height = 60;
    }
    
    public Ship(int w, int h){
        super();
        width = w;
        height = h;
    }

    public ImageView initShipGraphics() {
        shipView.setImage(ship_src);
        shipView.setTranslateY(620); // 900-105-75 to get 720. This give a 75px gap from the bottom of the page
        shipView.setTranslateX(SHIP_GAP); //sets the X coordinate to be 10px away from the edge
        //sets the 
        return shipView;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public int getGap(){
        return SHIP_GAP; //returns the ship gap
    }
        
    public void setWidth(int w){
        width = w;
    }
    
    public void setHeight(int h){
        height = h;
    }
    
    @Override
    protected NGNode impl_createPeer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BaseBounds impl_computeGeomBounds(BaseBounds bounds, BaseTransform tx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean impl_computeContains(double localX, double localY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object impl_processMXNode(MXNodeAlgorithm alg, MXNodeAlgorithmContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

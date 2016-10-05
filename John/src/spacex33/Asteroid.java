package spacex33;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Asteroid extends Node implements Obstacle {
    private int width; //width of the image
    private int height; //height of the image
    private Image asteroid_image = new Image("file:resource/asteroid.png", true); //sets the path of the asteroid image
    public ImageView astImage = new ImageView(asteroid_image); //sets up the imageviewer for the asteroid image
    
    final int EDGE_OBSTACLE_GAP = 15; //the gap on the edge is 5px larger than the ship gap because it takes 5px extra on one side
    final int MID_OBSTACLE_GAP = EDGE_OBSTACLE_GAP + 5; //the gaps beween lanes in the middle are 5px bigger because it takes 5 off both sides
    //gaps need to be slightly larger so that the edges of the obstacles don't touch the ship as they pass
    
    public Asteroid(){
        super();
        width = 50;
        height = 50;
        //default width and height are 95 because that's what we're using, but this is subject to change
    }
    
    public Asteroid(int w, int h){
        super();
        width = w;
        height = h;
    }
    
    public ImageView initAsteroidGraphics(){
        astImage.setFitWidth(width);
        astImage.setFitHeight(height);
        //sets the width and height of the image
        return astImage;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public int getEdgeGap(){
        return EDGE_OBSTACLE_GAP;
    }
    
    public int getMidGap(){
        return MID_OBSTACLE_GAP;
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

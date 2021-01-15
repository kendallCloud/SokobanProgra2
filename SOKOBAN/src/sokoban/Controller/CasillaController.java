/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban.Controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import sokoban.Clases.Casilla;
import sokoban.Util.AppContext;

/**
 * FXML Controller class
 *
 * @author Kendall
 */
public class CasillaController extends Controller {

    /**
     * Initializes the controller class.
     */
    Casilla obj;
    @FXML
    private ImageView img;
    @FXML
    private Pane pane;
    
    private final PuzzleController cnt = (PuzzleController) AppContext.getInstance().get("tablero");

    public CasillaController(Casilla obj) {
        this.obj = obj;
        img.setImage(new Image(obj.getImg()));
    }
    
    

    public Casilla getObj() {
        return obj;
    }

    public void setObj(Casilla obj) {
        this.obj = obj;
       
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    
    
    @Override
    public void initialize() {
       
    }

    @Override
    public Node getRoot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void Click(MouseEvent event) {
        cnt.CasillaClick(this);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxpool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Shear;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author 1
 */
public class MaxPool extends Application {

    int balls;

    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Group root = new Group();

        Scene scene = new Scene(root, 1000, 1000);

        stage.setTitle("FXML welcome");
        stage.setScene(scene);
        stage.show();

        // object bounding box relative (proportional:true, default)
        /*Stop[] stops = {new Stop(0, Color.WHITE), new Stop(0.5, Color.BLACK), new Stop(1, Color.OLIVE)};
         LinearGradient lg = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
         Rectangle r = new Rectangle(500,500);
         r.setFill(lg);

         root.getChildren().add(r);*/

        Text text = new Text("Using Shear for pseudo-italic font");
        text.setX(20);
        text.setY(50);
        text.setFont(new Font(20));

        //text.getTransforms().add(new Shear(-0.35, 0));

        root.getChildren().add(text);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

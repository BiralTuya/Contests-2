/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author USER
 */
public class JavaFXApplication6 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       
      
       
         
        primaryStage.setTitle("Hello World!");
        
        
    GridPane grid = new GridPane();
    grid.setHgap(10);
    grid.setVgap(10);
    //grid.setPadding(new Insets(0, 10, 0, 10));
    Scene scene = new Scene(grid, 300, 250);
     primaryStage.setScene(scene);
     
     Label lbl1= new Label ("name");
     grid.add(lbl1, 1, 0);
   
     
     TextField text =new TextField();
     grid.add(text, 2, 0);
     
     Label lbl = new Label("password");
     grid.add(lbl,1,1);
    
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

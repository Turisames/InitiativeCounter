/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initiativecounterapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

/**
 *
 * @author Turisames
 */
public class InitiativeCounterApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        /*Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
        
        /*This is the StackPane.
        It is into this that the widgets go.*/
        //StackPane root = new StackPane();
        //root.getChildren().add(btn, 1, 0);
        
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(5);
        root.setHgap(5);
        // Gridpane stops here.
        
        TextField Name = new TextField();
        
        //root.getChildren().add(Name);
        root.add(Name, 0, 0);
        
        TextField Name1 = new TextField();
        root.add(Name1, 0, 1);
        //root.getChildren().add(Name1);
        
        Button NameButton = new Button("Name");
        root.add(NameButton, 1, 0);
        Button InitiativeButton = new Button("Initiative");
        root.add(InitiativeButton, 1, 1);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

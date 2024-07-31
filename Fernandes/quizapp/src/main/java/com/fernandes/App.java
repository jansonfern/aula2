package com.fernandes;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;

public class App extends Application {

   public static void main(String[] args) {
       Application.launch(args);
   }


   @Override
   public void start(Stage stage) throws Exception {
    VBox root = new VBox();
   root.setStyle("-fx-background-color: green");
   Scene scene = new Scene(root,600,800);
   stage.setScene(scene);
   stage.show();

   }
   
}

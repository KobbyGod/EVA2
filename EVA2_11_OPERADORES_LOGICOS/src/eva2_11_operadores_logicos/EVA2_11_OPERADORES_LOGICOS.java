/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_operadores_logicos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author invitado
 */
public class EVA2_11_OPERADORES_LOGICOS extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
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
        Boolean Dinero, buenClima;
        
        
       Dinero = false;
       buenClima = false;
        System.out.println("NO ESTA BUENO EL DIA Y NO HAY FERIA");
       if((Dinero == true) && (buenClima == true))
           System.out.println("HOY SE COME :D");
       else
           System.out.println("HUEVITO SERÁ :c");
       
       Dinero = false;
       buenClima = true;
       System.out.println("NO HAY DINERO PERO BUEN CLIMA SI");
       if((Dinero == true) && (buenClima == true))
           System.out.println("HOY SE COME :D");
       else
           System.out.println("HUEVITO SERÁ :c");
       
       Dinero = true;
       buenClima = false;
       System.out.println("HAY DINERO PERO NO BUEN CLIMA");
       if((Dinero == true) && (buenClima == true))
           System.out.println("HOY SE COME :D");
       else
           System.out.println("HUEVITO SERÁ :c");
       
       Dinero = true;
       buenClima = true;
        System.out.println("HAY DINERO Y BUEN CLIMA");
       if((Dinero == true) && (buenClima == true))
           System.out.println("HOY SE COME :D");
       else
           System.out.println("HUEVITO SERÁ :c");
    }
    
}

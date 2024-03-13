/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_operadores_lógicos;

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
public class EVA2_2_OPERADORES_LÓGICOS extends Application {
    
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
        boolean A, B;
        A = false;
        B = false;
        boolean resu;
        //AND ---> &&
        resu = A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = true;
        resu = A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = false;
        resu = A && B;
        System.out.println("Resu = " + resu);
       A = false;
        B = false;
        resu = A && B;
        System.out.println("Resu = " + resu);
        //operador OR --> ||
        A = false;
        B = false;
        resu = A || B;
        System.out.println("Resu (or) =" + resu);
        //Negacion
        A = false;
        resu = !A;
        System.out.println("Resu (!) = " + resu);
    }
    
}

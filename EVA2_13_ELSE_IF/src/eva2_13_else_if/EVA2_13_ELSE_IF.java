/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_else_if;

import java.util.Scanner;
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
public class EVA2_13_ELSE_IF extends Application {
    
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
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el dia de la semana del 1 al 7");
        dia = captu.nextInt();
        
        if (dia == 1)
            System.out.println("Domingo");
        else
            if(dia == 2)
                System.out.println("Lunes");
            else if(dia == 3)
        System.out.println("Martes");
            else if(dia == 4)
        System.out.println("Miercoles");
            else if(dia == 5)
        System.out.println("Jueves");
            else if(dia == 6)
        System.out.println("Viernes");
            else if(dia == 7)
        System.out.println("Sabado");
                
                        
    }
    
}

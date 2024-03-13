/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_comparar;

import static java.sql.DriverManager.println;
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
public class EVA2_6_COMPARAR extends Application {
    
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
        //CUAL ES EL MAYOR ENTRE LOS NUMEROS
        //PIDAN AL USUARIO DOS NUMEROS ENTEROS
         int num1, num2;
         Scanner captu = new Scanner(System.in);
         System.out.println("Valor 1:");
         num1 = captu.nextInt();
         System.out.println("Valor 2:");
         num2 = captu.nextInt();
         //CUAL ES EL MAYOR
         if(num1 > num2)
         System.out.println(num1 + " Es mayor");
         else{
             if(num1 == num2) //num1 es igual a num2
                 System.out.println(" Son iguales");
             else
         System.out.println(num2 + " Es mayor");
         
         
         }  
         
         
    }
    
}

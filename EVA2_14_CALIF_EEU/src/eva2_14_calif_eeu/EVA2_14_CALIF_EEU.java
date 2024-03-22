/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_calif_eeu;

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
public class EVA2_14_CALIF_EEU extends Application {
    
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
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce una calificación (0-100): ");
        calif = captu.nextInt();
        
        if((calif >= 90) && (calif <= 100))
            System.out.println("A");
        else if ((calif >=80)&&(calif <= 89))
            System.out.println("B");
        else if ((calif >=70)&&(calif <= 79))
            System.out.println("C");
        else if ((calif >=60)&&(calif <= 69))
            System.out.println("D");
        else if (calif <60)
            System.out.println("F");
        
    }
    
}

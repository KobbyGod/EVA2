/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_par_impar;

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
public class EVA2_7_PAR_IMPAR extends Application {
    
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
        int num, divi, resi;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        num = captu.nextInt();
        divi = num/2;
        System.out.println("División entera de " + num + " /2 =  " + divi);
        resi = num % 2;
        System.out.println("El residuo de " + num + " %2 =  " + resi);
        //NUMERO PAR O IMPAR
        if(resi == 0)
            System.out.println(num + " es par");
        else
            System.out.println(num + " es impar");
        
        
        
    }
    
}

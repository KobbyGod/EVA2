/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_operadores;

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
public class EVA2_OPERADORES extends Application {
    
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
        int num1, num2;
        num1 =5;
        num2 = 3;
        int suma = num1 + num2; //operador de suma +
        System.out.println("La suma es " + suma);
        boolean prueba = true;
        System.out.println("El valor de prueba es " + prueba);
        //Multiplicacion
        int multi;
        multi = num1 * num2;
        System.out.println("La multiplicacion es " + multi);
        //Division
        int divi = 7 / 2;
        System.out.println("La division de 7 / 2 es " + divi);
        //Para tener el resultado esperado:
        double diviDouble = 7/2.0;
        System.out.println("La diviDouble es " + diviDouble);
        //Acumuladores
        //Suma+=, Resta-=, Multi +=, Divi/=
        int sumatoria = 0;
       /* sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria + 80; */
        sumatoria += 90;
        sumatoria += 80;
        sumatoria += 80;
     
        System.out.println("El resultado es " + sumatoria);
        
        sumatoria -= 70; //Le resto 70
        System.out.println("La sumatoria es " + sumatoria);
        //
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("El resultado es " + multiAcum);
        multiAcum *= 3;
        System.out.println("El resultado es " + multiAcum);
         
        
        
        
        
        
    }
    
}

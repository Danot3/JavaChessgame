/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Daniyal Tariq
 */
public class  NewFXMain extends Application {
    
    private ChessBoard b = new ChessBoard();
    
    
    
    @Override
    public void start(Stage primaryStage) {
       
       // StackPane root = new gridPane();
        GridPane gridPane = new GridPane();   
        SquareEventHandler seh =  new SquareEventHandler(b);
        
         boolean ch = false;
        
        //Button[][] Array1 = new Button[8][8];
        for (int i = 0;i< 8;i++){
            for (int j =  0; j < 8;j++){
               // Array1[i][j] =  new Button ( " " + i + j);
                //Array1[i][j].setOnAction(new assignhandle());
               // gridPane.add(Array1[i][j],i,j);
               Square square = board.getSquare(new Coordinate(i,j));
                
            }
        }
        
        Scene scene = new Scene(gridPane, 300, 250);
        
        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
    class assignhandle implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("ActionEvent " + event.getSource() );
    }
    
}
    public static void main(String[] args) {
        launch(args);
    }
    
}

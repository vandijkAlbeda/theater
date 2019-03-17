package ioo2_opdracht52;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Hart;
import domain.Lamp;
import proces.ChirurgPresenter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import proces.AnesthesistPresenter;

/**
 *
 * @author H.M
 */
public class Ioo2_opdracht51 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        System.out.println("\n-------------------------------------Start");
        Hart hart = new Hart();
        Lamp lamp = new Lamp();
        
        ChirurgPresenter chirurg = new ChirurgPresenter (hart, lamp);
        AnesthesistPresenter anesthesist = new AnesthesistPresenter(hart);
        
        System.out.println("\n------------------------------------Connect");
        chirurg.cmdConnect();
        System.out.println("\n--------------------------------Defibrileer");        
        chirurg.cmdDefibriller();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

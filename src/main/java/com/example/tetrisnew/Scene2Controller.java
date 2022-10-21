package com.example.tetrisnew;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Scene2Controller implements Initializable {

    @FXML
    private Rectangle newRectangle;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(newRectangle);
        translate.setDuration(Duration.seconds(12));
        translate.setCycleCount(1);
        translate.setByY(470);
        translate.play();
    }
}
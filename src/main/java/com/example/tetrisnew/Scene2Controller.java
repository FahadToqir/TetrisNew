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
    private Rectangle newRectangle2;

    @FXML
    private Rectangle newRectangle3;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        TranslateTransition translate = new TranslateTransition();
        TranslateTransition translate2 = new TranslateTransition();
        translate.setNode(newRectangle2);
        translate.setDuration(Duration.seconds(12));
        translate.setCycleCount(1);
        translate.setByY(510);
        translate.play();

        translate2.setNode(newRectangle3);
        translate2.setDuration(Duration.seconds(13));
        translate2.setCycleCount(1);
        translate2.setByY(490);
        translate2.play();
    }
}
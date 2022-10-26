package com.example.tetrisnew;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.Normalizer;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        String css = HelloApplication.class.getResource("styles.css").toExternalForm();
        Image icon = new Image("https://s3.amazonaws.com/tetris-www/assets/editorial/2020/07/tetris-logo.png");
        stage.setTitle("Tetris");
        stage.getIcons().add(icon);
        stage.setWidth(420);
        stage.setHeight(600);
        stage.setResizable(false);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(Scene2Controller::keyPressed);
    }

    public static void main(String[] args) {
        launch();
    }
}
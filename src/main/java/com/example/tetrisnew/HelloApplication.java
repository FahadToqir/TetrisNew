package com.example.tetrisnew;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.Normalizer;

public class HelloApplication extends Application {
    public static final int MOVE = 25;
    public static final int SIZE = 25;
    public static int XMAX = SIZE * 12;
    public static int YMAX = SIZE * 24;
    public static int [][] MESH = new int [XMAX/SIZE][YMAX/SIZE];
    private static Pane groupe = new Pane();
    private static Normalizer.Form object;
    private static Scene scene = new Scene(groupe, XMAX + 150, YMAX);
    public static int score = 0;
    public static boolean game = true;
    private static Form nextObj = MovementController.makeRect();
    private static int linesNo = 0;

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


    }

    public static void main(String[] args) {
        launch();
    }
}
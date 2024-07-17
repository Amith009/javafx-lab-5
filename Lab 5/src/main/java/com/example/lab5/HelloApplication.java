package com.example.lab5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.google.gson.Gson;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //stage.setTitle("Hello!");
        //Button button=new Button("parse JSON");
        //button.setOnAction(e -> parseJSON() );
        //VBox vbox=new VBox(button);
        //scene = new Scene(vbox, 120, 120);

        stage.setScene(scene);
        stage.show();

    }

        public static void main(String[] args) {
            launch();
        }
    }

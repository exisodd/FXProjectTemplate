package edu.vanier.template;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * This is a JavaFX project template to be used for creating GUI applications.
 * JavaFX 20.0.2 is already linked to this project in the build.gradle file.
 * @link: https://openjfx.io/javadoc/20/
 * @see: Build Scripts/build.gradle
 * @author Sleiman Rabah.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Open new window");
        Button button2 = new Button("Add button");
        Button button3 = new Button("Button 3");

        HBox root = new HBox(button1, button2, button3);
        root.setAlignment(Pos.CENTER);

        button1.setOnAction(e -> {
            PopupWindow popupWindow = new PopupWindow();
            popupWindow.show();
        });

        button2.setOnAction(e -> {
            root.getChildren().add(new Button("new button"));
        });

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Title bar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

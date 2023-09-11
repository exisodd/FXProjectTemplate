package edu.vanier.template;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PopupWindow extends Stage {
    public PopupWindow() {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 100);
        setScene(scene);
        setTitle("Popup window example");
    }
}

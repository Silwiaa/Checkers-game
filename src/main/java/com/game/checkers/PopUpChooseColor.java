package com.game.checkers;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Popup;

public class PopUpChooseColor {
    private Button chooseWhiteBtn = new Button();
    private Button chooseBlackBtn = new Button();
    private Label popupLabel = new Label("Choose your color:");
    private FlowPane popupPane = new FlowPane();
    private Popup chooseColor = new Popup();

    public Popup setChoseColorPupUp() {

        chooseWhiteBtn.setText("BLACK");
        chooseBlackBtn.setText("WHITE");

        popupLabel.setMinWidth(350);
        popupLabel.setMinHeight(50);
        popupLabel.setAlignment(Pos.CENTER);
        popupLabel.setTextFill(Color.web("#000"));
        popupLabel.setFont(new Font("Arial", 16));

        popupPane.setAlignment(Pos.CENTER);
        popupPane.setStyle(" -fx-background-color: white;");
        popupPane.setHgap(5.5);
        popupPane.setVgap(5.5);
        popupPane.getChildren().add(popupLabel);
        popupPane.getChildren().add(chooseWhiteBtn);
        popupPane.getChildren().add(chooseBlackBtn);
        popupPane.setPadding(new Insets(15));

        chooseColor.getContent().add(popupPane);

        return chooseColor;
    }

    public Button getWhiteButton() {
        return chooseWhiteBtn;
    }

    public Button getBlaclButton() {
        return chooseBlackBtn;
    }
}

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
    private Popup popPup = new Popup();
    private Label popupLabel;
    private FlowPane popupPane = new FlowPane();

    public Popup setChoseColorPupUp() {

        popupLabel = new Label("Choose your color:");
        chooseWhiteBtn.setText("WHITE");
        chooseBlackBtn.setText("BLACK");

        decoratePopup();

        popupPane.getChildren().add(popupLabel);
        popupPane.getChildren().add(chooseWhiteBtn);
        popupPane.getChildren().add(chooseBlackBtn);

        popPup.getContent().add(popupPane);

        return popPup;
    }

    public void decoratePopup() {
        popupLabel.setMinWidth(350);
        popupLabel.setMinHeight(50);
        popupPane.setHgap(5.5);
        popupPane.setVgap(5.5);
        popupLabel.setAlignment(Pos.CENTER);

        popupLabel.setTextFill(Color.web("#000"));
        popupLabel.setFont(new Font("Arial", 16));

        popupPane.setAlignment(Pos.CENTER);
        popupPane.setStyle(" -fx-background-color: white;");
        popupPane.setPadding(new Insets(15));
    }

    public Button getWhiteButton() {
        return chooseWhiteBtn;
    }

    public Button getBlackButton() {
        return chooseBlackBtn;
    }
}

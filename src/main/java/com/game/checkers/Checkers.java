package com.game.checkers;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Popup;
import javafx.stage.Stage;

import javax.swing.*;

public class Checkers extends Application {

    private Button startBtn = new Button();
    private Label startLbl = new Label("Press button to Start");
    private Image imageback = new Image("file:src/main/resources/background.png");


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(200, 200, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        startLbl.setTextFill(Color.web("#FFF"));
        startLbl.setFont(new Font("Arial", 16));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        int sizeForTheGame = 8;
        Board board = new Board(sizeForTheGame);
        board.createBoard(grid);

        Scene scene = new Scene(grid, 910, 910);

        PopUpChooseColor popUpChooseColor = new PopUpChooseColor();
        PawnsOnStart pawnsOnStart = new PawnsOnStart(sizeForTheGame);
        Popup chosePopUp = popUpChooseColor.setChoseColorPupUp();

        startBtn.setText("  Start  ");
        startBtn.setOnAction((e) -> {
            chosePopUp.show(primaryStage);
        });

        Button blackButton = popUpChooseColor.getWhiteButton();
        Button whiteButton = popUpChooseColor.getBlaclButton();

        blackButton.setOnAction((b) -> {
            pawnsOnStart.setWhitePawnsWhenBlackChosen(grid);
            pawnsOnStart.setBlackPawnsWhenBlackChosen(grid);
            chosePopUp.hide();
        });

        whiteButton.setOnAction((w) -> {
            pawnsOnStart.setWhitePawnsWhenWhiteChosen(grid);
            pawnsOnStart.setBlackPawnsWhenWhiteChosen(grid);
            chosePopUp.hide();
        });

        grid.add(startBtn, sizeForTheGame-2, 12, 2, 1);
        grid.add(startLbl, 0, 12, 6, 1 );


        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

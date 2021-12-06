package com.game.checkers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class Checkers extends Application {

    private Button startBtn = new Button();
    private Label startLbl = new Label("Press button to start");
    private Image imageback = new Image("file:src/main/resources/background.png");
    GridPane grid = new GridPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(200, 200, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        grid.setAlignment(Pos.CENTER);
        grid.setBackground(background);

        startBtn.setText("  START  ");

        startLbl.setTextFill(Color.web("#FFF"));
        startLbl.setFont(new Font("Arial", 18));
        startLbl.setPadding(new Insets(15));

        int boardSize = 10;
        Board board = new Board(boardSize);
        board.createBoard(grid);

        PopUpChooseColor popUpChooseColor = new PopUpChooseColor();
        Popup startPopUp = popUpChooseColor.setChoseColorPupUp();

        startBtn.setOnAction((e) -> {
            startPopUp.show(primaryStage);
        });

        Button whiteButton = popUpChooseColor.getWhiteButton();
        Button blackButton = popUpChooseColor.getBlackButton();

        Pawns pawns = new Pawns(boardSize);

        whiteButton.setOnAction((e) -> {
            startPopUp.hide();
            board.createBoard(grid);
            pawns.setPawns(grid, "white");
        });

        blackButton.setOnAction((e) -> {
            startPopUp.hide();
            board.createBoard(grid);
            pawns.setPawns(grid, "black");
        });

        grid.add(startLbl, 0, boardSize, boardSize / 2 + 2, 1);
        grid.add(startBtn, boardSize - 2, boardSize, boardSize / 2 -1, 1);

        Scene scene = new Scene(grid, 910, 910);

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

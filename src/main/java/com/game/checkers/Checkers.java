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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        int boardSize = 8;
        NewBoard newBoard = new NewBoard(boardSize);
        GridPane grid = newBoard.setBoard();

        BackgroundSize backgroundSize = new BackgroundSize(200, 200, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        grid.setAlignment(Pos.CENTER);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);

        startBtn.setText("  START  ");
        startLbl.setTextFill(Color.web("#FFF"));
        startLbl.setFont(new Font("Arial", 18));
        startLbl.setPadding(new Insets(15));

        grid.add(startLbl, 0, boardSize, boardSize / 2 + 2, 1);
        grid.add(startBtn, boardSize - 2, boardSize, boardSize / 2 -1, 1);

        PopUpChooseColor popUpChooseColor = new PopUpChooseColor();
        Popup startPopUp = popUpChooseColor.setChoseColorPupUp();

        startBtn.setOnAction((e) -> {
            startPopUp.show(primaryStage);
        });

        Button whiteButton = popUpChooseColor.getWhiteButton();
        Button blackButton = popUpChooseColor.getBlackButton();

        whiteButton.setOnAction((e) -> {
            newBoard.clearPawnLists();

            int position = 0;
            int col = 0;
            for (int i = 0 ; i < 4 ; i++) {
                newBoard.createPawns("white", position);
                grid.add(Pawn.setPawn("white"), col, 7);
                grid.add(Pawn.setPawn("black"), col, 1);
                position += 2;
                col += 2;
            }

            position = 9;
            col = 1;
            for (int j = 4 ; j < 8 ; j++) {
                newBoard.createPawns("white", position);
                grid.add(Pawn.setPawn("white"), col, 6);
                grid.add(Pawn.setPawn("black"), col, 0);
                position += 2;
                col += 2;
            }

            startPopUp.hide();
            startBtn.setText("  RESTART ");
            newBoard.boardInfo();

        });

        blackButton.setOnAction((e) -> {
            newBoard.clearPawnLists();

            int position = 0;
            int col = 0;
            for (int i = 0 ; i < 4 ; i++) {
                newBoard.createPawns("black", position);
                grid.add(Pawn.setPawn("black"), col, 7);
                grid.add(Pawn.setPawn("white"), col, 1);
                position += 2;
                col += 2;
            }

            position = 9;
            col = 1;
            for (int j = 4 ; j < 8 ; j++) {
                newBoard.createPawns("black", position);
                grid.add(Pawn.setPawn("black"), col, 6);
                grid.add(Pawn.setPawn("white"), col, 0);
                position += 2;
                col += 2;
            }

            startPopUp.hide();
            startBtn.setText("  RESTART  ");
        });

        newBoard.boardInfo();

        Scene scene = new Scene(grid, 910, 910);

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


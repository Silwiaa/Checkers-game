package com.game.checkers;

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import java.util.*;

public class NewBoard {
    public static List<Square> squares = new ArrayList<>();
    public static List<Rectangle> rectangles = new ArrayList<>();
    public static List<Square> blackRectangles = new ArrayList<>();
    public static List<Pawn> pawnsComputer = new ArrayList<>();
    public static List<Pawn> pawnsUser = new ArrayList<>();
    int sqrPosition;

    int boardSize;

    public NewBoard(int boardSize) {
        this.boardSize = boardSize;
        createBoard();
    }

    public int getBoardSize() {
        return boardSize * boardSize;
    }

    private void createBoard() {
        for (int i = 0 ; i < getBoardSize() ; i++) {
            squares.add(new Square(i));
            rectangles.add(squares.get(i).createRectangleOnBoard());
            if (squares.get(i).getColor() == "black") {
                blackRectangles.add(squares.get(i));
            }
        }
    }

    public GridPane setBoard() {
        GridPane grid = new GridPane();
        sqrPosition = 0;
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 7 ; j >= 0 ; j--) {
                Rectangle rectangle = rectangles.get(sqrPosition);
                grid.add(rectangle, i, j);
                sqrPosition++;
            }
        }

        return grid;
    }

    public void createPawns(String userColor, int position) {
        String userPawnColor = "";
        String computerPawnColor = "";

        if(userColor == "white") {
            userPawnColor = "white";
            computerPawnColor = "black";
        } else {
            userPawnColor = "black";
            computerPawnColor = "white";
        }

        Pawn userPawn = new Pawn(userPawnColor, position);
        pawnsUser.add(userPawn);
        Pawn computerPawn = new Pawn(computerPawnColor, position + 48);
        pawnsComputer.add(computerPawn);

    }

    public void clearPawnLists() {
        pawnsUser.clear();
        pawnsComputer.clear();
    }

    public void boardInfo() {
        for (Square s : squares) {
            s.info();
        }
    }
}

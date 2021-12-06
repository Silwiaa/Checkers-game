package com.game.checkers;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PawnsOnStart {
    int number;

    public PawnsOnStart(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public GridPane setWhitePawnsWhenBlackChosen(GridPane pane) {
        int col1 = 0;
        int col2 = 1;

        for (int i = 0 ; i < getNumber() ; i++) {
            Circle c = new Circle(0, 0, 13, Color.WHITE);
            if (i % 2 == 0) {
                pane.add(c, col1, 0);
                col1 += 2;
            } else {
                pane.add(c, col2, 1);
                col2 += 2;
            }
        }
        return pane;
    }

    public GridPane setBlackPawnsWhenBlackChosen(GridPane pane) {
        int col1 = 1;
        int col2 = 0;

        for (int i = 0 ; i < getNumber() ; i++) {
            Circle c = new Circle(0, 0, 13, Color.BROWN);
            if (i % 2 == 0) {
                pane.add(c, col1, number - 2);
                col1 += 2;
            } else {
                pane.add(c, col2, number - 1);
                col2 += 2;
            }
        }
        return pane;
    }

    public GridPane setBlackPawnsWhenWhiteChosen(GridPane pane) {
        int col1 = 0;
        int col2 = 1;

        for (int i = 0 ; i < getNumber() ; i++) {
            Circle c = new Circle(0, 0, 13, Color.BROWN);
            if (i % 2 == 0) {
                pane.add(c, col1, 1);
                col1 += 2;
            } else {
                pane.add(c, col2, 0);
                col2 += 2;
            }
        }
        return pane;
    }

    public GridPane setWhitePawnsWhenWhiteChosen(GridPane pane) {
        int col1 = 0;
        int col2 = 1;

        for (int i = 0; i < getNumber(); i++) {
            Circle c = new Circle(0, 0, 13, Color.WHITE);
            if (i % 2 == 0) {
                pane.add(c, col1, number - 2);
                col1 += 2;
            } else {
                pane.add(c, col2, number - 1);
                col2 += 2;
            }
        }
        return pane;
    }
}
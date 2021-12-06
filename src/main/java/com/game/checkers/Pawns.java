package com.game.checkers;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Pawns {
    int pawnsNumber;


    public Pawns(int pawnsNumber) {
        this.pawnsNumber = pawnsNumber;
    }

    public int getPawnsNumber() {
        return pawnsNumber;
    }

    public GridPane setPawns(GridPane grid, String color) {
        if (color == "white") {
            int col1 = 0;
            int col2 = 1;

            for (int i = 0; i < getPawnsNumber(); i++) {
                Circle c = new Circle(0, 0, 13, Color.BROWN);
                if (i % 2 == 0) {
                    grid.add(c, col1, 1);
                    col1 += 2;
                } else {
                    grid.add(c, col2, 0);
                    col2 += 2;
                }
            }

            col1 = 0;
            col2 = 1;

            for (int i = 0; i < getPawnsNumber(); i++) {
                Circle c = new Circle(0, 0, 13, Color.WHITE);
                if (i % 2 == 0) {
                    grid.add(c, col1, getPawnsNumber() - 2);
                    col1 += 2;
                } else {
                    grid.add(c, col2, getPawnsNumber() - 1);
                    col2 += 2;
                }
            }
        } else {
            int col1 = 0;
            int col2 = 1;

            for (int i = 0 ; i < getPawnsNumber() ; i++) {
                Circle c = new Circle(0, 0, 13, Color.WHITE);
                if (i % 2 == 0) {
                    grid.add(c, col1, 0);
                    col1 += 2;
                } else {
                    grid.add(c, col2, 1);
                    col2 += 2;
                }
            }

            col1 = 1;
            col2 = 0;

            for (int i = 0 ; i < getPawnsNumber() ; i++) {
                Circle c = new Circle(0, 0, 13, Color.BROWN);
                if (i % 2 == 0) {
                    grid.add(c, col1, getPawnsNumber() - 2);
                    col1 += 2;
                } else {
                    grid.add(c, col2, getPawnsNumber() - 1);
                    col2 += 2;
                }
            }
        }
        return grid;
    }
}

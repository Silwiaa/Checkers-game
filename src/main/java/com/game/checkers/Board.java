package com.game.checkers;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Board {
    int size;

    public Board(int size) {
        this.size = size;
    }

    public GridPane createBoard(GridPane grid) {

        for (int i = 0; i < size; i++) {
            addRow(grid, 0, i);
        }

        return grid;
    }

    public void addRow(GridPane grid, int x, int y) {

        for (int i = 0; i < size; i++) {
            Rectangle r = new Rectangle(0, 0, 35, 35);
            grid.add(r, x, y);
            x++;

            if (y % 2 == 0) {
                r.setFill(Color.LIGHTGRAY);
                    if (i % 2 == 0) {
                        r.setFill(Color.BLACK);
                    }
            } else {
                r.setFill(Color.BLACK);
                if (i % 2 == 0) {
                    r.setFill(Color.LIGHTGRAY);
                }
            }
        }
    }
}


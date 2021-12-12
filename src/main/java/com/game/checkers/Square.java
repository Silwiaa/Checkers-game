package com.game.checkers;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square {
    private int numberOfSquare;
    private boolean ifIsOccupated;
    private String squareColor;


    public Square(int numberOfSquare) {
        this.numberOfSquare = numberOfSquare;
        setColor(numberOfSquare);
    }

    private void setColor(int numberOfSquare) {
        boolean checkIfOddRow =
                (numberOfSquare >= 0 && numberOfSquare < 8) ||
                (numberOfSquare > 15 && numberOfSquare < 24) ||
                (numberOfSquare > 31 && numberOfSquare < 40) ||
                (numberOfSquare > 47 && numberOfSquare < 56);

        if(checkIfOddRow) {
            if(numberOfSquare % 2 == 0) {
                squareColor = "black";
            } else {
                squareColor = "white";
            }
        } else {
            if(numberOfSquare % 2 == 0) {
                squareColor = "white";
            } else {
                squareColor = "black";
            }
        }
    }

    public Rectangle createRectangleOnBoard() {
        Rectangle rectangle = new Rectangle(0, 0, 35, 35);
        if (getColor() == "white") {
            rectangle.setFill(Color.LIGHTGRAY);
        } else {
            rectangle.setFill(Color.BLACK);
        }
        return rectangle;
    }

    public String getColor() {
        return squareColor;
    }

    public void setIfIsOccupated(boolean ifIsOccupated) {
        this.ifIsOccupated = ifIsOccupated;
    }

    public boolean getIfIsOccupaded() {
        return ifIsOccupated;
    }

    public void info() {
        System.out.println("Number of the Square: " + numberOfSquare);
        System.out.println("Square color: " + squareColor);
        System.out.println("If square occupated: " + ifIsOccupated);
        System.out.println();
    }

}

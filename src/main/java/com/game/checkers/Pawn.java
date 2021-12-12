package com.game.checkers;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Pawn {
    private String color;
    private int position;
    private int[] legalMove = new int[]{-9, -7, 7, 9};
    private List<Integer> posibleMove = new ArrayList<>();

    public Pawn(String color, int position) {
        this.color = color;
        this.position = position;
        setMove();
        setSquareOccupated();
    }

    public String getColor() {
        return color;
    }

    public void setMove() {
        calcPawnMove(legalMove);
    }

    public void calcPawnMove(int[] m) {
        for(int move : m) {
            boolean checkIfMoveIsOnBoard = position + move >= 0 && position + move < 64;

            if (checkIfMoveIsOnBoard) {
                boolean checkIfIsNotOccupated =
                        NewBoard.squares.get(position + move).getIfIsOccupaded() == true;
                boolean checkSquareColor = NewBoard.squares.get(position).getColor() == NewBoard.squares.get(position + move).getColor();
                if (checkSquareColor && !checkIfIsNotOccupated) {
                    posibleMove.add(move);
                }
            }
        }
    }

    private void setSquareOccupated() {
        NewBoard.squares.get(position).setIfIsOccupated(true);
    }

    public void checkPawn() {
        System.out.println("Color: " + color);
        System.out.println("Position: " + position);

        for (Integer move : posibleMove) {
            System.out.println("Legal move: " + move);
        }
    }

    public static Circle setPawn(String color) {
        Circle circle = new Circle(0, 0, 15);
        if (color == "white") {
            circle.setFill(Color.LIGHTGRAY);
        } else {
                circle.setFill(Color.RED);
        }
        return circle;
    }

}

package com.game.checkers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkers extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 750, 750, Color.GREY);

        //1th row
        int x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,0,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //2th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,50,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //3th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,100,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //4th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,150,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //5th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,200,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //6th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,250,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //7th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,300,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //8th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,350,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //9th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,400,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //10th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,450,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //11th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,500,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //12th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,550,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //13th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,600,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //14th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,650,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //15th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,700,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 50;
        }

        //16th row
        x = 0;
        for (int i = 1 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,750,50,50);
            if ((row.getX() / 50) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 50;
        }

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

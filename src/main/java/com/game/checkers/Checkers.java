package com.game.checkers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkers extends Application {
    //background image
    private Image imageback = new Image("file:src/main/resources/background.png");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 750, 750, Color.GREY);

        //1th row
        int x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,0,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //2th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,35,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //3th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,70,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //4th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,105,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //5th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,140,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //6th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,175,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //7th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,210,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //8th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,245,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //9th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,280,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //10th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,315,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //11th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,350,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //12th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,385,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //13th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,420,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //14th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,455,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //15th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,490,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            root.getChildren().add(row);
            x += 35;
        }

        //16th row
        x = 0;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,525,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            root.getChildren().add(row);
            x += 35;
        }

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

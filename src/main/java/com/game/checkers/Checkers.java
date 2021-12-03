package com.game.checkers;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkers extends Application {

    private Image imageback = new Image("file:src/main/resources/background.png");
    private Image pawnImageWhite = new Image("file:src/main/resources/white_pawn.png", 25, 25, false, false);
    private Image pawnImageBlack = new Image("file:src/main/resources/black_pawn.png", 25, 25, false, false);

    private Pane squares1 = new Pane();
    private Pane squares2 = new Pane();
    private Pane squares3 = new Pane();
    private Pane squares4 = new Pane();
    private Pane squares5 = new Pane();
    private Pane squares6 = new Pane();
    private Pane squares7 = new Pane();
    private Pane squares8 = new Pane();
    private Pane squares9 = new Pane();
    private Pane squares10 = new Pane();
    private Pane squares11 = new Pane();
    private Pane squares12 = new Pane();
    private Pane squares13 = new Pane();
    private Pane squares14 = new Pane();
    private Pane squares15 = new Pane();
    private Pane squares16 = new Pane();

    private HBox box1 = new HBox();
    private HBox box2 = new HBox();
    private HBox box3 = new HBox();
    private HBox box4 = new HBox();
    private HBox box5 = new HBox();
    private HBox box6 = new HBox();
    private HBox box7 = new HBox();
    private HBox box8 = new HBox();
    private HBox box9 = new HBox();
    private HBox box10 = new HBox();
    private HBox box11 = new HBox();
    private HBox box12 = new HBox();
    private HBox box13 = new HBox();
    private HBox box14 = new HBox();
    private HBox box15 = new HBox();
    private HBox box16 = new HBox();

    private HBox box17 = new HBox();
    private HBox box18 = new HBox();
    private HBox box19 = new HBox();
    private HBox box20 = new HBox();
    private HBox box21 = new HBox();
    private HBox box22 = new HBox();
    private HBox box23 = new HBox();
    private HBox box24 = new HBox();
    private HBox box25 = new HBox();
    private HBox box26 = new HBox();
    private HBox box27 = new HBox();
    private HBox box28 = new HBox();
    private HBox box29 = new HBox();
    private HBox box30 = new HBox();
    private HBox box31 = new HBox();
    private HBox box32 = new HBox();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(200, 200, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);

        grid.add(squares1, 0, 0, 1, 1);
        grid.add(squares2, 0, 0, 1, 1);
        grid.add(squares3, 0, 0, 1, 1);
        grid.add(squares4, 0, 0, 1, 1);
        grid.add(squares5, 0, 0, 1, 1);
        grid.add(squares6, 0, 0, 1, 1);
        grid.add(squares7, 0, 0, 1, 1);
        grid.add(squares8, 0, 0, 1, 1);
        grid.add(squares9, 0, 0, 1, 1);
        grid.add(squares10, 0, 0, 1, 1);
        grid.add(squares11, 0, 0, 1, 1);
        grid.add(squares12, 0, 0, 1, 1);
        grid.add(squares13, 0, 0, 1, 1);
        grid.add(squares14, 0, 0, 1, 1);
        grid.add(squares15, 0, 0, 1, 1);
        grid.add(squares16, 0, 0, 1, 1);

        ImageView img1 = new ImageView(pawnImageWhite);
        ImageView img2 = new ImageView(pawnImageWhite);
        ImageView img3 = new ImageView(pawnImageWhite);
        ImageView img4 = new ImageView(pawnImageWhite);
        ImageView img5 = new ImageView(pawnImageWhite);
        ImageView img6 = new ImageView(pawnImageWhite);
        ImageView img7 = new ImageView(pawnImageWhite);
        ImageView img8 = new ImageView(pawnImageWhite);
        ImageView img9 = new ImageView(pawnImageWhite);
        ImageView img10 = new ImageView(pawnImageWhite);
        ImageView img11 = new ImageView(pawnImageWhite);
        ImageView img12 = new ImageView(pawnImageWhite);
        ImageView img13 = new ImageView(pawnImageWhite);
        ImageView img14 = new ImageView(pawnImageWhite);
        ImageView img15 = new ImageView(pawnImageWhite);
        ImageView img16 = new ImageView(pawnImageWhite);

        ImageView img17 = new ImageView(pawnImageBlack);
        ImageView img18 = new ImageView(pawnImageBlack);
        ImageView img19 = new ImageView(pawnImageBlack);
        ImageView img20 = new ImageView(pawnImageBlack);
        ImageView img21 = new ImageView(pawnImageBlack);
        ImageView img22 = new ImageView(pawnImageBlack);
        ImageView img23 = new ImageView(pawnImageBlack);
        ImageView img24 = new ImageView(pawnImageBlack);
        ImageView img25 = new ImageView(pawnImageBlack);
        ImageView img26 = new ImageView(pawnImageBlack);
        ImageView img27 = new ImageView(pawnImageBlack);
        ImageView img28 = new ImageView(pawnImageBlack);
        ImageView img29 = new ImageView(pawnImageBlack);
        ImageView img30 = new ImageView(pawnImageBlack);
        ImageView img31 = new ImageView(pawnImageBlack);
        ImageView img32 = new ImageView(pawnImageBlack);

        box1.getChildren().add(img1);
        box1.setPadding(new Insets(315, 0, 0, 60));

        box2.getChildren().add(img2);
        box2.setPadding(new Insets(315, 0, 0, 90));

        box3.getChildren().add(img3);
        box3.setPadding(new Insets(350, 0, 0, 60));

        box4.getChildren().add(img4);
        box4.setPadding(new Insets(350, 0, 0, 90));

        box5.getChildren().add(img5);
        box5.setPadding(new Insets(385, 0, 0, 60));

        box6.getChildren().add(img6);
        box6.setPadding(new Insets(385, 0, 0, 90));

        box7.getChildren().add(img7);
        box7.setPadding(new Insets(420, 0, 0, 60));

        box8.getChildren().add(img8);
        box8.setPadding(new Insets(420, 0, 0, 90));

        box9.getChildren().add(img9);
        box9.setPadding(new Insets(455, 0, 0, 60));

        box10.getChildren().add(img10);
        box10.setPadding(new Insets(455, 0, 0, 90));

        box11.getChildren().add(img11);
        box11.setPadding(new Insets(490, 0, 0, 60));

        box12.getChildren().add(img12);
        box12.setPadding(new Insets(490, 0, 0, 90));

        box13.getChildren().add(img13);
        box13.setPadding(new Insets(525, 0, 0, 60));

        box14.getChildren().add(img14);
        box14.setPadding(new Insets(525, 0, 0, 90));

        box15.getChildren().add(img15);
        box15.setPadding(new Insets(560, 0, 0, 60));

        box16.getChildren().add(img16);
        box16.setPadding(new Insets(560, 0, 0, 90));

        box17.getChildren().add(img17);
        box17.setPadding(new Insets(315, 0, 0, 820));

        box18.getChildren().add(img18);
        box18.setPadding(new Insets(315, 0, 0, 790));

        box19.getChildren().add(img19);
        box19.setPadding(new Insets(350, 0, 0, 820));

        box20.getChildren().add(img20);
        box20.setPadding(new Insets(350, 0, 0, 790));

        box21.getChildren().add(img21);
        box21.setPadding(new Insets(385, 0, 0, 820));

        box22.getChildren().add(img22);
        box22.setPadding(new Insets(385, 0, 0, 790));

        box23.getChildren().add(img23);
        box23.setPadding(new Insets(420, 0, 0, 820));

        box24.getChildren().add(img24);
        box24.setPadding(new Insets(420, 0, 0, 790));

        box25.getChildren().add(img25);
        box25.setPadding(new Insets(455, 0, 0, 820));

        box26.getChildren().add(img26);
        box26.setPadding(new Insets(455, 0, 0, 790));

        box27.getChildren().add(img27);
        box27.setPadding(new Insets(490, 0, 0, 820));

        box28.getChildren().add(img28);
        box28.setPadding(new Insets(490, 0, 0, 790));

        box29.getChildren().add(img29);
        box29.setPadding(new Insets(525, 0, 0, 820));

        box30.getChildren().add(img30);
        box30.setPadding(new Insets(525, 0, 0, 790));

        box31.getChildren().add(img31);
        box31.setPadding(new Insets(560, 0, 0, 820));

        box32.getChildren().add(img32);
        box32.setPadding(new Insets(560, 0, 0, 790));


        grid.add(box1, 0, 0, 1, 1);
        grid.add(box2, 0, 0, 1, 1);
        grid.add(box3, 0, 0, 1, 1);
        grid.add(box4, 0, 0, 1, 1);
        grid.add(box5, 0, 0, 1, 1);
        grid.add(box6, 0, 0, 1, 1);
        grid.add(box7, 0, 0, 1, 1);
        grid.add(box8, 0, 0, 1, 1);
        grid.add(box9, 0, 0, 1, 1);
        grid.add(box10, 0, 0, 1, 1);
        grid.add(box11, 0, 0, 1, 1);
        grid.add(box12, 0, 0, 1, 1);
        grid.add(box13, 0, 0, 1, 1);
        grid.add(box14, 0, 0, 1, 1);
        grid.add(box15, 0, 0, 1, 1);
        grid.add(box16, 0, 0, 1, 1);

        grid.add(box17, 0, 0, 1, 1);
        grid.add(box18, 0, 0, 1, 1);
        grid.add(box19, 0, 0, 1, 1);
        grid.add(box20, 0, 0, 1, 1);
        grid.add(box21, 0, 0, 1, 1);
        grid.add(box22, 0, 0, 1, 1);
        grid.add(box23, 0, 0, 1, 1);
        grid.add(box24, 0, 0, 1, 1);
        grid.add(box25, 0, 0, 1, 1);
        grid.add(box26, 0, 0, 1, 1);
        grid.add(box27, 0, 0, 1, 1);
        grid.add(box28, 0, 0, 1, 1);
        grid.add(box29, 0, 0, 1, 1);
        grid.add(box30, 0, 0, 1, 1);
        grid.add(box31, 0, 0, 1, 1);
        grid.add(box32, 0, 0, 1, 1);

        Scene scene = new Scene(grid, 910, 910);

        //1th row
        int x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,175,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            squares1.getChildren().add(row);
            x += 35;
        }

       //2th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,210,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            squares2.getChildren().add(row);
            x += 35;
        }

        //3th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,245,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            squares3.getChildren().add(row);
            x += 35;
        }

        //4th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,280,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            squares4.getChildren().add(row);
            x += 35;
        }

        //5th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,315,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            squares5.getChildren().add(row);
            x += 35;
        }

        //6th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,350,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            squares6.getChildren().add(row);
            x += 35;
        }

        //7th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,385,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            squares7.getChildren().add(row);
            x += 35;
        }

        //8th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,420,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            squares8.getChildren().add(row);
            x += 35;
        }

        //9th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,455,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            squares9.getChildren().add(row);
            x += 35;
        }

        //10th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,490,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            squares10.getChildren().add(row);
            x += 35;
        }

        //11th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,525,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            squares11.getChildren().add(row);
            x += 35;
        }

        //12th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,560,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            squares12.getChildren().add(row);
            x += 35;
        }

        //13th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,595,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            squares13.getChildren().add(row);
            x += 35;
        }

        //14th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,630,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            squares14.getChildren().add(row);
            x += 35;
        }

        //15th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,665,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.LIGHTGRAY);
            } else {
                row.setFill(Color.BLACK);
            }
            squares15.getChildren().add(row);
            x += 35;
        }

        //16th row
        x = 175;
        for (int i = 0 ; i < 16 ; i++) {
            Rectangle row = new Rectangle(x,700,35,35);
            if ((row.getX() / 35) % 2 == 0) {
                row.setFill(Color.BLACK);
            } else {
                row.setFill(Color.LIGHTGRAY);
            }
            squares16.getChildren().add(row);
            x += 35;
        }

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

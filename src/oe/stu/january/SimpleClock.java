package oe.stu.january;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sun.java2d.pipe.SpanShapeRenderer;

import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class SimpleClock extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            Scene scene1 = new Scene(root,400,400);
            primaryStage.setScene(scene1);

            Button yesButton = new Button();
            yesButton.setAlignment(Pos.CENTER);
            yesButton.setMinWidth(200);
            yesButton.setText("Start");

            HBox hbox = new HBox(10);
            hbox.setPadding(new Insets(10, 10, 10, 10));
            hbox.getChildren().addAll(yesButton);
            root.getChildren().addAll(hbox);

            primaryStage.show();

            VBox vb = new VBox();
            Scene scene = new Scene(vb);
            String title = "get up";
            String owner = "oe";
            final Dialog dial = new Dialog();
            dial.setTitle(title);
            vb.setPadding(new Insets(10, 10, 10, 10));
            vb.setSpacing(10);
            Button okButton = new Button("确定");
            okButton.setAlignment(Pos.CENTER);
            okButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    dial.close();
                }
            });
            BorderPane bp = new BorderPane();
            bp.setCenter(okButton);
            HBox msg = new HBox();
            msg.setSpacing(5);
            vb.getChildren().addAll(msg, bp);
//            dial.show();
//            dial.show();
            yesButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Stage bigStage = new Stage();
                    BorderPane girl = new BorderPane();
                    Scene scene1 = new Scene(girl);
                    String fuckyou = SimpleClock.class.getClass().getResource("/").getPath();
                    System.out.println(fuckyou);
                    scene1.getStylesheets().add("file:///" + fuckyou+"../../../files/background.css");
                    bigStage.setScene(scene1);
                    bigStage.setAlwaysOnTop(true);
                    bigStage.setFullScreen(true);
                    Timer timer = new Timer();
                    TimerTask task   = new TimerTask(){
                        public void run(){
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    bigStage.setAlwaysOnTop(true);
                                    bigStage.setFullScreen(true);
                                    bigStage.show();//if you change the UI, do it here !
                                }
                            });

                        }
                    };
                    timer.schedule(task, 3400000L,3600000L);
                }

            });
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

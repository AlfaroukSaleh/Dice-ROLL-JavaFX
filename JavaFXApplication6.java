package javafxapplication6;


import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;


public class JavaFXApplication6 extends Application
{
    int sum=0;
int avg=0;

    @Override
    public void start(Stage primaryStage)
    {
        DieImages images = new DieImages();
        Die die = new Die(images.getImages());
        StackPane stackPane = new StackPane(die.getdieFace());//Add ImageView(Die) to stackPane
        VBox.setVgrow(stackPane, Priority.ALWAYS);

        Button btn = new Button();
        btn.setText("Roll Die");
        btn.setOnAction((ActionEvent event) -> {
            btn.setDisable(true);//Disable Button
            Random random = new Random();
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(.9), (actionEvent) -> {
                for (int i=0;i<1000;i++){
                int tempRandom = random.nextInt(6) + 1;
                sum+=tempRandom;
                System.out.println(tempRandom);
                die.setDieFace(tempRandom);} 
                System.out.println("Sum = "+ sum);
                System.out.println("average = "+ sum/1000);
                sum=0;

            }));

           // timeline.setCycleCount(1);
            timeline.play();
            timeline.setOnFinished(actionEvent -> {
                btn.setDisable(false);//Enable Button
            });
        });

        VBox root = new VBox(stackPane, new StackPane(btn));
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Dice Roll");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args)
    {
        launch(args);
    }

}
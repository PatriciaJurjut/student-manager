package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
<<<<<<< HEAD

    public void start(Stage primaryStage) throws Exception{
            public void start(Stage primaryStage) throws Exception {
                Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
                primaryStage.setTitle("FIS - Student Manager");
                primaryStage.setScene(new Scene(root, 600, 400));
                primaryStage.show();
            }

=======
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("FIS - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
>>>>>>> f412e89f2ecb5c8168cc0486b2d124334cdd22aa
    }



    public static void main(String[] args) {
        launch(args);
    }
}

package main;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	public static Stage primarySStage;
	public static Scene primarySScene;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/view/LearningGuiView.fxml"));
			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("/view/login.css").toExternalForm());
			//primaryStage.initStyle(StageStyle.UNDECORATED);
			primarySScene=scene;
			primarySStage=primaryStage;
			primarySStage.setScene(primarySScene);
			primarySStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

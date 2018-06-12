package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import main.Main;

public class MainView implements Initializable {

	@FXML
	private ImageView imgv3;
	@FXML
	private ImageView imgv1;
	@FXML
	private Pane learnPane;
	@FXML
	private BorderPane parentPane;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		imgv1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				loadNextScene1();
			}

		});
		imgv3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				FadeTransition fadeTransition = new FadeTransition();
				fadeTransition.setDuration(Duration.millis(400));
				fadeTransition.setNode(learnPane);
				fadeTransition.setFromValue(1);
				fadeTransition.setToValue(0);
				fadeTransition.setOnFinished((ActionEvent event) -> {
					loadNextScene3();
				});
				fadeTransition.play();
			}

		});
	}

	private void loadNextScene1() {
		AnchorPane secondaryLayout = new AnchorPane();
		Parent guiView;
		try {
			guiView = FXMLLoader.load(getClass().getResource("/view/SomeExercise.fxml"));
			secondaryLayout.getChildren().removeAll();
			secondaryLayout.getChildren().setAll(guiView);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Scene secondScene = new Scene(secondaryLayout);

		Stage secondStage = new Stage();
		secondStage.setTitle("JButton Example");
		secondStage.setScene(secondScene);

		// Set position of second window, related to primary window.
		secondStage.setX(Main.primarySStage.getX() );
		secondStage.setY(Main.primarySStage.getY() );
		secondStage.setResizable(false);
		secondStage.show();
	}
	private void loadNextScene3() {
		try {
			Parent guiView;
			guiView = FXMLLoader.load(getClass().getResource("/view/LearningGUIView.fxml"));
			parentPane.getChildren().removeAll();
			parentPane.getChildren().setAll(guiView);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

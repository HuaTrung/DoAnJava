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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class MainView implements Initializable  {
	
	@FXML
	private ImageView imgv3;
	@FXML
	private Pane learnPane;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		imgv3.setOnMouseClicked(new EventHandler<MouseEvent>(){
	          @Override
	          public void handle(MouseEvent arg0) {
	        	  FadeTransition fadeTransition =new FadeTransition();
	        	  fadeTransition.setDuration(Duration.millis(200));
	        	  fadeTransition.setNode(learnPane);
	        	  fadeTransition.setFromValue(1);
	        	  fadeTransition.setToValue(0);
	        	  fadeTransition.setOnFinished((ActionEvent event) -> {

	        		loadNextScene();  
	        	  });
	        	  fadeTransition.play();
	          }
	 
	      });
	}
	private void loadNextScene() {
		try {
			Parent guiView;
			guiView= FXMLLoader.load(getClass().getResource("/view/LearningGUIView.fxml"));
			learnPane.getChildren().removeAll();
			learnPane.getChildren().setAll(guiView);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

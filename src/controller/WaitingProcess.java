package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.util.Duration;
import main.Main;

public class WaitingProcess implements Initializable {
	private final String str1 = "Please wait...";

	@FXML
	private Text textpls;
	@FXML
	private Text txtdot;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		final Animation animation = new Transition() {
			{
				setCycleDuration(Duration.seconds(1));
			}

			protected void interpolate(double frac) {
				final int length = str1.length();
				final int n = Math.round(length * (float) frac);
				textpls.setText(str1.substring(0, n));
			}

		};
		animation.onFinishedProperty().set(new EventHandler<ActionEvent>() {	     
		      @Override
		      public void handle(ActionEvent event) {
		    	  try {
						Parent root = FXMLLoader.load(getClass().getResource("/view/View.fxml"));
						Scene scene = new Scene(root);
						Main.primarySScene=scene;
						Main.primarySStage.setScene(Main.primarySScene);
						Main.primarySStage.show();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		      }
		});
		animation.setCycleCount(2);
		animation.play();
	}

}

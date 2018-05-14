package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import main.Main;

public class DangNhapChinh implements Initializable {
	@FXML
	private JFXButton btnDangNhap;

	@FXML
	private AnchorPane dangNhapPane;

	@FXML
	private JFXTextField txtdangnhap;
	@FXML
	private JFXPasswordField txtmatkhau;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		btnDangNhap.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
			//	if (txtdangnhap.getText() == "trung" && txtmatkhau.getText() == "trung") {
					FadeTransition fadeTransition = new FadeTransition();
					fadeTransition.setDuration(Duration.millis(200));
					fadeTransition.setNode(LoginView.mainSPane);
					fadeTransition.setFromValue(1);
					fadeTransition.setToValue(0);
					fadeTransition.setOnFinished((ActionEvent event) -> {
						try {
							Parent root = FXMLLoader.load(getClass().getResource("/view/LoadingScreen.fxml"));
							Scene scene = new Scene(root);
							Main.primarySScene = scene;
							Main.primarySStage.setScene(Main.primarySScene);
							Main.primarySStage.show();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					});
					fadeTransition.play();
//				}
			}

		});

	}

}

package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class LoginView implements Initializable {

	@FXML
	private Pane contructPane;
	@FXML
	private Pane backgroundMain;
	@FXML
	private Pane mainPane;
	
	public static Pane mainSPane;
	@FXML
	private Pane movePane;
	@FXML
	private JFXButton btnTaoTaiKhoan;
	@FXML
	private Label label1;
	@FXML
	private Label label2;
	@FXML
	private Label label3;
	@FXML
	private JFXButton btnDangNhap;
	@FXML
	private Label label11;
	@FXML
	private Label label21;
	@FXML
	private Label label31;
	@FXML 
	private JFXButton btnDangNhapInForm;
	@FXML
	private void changeToRegisForm(ActionEvent event) throws IOException {
		TranslateTransition transition1 = new TranslateTransition();
		transition1.setDuration(Duration.seconds(0.4));
		transition1.setNode(movePane);
		transition1.setToX(-(285 + 25));

		TranslateTransition transition2 = new TranslateTransition();
		transition2.setDelay(Duration.seconds(0.05));
		transition2.setDuration(Duration.seconds(0.2));
		transition2.setNode(movePane);
		transition2.setToX(-(285 - 15));

		TranslateTransition transition3 = new TranslateTransition();
		transition3.setDuration(Duration.seconds(0.2));
		transition3.setNode(movePane);
		transition3.setToX(-(285));

		SequentialTransition seqT = new SequentialTransition(transition1, transition2, transition3);
		seqT.play();

		Parent fxml = FXMLLoader.load(getClass().getResource("/view/DangKiChinh.fxml"));
		movePane.getChildren().removeAll();
		movePane.getChildren().setAll(fxml);

		btnTaoTaiKhoan.setVisible(false);
		label1.setVisible(false);
		label2.setVisible(false);
		label3.setVisible(false);

		btnDangNhap.setVisible(true);
		label11.setVisible(true);
		label21.setVisible(true);
		label31.setVisible(true);
	}

	@FXML
	private void changeToLoginForm(ActionEvent event) throws IOException {
		TranslateTransition transition1 = new TranslateTransition();
		transition1.setDuration(Duration.seconds(0.4));
		transition1.setNode(movePane);
		transition1.setToX((25));

		TranslateTransition transition2 = new TranslateTransition();
		transition2.setDelay(Duration.seconds(0.05));
		transition2.setDuration(Duration.seconds(0.2));
		transition2.setNode(movePane);
		transition2.setToX((-15));

		TranslateTransition transition3 = new TranslateTransition();
		transition3.setDuration(Duration.seconds(0.2));
		transition3.setNode(movePane);
		transition3.setToX((0));

		SequentialTransition seqT = new SequentialTransition(transition1, transition2, transition3);
		seqT.play();

		Parent fxml = FXMLLoader.load(getClass().getResource("/view/DangNhapChinh.fxml"));
		movePane.getChildren().removeAll();
		movePane.getChildren().setAll(fxml);

		btnDangNhap.setVisible(false);
		label11.setVisible(false);
		label21.setVisible(false);
		label31.setVisible(false);

		btnTaoTaiKhoan.setVisible(true);
		label1.setVisible(true);
		label2.setVisible(true);
		label3.setVisible(true);
	}
	public void goIntoMainView( ) {
		FadeTransition fadeTransition=new FadeTransition();
		fadeTransition.setDuration(Duration.millis(1000));
		fadeTransition.setNode(mainPane);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();
	}
	public void makeFadeOut() {
		FadeTransition fadeTransition=new FadeTransition();
		fadeTransition.setDuration(Duration.millis(1000));
		fadeTransition.setNode(mainPane);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.setOnFinished((ActionEvent event) -> {
			try {
				Parent guiView;
				guiView= FXMLLoader.load(getClass().getResource("/view/View.fxml"));
				mainPane.getChildren().removeAll();
				mainPane.getChildren().setAll(guiView);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	  });
		fadeTransition.play();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		mainSPane=mainPane;
		Parent fxml;
		try {
			fxml = FXMLLoader.load(getClass().getResource("/view/DangNhapChinh.fxml"));
			movePane.getChildren().removeAll();
			movePane.getChildren().setAll(fxml);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		btnDangNhap.setVisible(false);
		label11.setVisible(false);
		label21.setVisible(false);
		label31.setVisible(false);
		btnTaoTaiKhoan.setOnAction(arg01 -> {
			try {
				changeToRegisForm(arg01);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		btnDangNhap.setOnAction(arg01 -> {
			try {
				changeToLoginForm(arg01);
			} catch (IOException e) {
				// TODO Auto-generated catch block	
				e.printStackTrace();
			}
		});
		
	}

}

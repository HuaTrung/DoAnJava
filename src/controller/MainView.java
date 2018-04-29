package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainView implements Initializable  {
	@FXML
	private JFXButton btnExit;
	@FXML
	private void changeToLoginForm(ActionEvent event) throws IOException {
		System.out.println("dasd");
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}

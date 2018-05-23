package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXScrollPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class LearningGUIView implements Initializable {
	@FXML
	private Pane learnPane;

	@FXML
	private JFXScrollPane scrollPane;

	@FXML
	private VBox VboxMenu;

	@FXML
	private ScrollPane MainGuiPane;

	@FXML
	private Pane GuiPane;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		MainGuiPane.setHbarPolicy(ScrollBarPolicy.NEVER);
		StackPane header = (StackPane) scrollPane.getChildren().get(1);
		header.setPrefHeight(0);
		
		//
		Button btnGioiThieu = new Button("GIỚI THIỆU");
		btnGioiThieu.prefWidthProperty().bind(VboxMenu.prefWidthProperty());
		btnGioiThieu.setPrefHeight(40);
		btnGioiThieu.getStyleClass().add("btnSCroll");
		btnGioiThieu.setOnAction(arg01 -> {
			try {
				Parent fxml = FXMLLoader.load(getClass().getResource("/view/JButtonView.fxml"));
				GuiPane.setPrefHeight(2500);
				GuiPane.getChildren().removeAll();
				GuiPane.getChildren().setAll(fxml);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		VboxMenu.getChildren().add(btnGioiThieu);
		
		//
		JFXScrollPane.smoothScrolling((ScrollPane) scrollPane.getChildren().get(0));
		// for(int i=0;i<500;i++) {
		// Button a=new Button("asdasd");
		// a.setLayoutY(50*i);
		// GuiPane.getChildren().add(a);
		// }
		// MainGuiPane.setPannable(true);

	}

}

package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import org.sqlite.SQLiteConfig;

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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
	private boolean checkAccount(String user, String pass) throws SQLException {
		utils.ConnectDatabase.connect();
		int i=0;
		try {
			SQLiteConfig config = new SQLiteConfig();
			Statement stat = utils.ConnectDatabase.conn.createStatement();
			ResultSet rs = stat
					.executeQuery("select user, pass from login where user=\""
							+ user
							+"\" and pass=\""+pass+"\";");
			while (rs.next()) {
			i++;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		utils.ConnectDatabase.conn.close();
		if(i>0)
			return true;
		return false;
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		btnDangNhap.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
					try {
						if(checkAccount(txtdangnhap.getText().toString(),txtmatkhau.getText().toString())) {
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
						}
						else {
							 Alert alert = new Alert(AlertType.ERROR);
						        alert.setTitle("ERROR");
						 
						        // Header Text: null
						        alert.setHeaderText("KHÔNG THỂ ĐĂNG NHẬP");
						        alert.setContentText("MẬT KHẨU HOẶC TÊN ĐĂNG NHẬP KHÔNG HỢP LỆ\n VUI LÒNG XEM LẠI");
						 
						        alert.showAndWait();
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		});

	}

}

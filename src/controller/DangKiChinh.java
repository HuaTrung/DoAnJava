package controller;

import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import org.sqlite.SQLiteConfig;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class DangKiChinh implements Initializable {
	@FXML
	private JFXTextField tendangnhapDK;

	@FXML
	private JFXPasswordField mkDK;

	@FXML
	private JFXPasswordField mk2DK;
	@FXML
	private JFXButton btnDangKi;

	private boolean addUser(String user, String pass) throws SQLException {
		utils.ConnectDatabase.connect();
		int i = 0;
		try {
			SQLiteConfig config = new SQLiteConfig();
			Statement stat = utils.ConnectDatabase.conn.createStatement();
			stat.execute(
					"INSERT INTO login (user, pass)\r\n" + 
					"VALUES ('"+user+"', '"+pass+"');");
			utils.ConnectDatabase.conn.close();
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return false;

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnDangKi.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				try {
					if (mkDK.getText().toString().equals(mk2DK.getText().toString())) {
						if (addUser(tendangnhapDK.getText().toString(), mkDK.getText().toString())) {
							Alert alert = new Alert(AlertType.INFORMATION);
							alert.setTitle("THÀNH CÔNG");
							tendangnhapDK.setText("");
							mk2DK.setText("");
							mkDK.setText("");
							// Header Text: null
							alert.setHeaderText("BẠN ĐÃ TẠO ACCOUNT THÀNH CÔNG");
							alert.setContentText("CÙNG NHAU TẬN HƯỞNG CÁC KHÓA HỌC NÀO");
							alert.showAndWait();
						}
					} else {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("ERROR");

						// Header Text: null
						alert.setHeaderText("MẬT KHẨU XÁC NHẬN KHÔNG TRÙNG NHAU");
						alert.setContentText("HÃY KIỂM TRA LẠI NÀO !!!!");
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

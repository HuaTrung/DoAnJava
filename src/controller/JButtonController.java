package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class JButtonController implements Initializable {
	@FXML
	private Label title;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			URL url = getClass().getResource("JButton.txt");
			File file = new File(url.getPath());
			br = new BufferedReader(new FileReader(file));

			title.setText(br.readLine());
			System.out.println(url.getPath());
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
}

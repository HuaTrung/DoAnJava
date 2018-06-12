package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import com.jfoenix.controls.JFXButton;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class JButtonExampleController implements Initializable {
	@FXML
	private TextArea txtCode;

	@FXML
	private ScrollPane scrollxt;

	@FXML
	private AnchorPane examplePane;

	@FXML
	private JFXButton runbtn;

	private String content;
	private String color;
	private int width;
	private int height;
	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}

	private void createSwingContent(final SwingNode swingNode) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JButton sample = new JButton(content);
				sample.setBackground(Color.WHITE);
				sample.setPreferredSize(new Dimension(width, height));
				sample.setMaximumSize(new Dimension(width, height));
				swingNode.setContent(sample);
			}
		});
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		content = "click me";
		color = "WHITE";
		width=100;
		height=100;
		txtCode.setText(
				"JButton b1 = new JButton(\"" + content + "\");\n" 
				+"button.setSize("+width+","+ height+");\r\n"
						+ "b1.set(Color." + color + ");\n");
		txtCode.setFont(Font.font("Courier New", 16));

		runbtn.setOnAction(arg01 -> {
			String result = txtCode.getText();
			int pos = result.indexOf("JButton(\"") + 9;
			content = "";
			for (int i = pos;; i++) {
				if (result.charAt(i) == '"')
					break;
				content += result.charAt(i);
			}
			pos = result.indexOf("setSize(") + 8;
			String widthS="";
			String heightS="";
			for (int i = pos;; i++) {
				if (result.charAt(i) == ',') {
					for(int j=i+1;;j++) {
						if (result.charAt(j) == ')') 
							break;
						heightS += result.charAt(j);
					}
					break;
				}
				widthS += result.charAt(i);
			}
			width=Integer.parseInt(widthS);
			height=Integer.parseInt(heightS);
			System.out.println(width+" "+height);
			final SwingNode swingNode = new SwingNode();
			swingNode.setLayoutY(50);
			swingNode.setLayoutX(50);
			createSwingContent(swingNode);
			examplePane.getChildren().add(swingNode);

		});

		final Animation animation = new Transition() {
			{
				setCycleDuration(Duration.millis(1000));
				setInterpolator(Interpolator.EASE_OUT);
			}

			@Override
			protected void interpolate(double frac) {
				String x = Double.toString(round(frac, 3) * 100);
				runbtn.setStyle("-fx-background-color: linear-gradient(from 0% 50% to 100% 50%, #ffd8e5 0%, #ffd8e5 "
						+ x + "%, #ffffff " + x + "%, #ffffff 100%);");
			}
		};
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.setAutoReverse(true);
		animation.play();

	}
}

package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXScrollPane;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

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

	private ArrayList<Button> list;
	private int selectedButton;

	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}

	private void addButton(Button addButton, String name, int size, int index) {
		addButton.prefWidthProperty().bind(VboxMenu.prefWidthProperty());
		addButton.setPrefHeight(40);
		addButton.getStyleClass().add("btnSCroll");
		addButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (selectedButton != index) {

					FadeTransition fadeIn=new FadeTransition();
					fadeIn.setDuration(Duration.millis(200));
					fadeIn.setNode(GuiPane);
					fadeIn.setFromValue(0);
					fadeIn.setToValue(1);
					FadeTransition fadeOut=new FadeTransition();
					fadeOut.setDuration(Duration.millis(100));
					fadeOut.setNode(GuiPane);
					fadeOut.setFromValue(1);
					fadeOut.setToValue(0);
					fadeOut.setOnFinished((arg) -> {
						fadeIn.play();
						try {
							Parent fxml = FXMLLoader.load(getClass().getResource("/view/" + name.toString() + ".fxml"));
							GuiPane.getChildren().removeAll();
							GuiPane.getChildren().setAll(fxml);
							GuiPane.setPrefHeight(size);
							selectedButton = index;
							MainGuiPane.setVvalue(MainGuiPane.getVmin());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            });
					fadeOut.play();	
					
				}

			}
		});
		addButton.setOnMouseEntered((e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(200));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					addButton.setStyle("-fx-border-color:rgba(245,0,87," + Double.toString(round(frac, 3)) + ");");
				}
			};
			animation.play();
		}));
		addButton.setOnMouseExited((e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(200));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					addButton.setStyle("-fx-border-color:rgba(245,0,87," + Double.toString(round(1 - frac, 3)) + ");");
				}
			};
			animation.play();
		}));
		list.add(addButton);
		VboxMenu.getChildren().add(addButton);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		list = new ArrayList<Button>();
		selectedButton = -1;

		MainGuiPane.setHbarPolicy(ScrollBarPolicy.NEVER);
		StackPane header = (StackPane) scrollPane.getChildren().get(1);
		header.setPrefHeight(0);

		try {
			Parent fxml = FXMLLoader.load(getClass().getResource("/view/" + "IntroSwing" + ".fxml"));
			GuiPane.getChildren().removeAll();
			GuiPane.getChildren().setAll(fxml);
			GuiPane.setPrefHeight(1500);
			selectedButton = 0;
			MainGuiPane.setVvalue(MainGuiPane.getVmin());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// button be assigned
		addButton(new Button("Giới thiệu"), "IntroSwing", 1500, 0);
		addButton(new Button("JButton"), "JButton", 2200, 1);
		addButton(new Button("JCheckBox"), "JChecKBox", 2500, 2);
		addButton(new Button("JColorChooser"), "JColorChooser", 2700, 3);
		addButton(new Button("JComboBox"), "JComboBox", 2500, 4);
		addButton(new Button("JList"), "JList", 2900, 5);
		addButton(new Button("JOptionPane"), "JOptionPane", 2200, 6);
		addButton(new Button("JPasswordField"), "JPasswordField", 2100, 7);
		addButton(new Button("JProgressBar"), "JProgressBar", 1800, 8);
		addButton(new Button("JRadioButton"), "JRadioButton", 2700, 9);
		addButton(new Button("JTable"), "JTable", 1400, 10);
		addButton(new Button("JTextArea"), "JTextArea", 2400, 11);

		VboxMenu.setSpacing(0.5f);
		MainGuiPane.vvalueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

				String x = Double.toString((1 - newValue.doubleValue()) % 1 * 100.d);
				if (newValue.doubleValue() == 0.0) {
					x = "100";
				}
				list.get(selectedButton).setStyle("-fx-border-color:#f50057;" + "-fx-background-radius: 10%;"
						+ "-fx-text-fill: #f50057;" + "-fx-background-color: linear-gradient( #fff9fb 0%, #fff9fb " + x
						+ "%, #ffd8e5 " + x + "%, #ffd8e5 100%);");
			}
		});

		//
		JFXScrollPane.smoothScrolling((ScrollPane) scrollPane.getChildren().get(0));

	}

}

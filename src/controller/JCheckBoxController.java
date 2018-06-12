package controller;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import com.jfoenix.controls.JFXButton;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.util.Duration;
import utils.ToolTipCustom;

public class JCheckBoxController implements Initializable {
	@FXML
	private HBox declaTxt;

	@FXML
	private VBox example2;

	@FXML
	private VBox example1;

	@FXML
	private Pane example1Pane;

	@FXML
	private Pane example2Pane;

	@FXML
	private Pane mainIntro;

	@FXML
	private JFXButton tryBtn;
	
	ToolTipCustom exampl1jcb = new ToolTipCustom("Hello! I'm JCheckBox", 250, 1280);
	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}
	private Text addText(String content, Color color) {
		Text text = new Text(content);
		text.setFont(Font.font("Courier New", 16));
		text.setFill(color);
		return text;
	}

	private void createSwingContent1(SwingNode swingNode) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JCheckBox checkBox1 = new JCheckBox("C++");
				checkBox1.setPreferredSize(new Dimension(50, 50));
				swingNode.setContent(checkBox1);
			}
		});
	}

	private void createSwingContent2(SwingNode swingNode) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JCheckBox checkBox2 = new JCheckBox("Java", true);
				checkBox2.setPreferredSize(new Dimension(50, 50));
				swingNode.setContent(checkBox2);
			}
		});
	}

	private void createSwingContent3(SwingNode swingNode1, SwingNode swingNode2, SwingNode swingNode3) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JLabel label = new JLabel("Checked: ");
				label.setPreferredSize(new Dimension(200, 50));
				label.setMaximumSize(new Dimension(200, 50));
				swingNode1.setContent(label);
				JCheckBox checkBox1 = new JCheckBox("Java", true);
				checkBox1.setPreferredSize(new Dimension(50, 50));
				swingNode2.setContent(checkBox1);
				JCheckBox checkBox2 = new JCheckBox("C++", true);
				checkBox2.setPreferredSize(new Dimension(50, 50));
				swingNode3.setContent(checkBox2);
				checkBox2.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						label.setText("C++ Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
					}
				});
				checkBox1.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						label.setText("Java Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
					}
				});
			}
		});
	}

	@Override
	public void initialize(URL argo, ResourceBundle argl) {
		TextFlow txt = new TextFlow();

		txt.getChildren().addAll(addText(" public class", Color.DODGERBLUE), addText(" JCheckBox", Color.BLACK),
				addText(" extends", Color.DODGERBLUE), addText(" JToggleButton", Color.BLACK),
				addText(" implements", Color.DODGERBLUE), addText(" Accessible", Color.BLACK));
		declaTxt.getChildren().addAll(txt);
		declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
		declaTxt.toFront();

		TextFlow txtcode = new TextFlow();
		txtcode.getChildren().addAll(addText("import", Color.DODGERBLUE), addText(" javax.swing.*;\n", Color.BLACK),
				addText("public class", Color.DODGERBLUE), addText(" CheckBoxExample", Color.BLACK),
				addText("{\n CheckBoxExample(){  \n", Color.BLACK), addText("  JFrame f= ", Color.BLACK),
				addText("new ", Color.DODGERBLUE), addText("JFrame(\"CheckBox Example\"", Color.BLACK),
				addText(");    \n" + "  JCheckBox checkbox1 = ", Color.BLACK), addText("new ", Color.DODGERBLUE),
				addText("JCheckBox(", Color.BLACK), addText("\"C++\"", Color.DODGERBLUE),
				addText(");    \n" + "  checkbox1.setBounds(", Color.BLACK), addText("150,100, 50,50", Color.FIREBRICK),
				addText(");    \n" + "  JCheckBox checkbox2 = ", Color.BLACK), addText("new ", Color.DODGERBLUE),
				addText("JCheckBox(", Color.BLACK), addText("\"Java\",true", Color.DODGERBLUE),
				addText(");    \n" + "  checkbox2.setBounds(", Color.BLACK), addText("100,150, 50,50", Color.FIREBRICK),
				addText(");  \n" + "  f.add(checkBox1);  \n" + "  f.add(checkBox2);  \n" + "  f.setSize(", Color.BLACK),
				addText("400,400", Color.FIREBRICK), addText(");  \n  f.setLayout(", Color.BLACK),
				addText("null", Color.DODGERBLUE), addText(");  \n  f.setVisible(", Color.BLACK),
				addText("true", Color.DODGERBLUE), addText(");  \n }  \n", Color.BLACK),
				addText(" public static void", Color.DODGERBLUE),
				addText(" main(String args[])  \n {  \n", Color.BLACK), addText("  new ", Color.DODGERBLUE),
				addText("CheckBoxExample();  \n }\n}  ", Color.BLACK)

		);
		example1.getChildren().add(txtcode);
		example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
		example1.toFront();

		TextFlow txtcode1 = new TextFlow();

		txtcode1.getChildren().addAll(addText("import ", Color.DODGERBLUE), addText("javax.swing.*;", Color.BLACK),
				addText("\nimport ", Color.DODGERBLUE), addText("java.awt.event.*;\n", Color.BLACK),
				addText("public class", Color.DODGERBLUE),
				addText(" CheckBoxExample\n" + "{\n" + " CheckBoxExample(){    \n" + "  JFrame f=", Color.BLACK),
				addText("new ", Color.DODGERBLUE), addText("JFrame(\"CheckBox Example\");\n  ", Color.BLACK),
				addText("final", Color.DODGERBLUE), addText(" JLabel label = ", Color.BLACK),
				addText("new ", Color.DODGERBLUE),
				addText("JLabel();\n  label.setHorizontalAlignment(JLabel.CENTER); \n" + "  label.setSize(",
						Color.BLACK),
				addText("400,100", Color.FIREBRICK), addText(");    \n" + "  JCheckBox checkbox1 = ", Color.BLACK),
				addText("new ", Color.DODGERBLUE), addText("JCheckBox(", Color.BLACK),
				addText("\"C++\"", Color.DODGERBLUE), addText(");    \n" + "  checkbox1.setBounds(", Color.BLACK),
				addText("150,100, 50,50", Color.FIREBRICK),
				addText(");    \n" + "  JCheckBox checkbox2 = ", Color.BLACK), addText("new ", Color.DODGERBLUE),
				addText("JCheckBox(", Color.BLACK), addText("\"Java\"", Color.DODGERBLUE),
				addText(");    \n" + "  checkbox2.setBounds(", Color.BLACK), addText("150,150, 50,50", Color.FIREBRICK),
				addText(");    \n" + "  f.add(checkbox1); f.add(checkbox2); f.add(label);    \n"
						+ "  checkbox1.addItemListener(", Color.BLACK),
				addText("new ", Color.DODGERBLUE), addText("ItemListener() {", Color.BLACK),
				addText("\n    public void ", Color.DODGERBLUE),
				addText("itemStateChanged(ItemEvent e) { \n" + "     label.setText(", Color.BLACK),
				addText("\"C++ Checkbox: \"", Color.DODGERBLUE), addText("\n     + (e.getStateChange()==", Color.BLACK),
				addText("1", Color.FIREBRICK), addText("\"checked\":\"unchecked\"", Color.DODGERBLUE),
				addText("));}\n" + "    });\n" + "   checkbox2.addItemListener(", Color.BLACK),
				addText("new ", Color.DODGERBLUE), addText("ItemListener() {", Color.BLACK),
				addText("\n    public void ", Color.DODGERBLUE),
				addText("itemStateChanged(ItemEvent e) { \n" + "     label.setText(", Color.BLACK),
				addText("\"Java Checkbox: \"", Color.DODGERBLUE),
				addText("\n     + (e.getStateChange()==", Color.BLACK), addText("1", Color.FIREBRICK),
				addText("\"checked\":\"unchecked\"", Color.DODGERBLUE),
				addText("));\n      }\n" + "    });\n" + "  f.setSize(", Color.BLACK),
				addText("400,400", Color.FIREBRICK), addText(");  \n  f.setLayout(", Color.BLACK),
				addText("null", Color.DODGERBLUE), addText(");  \n  f.setVisible(", Color.BLACK),
				addText("true", Color.DODGERBLUE), addText(");  \n }  \n", Color.BLACK),
				addText(" public static void", Color.DODGERBLUE),
				addText(" main(String args[])  \n {  \n", Color.BLACK), addText("  new ", Color.DODGERBLUE),
				addText("CheckBoxExample();  \n }\n}  ", Color.BLACK));
		example2.getChildren().addAll(txtcode1);
		example2.setMargin(txtcode1, new Insets(5, 10, 5, 10));
		example2.toFront();

		final SwingNode swingNode1 = new SwingNode();
		swingNode1.setLayoutY(20);
		final SwingNode swingNode2 = new SwingNode();
		swingNode2.setLayoutY(50);
		createSwingContent1(swingNode1);
		createSwingContent2(swingNode2);
		example1Pane.getChildren().addAll(swingNode2, swingNode1);

		final SwingNode swingNode3 = new SwingNode();
		swingNode3.setLayoutY(0);
		final SwingNode swingNode4 = new SwingNode();
		swingNode4.setLayoutY(50);
		final SwingNode swingNode5 = new SwingNode();
		swingNode5.setLayoutY(100);
		createSwingContent3(swingNode3, swingNode4, swingNode5);

		example2Pane.getChildren().addAll(swingNode3, swingNode4, swingNode5);
		final Animation animation = new Transition() {
			{
				setCycleDuration(Duration.millis(1000));
				setInterpolator(Interpolator.EASE_OUT);
			}

			@Override
			protected void interpolate(double frac) {
				String x = Double.toString(round(frac, 3) * 100);
				tryBtn.setStyle("-fx-background-color: linear-gradient(from 0% 50% to 100% 50%, #ffd8e5 0%, #ffd8e5 "
						+ x + "%, #ffffff " + x + "%, #ffffff 100%);");
			}
		};
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.setAutoReverse(true);
		animation.play();

	}
}

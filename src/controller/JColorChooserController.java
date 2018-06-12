package controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.util.Duration;

public class JColorChooserController implements Initializable {
    @FXML
    private HBox declaTxt;

    @FXML
    private VBox example2;

    @FXML
    private VBox example1;

	@FXML
	private JFXButton tryBtn;
	
    private Text addText(String content, Color color) {
        Text text = new Text(content);
        text.setFont(Font.font("Courier New", 16));
        text.setFill(color);
        return text;
    }
    @Override
    public void initialize(URL argo, ResourceBundle argl) {
        TextFlow txt = new TextFlow();

        txt.getChildren().addAll(
                addText(" public class", Color.DODGERBLUE),
                addText(" JColorChooser", Color.BLACK),
                addText(" extends", Color.DODGERBLUE),
                addText(" JComponent ", Color.BLACK),
                addText(" implements",Color.DODGERBLUE),
                addText(" Accessible",Color.BLACK));
        declaTxt.getChildren().addAll(txt);
        declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
        declaTxt.toFront();

        TextFlow txtcode = new TextFlow();
        txtcode.getChildren().addAll(
                addText("import", Color.DODGERBLUE),
                addText(" javax.swing.*;\n", Color.BLACK),
                addText("import ",Color.DODGERBLUE),
                addText("java.awt.event.*;\n",Color.BLACK),
                addText("import", Color.DODGERBLUE),
                addText(" javax.awt.*;\n", Color.BLACK),
                addText("public class", Color.DODGERBLUE),
                addText(" ColorChooserExample", Color.BLACK),
                addText(" extends", Color.DODGERBLUE),
                addText(" JFrame ", Color.BLACK),
                addText(" implements",Color.DODGERBLUE),
                addText(" ActionListener {  \n" +
                                "JButton b;    \n" +
                                "Container c;    \n" +
                                "ColorChooserExample(){    \n" +
                                " c=getContentPane();    \n" +
                                " c.setLayout(",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("FlowLayout());\n" +
                        " b=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JButton(",Color.BLACK),
                addText("\"color\"", Color.DODGERBLUE),
                addText(");    \n"+
                        " b.addActionListener(", Color.BLACK),
                addText("this", Color.DODGERBLUE),
                addText(";\n" +
                        " c.add(b);\n" +
                        "}\n",Color.BLACK),
                addText("public void",Color.DODGERBLUE),
                addText(" actionPerformed(ActionEvent e) {\n" +
                        " Color initialcolor=Color.RED;    \n" +
                        " Color color=JColorChooser.showDialog(",Color.BLACK),
                addText("this,\"Select a color\"",Color.DODGERBLUE),
                addText(",initialcolor);    \n" +
                        " c.setBackground(color);    \n" +
                        "}\n",Color.BLACK),
                addText(" public static void", Color.DODGERBLUE),
                addText(" main(String args[]){", Color.BLACK),
                addText("\n" +
                        " ColorChooserExample ch=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("TextAreaExample();\n ch.setSize(",Color.BLACK),
                addText("400,400", Color.FIREBRICK),
                addText(");  \n ch.setVisible(", Color.BLACK),
                addText("true", Color.DODGERBLUE),
                addText(");\n ch.setDefaultCloseOperation(EXIT_ON_CLOSE);    \n" +
                        "}    \n" +
                        "}", Color.BLACK)
        );
        example1.getChildren().add(txtcode);
        example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
        example1.toFront();

        TextFlow txtcode1 = new TextFlow();

        txtcode1.getChildren().addAll(
                addText("import", Color.DODGERBLUE),
                addText(" javax.swing.*;\n", Color.BLACK),
                addText("import ",Color.DODGERBLUE),
                addText("java.awt.event.*;\n",Color.BLACK),
                addText("import", Color.DODGERBLUE),
                addText(" javax.awt.*;\n", Color.BLACK),
                addText("public class", Color.DODGERBLUE),
                addText(" ColorChooserExample", Color.BLACK),
                addText(" extends", Color.DODGERBLUE),
                addText(" JFrame ", Color.BLACK),
                addText(" implements ",Color.DODGERBLUE),
                addText("ActionListener{  \n" +
                        "JFrame f;  \n" +
                        "JButton b;  \n" +
                        "JTextArea ta;  \n" +
                        "ColorChooserExample(){  \n" +
                        " f=",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JFrame(",Color.BLACK),
                addText("\"Color Chooser Example.\"",Color.DODGERBLUE),
                addText(");" +
                        "\n b= ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JButton(",Color.BLACK),
                addText("\"Pad Color\"",Color.DODGERBLUE),
                addText(");\n"+
                        " b.setBounds(",Color.BLACK),
                addText("200,250,100,30",Color.FIREBRICK),
                addText(");    \n" +
                        " ta= ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JTextArea();  \n" +
                        " ta.setBounds(",Color.BLACK),
                addText("10,10,300,200",Color.FIREBRICK),
                addText(");\n b.addActionListener(",Color.BLACK),
                addText("this",Color.DODGERBLUE),
                addText(");  \n" +
                        " f.add(b);f.add(ta);  \n" +
                        " f.setLayout(",Color.BLACK),
                addText("null",Color.DODGERBLUE),
                addText(");\n f.setSize(",Color.BLACK),
                addText("400,400",Color.FIREBRICK),
                addText(");\n f.setVisible(",Color.BLACK),
                addText("true",Color.DODGERBLUE),
                addText(");  \n }  \n",Color.BLACK),
                addText("public void",Color.DODGERBLUE),
                addText(" actionPerformed(ActionEvent e) {\n"+
                        " Color color=JColorChooser.showDialog(",Color.BLACK),
                addText("this,\"Choose\"",Color.DODGERBLUE),
                addText(",Color.CYAN);  \n" +
                        " ta.setBackground(c);  \n" +
                        "}" +
                        "\n",Color.BLACK),
                addText("public static void",Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n",Color.BLACK),
                addText("  new ",Color.DODGERBLUE),
                addText("ColorChooserExample();  \n }\n}  ",Color.BLACK)
        );
        example2.getChildren().addAll(txtcode1);
        example2.setMargin(txtcode1, new Insets(5, 10, 5, 10));
        example2.toFront();
        
        final Animation animation = new Transition() {
			{
				setCycleDuration(Duration.millis(1000));
				setInterpolator(Interpolator.EASE_OUT);
			}

			@Override
			protected void interpolate(double frac) {
				String x = Double.toString(JButtonController.round(frac, 3) * 100);
				tryBtn.setStyle("-fx-background-color: linear-gradient(from 0% 50% to 100% 50%, #ffd8e5 0%, #ffd8e5 "
						+ x + "%, #ffffff " + x + "%, #ffffff 100%);");
			}
		};
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.setAutoReverse(true);
		animation.play();
    }
}

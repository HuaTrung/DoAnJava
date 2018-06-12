package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class JRadioButtonController implements Initializable {
    @FXML
    private HBox declaTxt;

    @FXML
    private VBox example2;

    @FXML
    private VBox example1;

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
                addText(" JRadioButton", Color.BLACK),
                addText(" extends", Color.DODGERBLUE),
                addText(" JToggleButton ", Color.BLACK),
                addText("implements ",Color.DODGERBLUE),
                addText("Accessible",Color.BLACK)
        );
        declaTxt.getChildren().addAll(txt);
        declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
        declaTxt.toFront();

        TextFlow txtcode = new TextFlow();
        txtcode.getChildren().addAll(
                addText("import", Color.DODGERBLUE),
                addText(" javax.swing.*;\n", Color.BLACK),
                addText("public class", Color.DODGERBLUE),
                addText(" RadioButtonExample", Color.BLACK),
                addText("{\nJFrame f;\nRadioButtonExample(){  \n", Color.BLACK),
                addText("f= ", Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JFrame();\nJRadioButton r1=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JRadioButton(",Color.BLACK),
                addText("\"A) Male\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "JRadioButton r2=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JRadioButton(",Color.BLACK),
                addText("\"B) Female\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "r1.setBounds(",Color.BLACK),
                addText("75,50,100,30", Color.FIREBRICK),
                addText(");\n" +
                        "r2.setBounds(", Color.BLACK),
                addText("75,100,100,30", Color.FIREBRICK),
                addText(");    \n" +
                        "ButtonGroup bg=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("ButtonGroup();    \n" +
                        "bg.add(r1);bg.add(r2);    \n" +
                        "f.add(r1);f.add(r2);      \n" +
                        "f.setSize(",Color.BLACK),
                addText("300,300",Color.FIREBRICK),
                addText(");  \nf.setLayout(", Color.BLACK),
                addText("null", Color.DODGERBLUE),
                addText(");  \nf.setVisible(", Color.BLACK),
                addText("true", Color.DODGERBLUE),
                addText(");  \n }  \n", Color.BLACK),
                addText(" public static void", Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n", Color.BLACK),
                addText("  new ", Color.DODGERBLUE),
                addText("RadioButtonExample();  \n }\n}  ", Color.BLACK)

        );
        example1.getChildren().add(txtcode);
        example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
        example1.toFront();

        TextFlow txtcode1 = new TextFlow();

        txtcode1.getChildren().addAll(
                addText("import ", Color.DODGERBLUE),
                addText("javax.swing.*;", Color.BLACK),
                addText("\nimport ", Color.DODGERBLUE),
                addText("java.awt.event.*;\n", Color.BLACK),
                addText("public class", Color.DODGERBLUE),
                addText(" RadioButtonExample", Color.BLACK),
                addText(" extends",Color.DODGERBLUE),
                addText(" JFrame",Color.BLACK),
                addText(" implements ", Color.DODGERBLUE),
                addText("ActionListener{    \n" +
                        "JRadioButton rb1,rb2;    \n" +
                        "JButton b;    \n" +
                        "RadioButtonExample(){      \n" +
                        "rb1=", Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JRadioButton(",Color.BLACK),
                addText("\"Male\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "rb2=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JRadioButton(",Color.BLACK),
                addText("\"Female\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "rb1.setBounds(",Color.BLACK),
                addText("100,50,100,30", Color.FIREBRICK),
                addText(");\n" +
                        "rb2.setBounds(", Color.BLACK),
                addText("100,100,100,30", Color.FIREBRICK),
                addText(");    \n" +
                        "ButtonGroup bg=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("ButtonGroup();    \n" +
                        "bg.add(rb1);bg.add(rb2);    \n" +
                        "b=",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JButton(",Color.BLACK),
                addText("\"click\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "b.setBounds(",Color.BLACK),
                addText("100,150,80,30",Color.FIREBRICK),
                addText(");    \n" +
                        "b.addActionListener(",Color.BLACK),
                addText("this",Color.DODGERBLUE),
                addText(");    \n" +
                        "add(rb1);add(rb2);add(b);    \n" +
                        "setSize(",Color.BLACK),
                addText("300,300",Color.FIREBRICK),
                addText(");  \nf.setLayout(", Color.BLACK),
                addText("null", Color.DODGERBLUE),
                addText(");  \nf.setVisible(", Color.BLACK),
                addText("true);\n}\n", Color.DODGERBLUE),
                addText("public void ", Color.DODGERBLUE),
                addText("actionPerformed(ActionEvent e){ ",Color.BLACK),
                addText("\nif",Color.DODGERBLUE),
                addText("(rb1.isSelected()){    \n" +
                        "JOptionPane.showMessageDialog(",Color.BLACK),
                addText("this,\"You are Male.\"",Color.DODGERBLUE),
                addText(");\n}",Color.BLACK),
                addText("\nif",Color.DODGERBLUE),
                addText("(rb2.isSelected()){    \n" +
                        "JOptionPane.showMessageDialog(",Color.BLACK),
                addText("this,\"You are Female.\"",Color.DODGERBLUE),
                addText(");\n}\n}\n",Color.BLACK),
                addText(" public static void", Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n", Color.BLACK),
                addText("  new ", Color.DODGERBLUE),
                addText("RadioButtonExample();  \n }\n}  ", Color.BLACK)
        );
        example2.getChildren().addAll(txtcode1);
        example2.setMargin(txtcode1, new Insets(5, 10, 5, 10));
        example2.toFront();
    }
}

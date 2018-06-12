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

public class JTextAreaController implements Initializable {
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
                addText(" JTextArea", Color.BLACK),
                addText(" extends", Color.DODGERBLUE),
                addText(" JTextComponent ", Color.BLACK)
        );
        declaTxt.getChildren().addAll(txt);
        declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
        declaTxt.toFront();

        TextFlow txtcode = new TextFlow();
        txtcode.getChildren().addAll(
                addText("import", Color.DODGERBLUE),
                addText(" javax.swing.*;\n", Color.BLACK),
                addText("public class", Color.DODGERBLUE),
                addText(" TextAreaExample", Color.BLACK),
                addText("{\n TextAreaExample(){  \n", Color.BLACK),
                addText("  JFrame f= ", Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JFrame(",Color.BLACK),
                addText("\"Welcome to java\"", Color.DODGERBLUE),
                addText(");    \n" +
                        "  area.setBounds(", Color.BLACK),
                addText("10,30, 200,200", Color.FIREBRICK),
                addText(");\n  f.add(area);\n  f.setSize(",Color.BLACK),
                addText("300,300", Color.FIREBRICK),
                addText(");  \n  f.setLayout(", Color.BLACK),
                addText("null", Color.DODGERBLUE),
                addText(");  \n  f.setVisible(", Color.BLACK),
                addText("true", Color.DODGERBLUE),
                addText(");  \n }  \n", Color.BLACK),
                addText(" public static void", Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n", Color.BLACK),
                addText("  new ", Color.DODGERBLUE),
                addText("TextAreaExample();  \n }\n}  ", Color.BLACK)

        );
        example1.getChildren().add(txtcode);
        example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
        example1.toFront();

        TextFlow txtcode1 = new TextFlow();

        txtcode1.getChildren().addAll(
                addText("import ",Color.DODGERBLUE),
                addText("javax.swing.*;",Color.BLACK),
                addText("\nimport ",Color.DODGERBLUE),
                addText("java.awt.event.*;\n",Color.BLACK),
                addText("public class",Color.DODGERBLUE),
                addText(" TextAreaExample",Color.BLACK),
                addText(" implements ",Color.DODGERBLUE),
                addText("ActionListener{  \n" +
                        "JLabel l1,l2;  \n" +
                        "JTextArea area;  \n" +
                        "JButton b;  \n" +
                        "TextAreaExample() {  \n" +
                        " JFrame f= ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JFrame();" +
                        "\n l1= ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JLabel();"+
                        " l1.setBounds(",Color.BLACK),
                addText("50,25,100,30",Color.FIREBRICK),
                addText(");    \n" +
                        " l2= ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JLabel();"+
                        " l2.setBounds(",Color.BLACK),
                addText("160,25,100,30",Color.FIREBRICK),
                addText(");    \n" +
                        " area= ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JTextArea();"+
                        " area.setBounds(",Color.BLACK),
                addText("20,75,250,200",Color.FIREBRICK),
                addText(");    \n" +
                        " b= ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JButton(",Color.BLACK),
                addText("\"Count Words\"",Color.DODGERBLUE),
                addText(");"+
                        " b.setBounds(",Color.BLACK),
                addText("100,300,120,30",Color.FIREBRICK),
                addText(");\n b.addActionListener(",Color.BLACK),
                addText("this",Color.DODGERBLUE),
                addText(");  \n" +
                                " f.add(l1);f.add(l2);f.add(area);f.add(b);  \n" +
                                " f.setSize(",Color.BLACK),
                addText("450,450",Color.FIREBRICK),
                addText(");  \n f.setLayout(",Color.BLACK),
                addText("null",Color.DODGERBLUE),
                addText(");  \n f.setVisible(",Color.BLACK),
                addText("true",Color.DODGERBLUE),
                addText(");  \n }  \n",Color.BLACK),
                addText("public void",Color.DODGERBLUE),
                addText(" actionPerformed(ActionEvent e){  \n" +
                        "  String text=area.getText();  \n" +
                        "  String words[]=text.split(",Color.BLACK),
                addText("\"\\\\s\"",Color.DODGERBLUE),
                addText(");  \n" +
                        "  l1.setText(",Color.BLACK),
                addText("\"Words: \"",Color.DODGERBLUE),
                addText("+words.length);  \n" +
                        "  l2.setText(",Color.BLACK),
                addText("\"Characters: \"",Color.DODGERBLUE),
                addText("+text.length());  \n" +
                        "}\n",Color.BLACK),
                addText("public static void",Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n",Color.BLACK),
                addText("  new ",Color.DODGERBLUE),
                addText("TextAreaExample();  \n }\n}  ",Color.BLACK)
        );
        example2.getChildren().addAll(txtcode1);
        example2.setMargin(txtcode1, new Insets(5, 10, 5, 10));
        example2.toFront();
    }
}

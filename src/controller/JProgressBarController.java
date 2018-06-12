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

public class JProgressBarController implements Initializable {

    @FXML
    private HBox declaTxt;

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
                addText(" public class",Color.DODGERBLUE),
                addText(" JProgressBar",Color.BLACK),
                addText(" extends",Color.DODGERBLUE),
                addText(" JComponent",Color.BLACK),
                addText(" implements",Color.DODGERBLUE),
                addText(" SwingConstants, Accessible",Color.BLACK));
        declaTxt.getChildren().addAll(txt);
        declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
        declaTxt.toFront();

        TextFlow txtcode = new TextFlow();


        txtcode.getChildren().addAll(
                addText("import",Color.DODGERBLUE),
                addText(" javax.swing.*;\n",Color.BLACK),
                addText("public class",Color.DODGERBLUE),
                addText(" ProgressBarExample",Color.BLACK),
                addText("extends ",Color.DODGERBLUE),
                addText("JFrame{\nJProgressBar jb;",Color.BLACK),
                addText("\nint ",Color.DODGERBLUE),
                addText("i=",Color.BLACK),
                addText("0",Color.FIREBRICK),
                addText(",num=",Color.BLACK),
                addText("0",Color.FIREBRICK),
                addText(";\n" +
                        "ProgressBarExample(){\n" +
                        "jb=",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JProgressBar(",Color.BLACK),
                addText("0,2000",Color.FIREBRICK),
                addText(");  \njb.setBounds(",Color.BLACK),
                addText("40,40,160,30",Color.FIREBRICK),
                addText(");\n" +
                        "jb.setValue(",Color.BLACK),
                addText("0",Color.FIREBRICK),
                addText(");\n" +
                        "jb.setStringPainted(",Color.BLACK),
                addText("true",Color.DODGERBLUE),
                addText(");  \nadd(jb);\n" +
                        "setSize(",Color.BLACK),
                addText("250,150",Color.FIREBRICK),
                addText(");    \n" +
                        "setLayout(",Color.BLACK),
                addText("null",Color.DODGERBLUE),
                addText(");  \n}\n",Color.BLACK),
                addText("public void",Color.DODGERBLUE),
                addText(" iterate(){\n",Color.BLACK),
                addText("while",Color.DODGERBLUE),
                addText("(i<=",Color.BLACK),
                addText("2000",Color.FIREBRICK),
                addText("){    \n" +
                        "  jb.setValue(i);    \n" +
                        "  i=i+",Color.BLACK),
                addText("20",Color.FIREBRICK),
                addText(";\n",Color.BLACK),
                addText("  try",Color.DODGERBLUE),
                addText("{Thread.sleep(",Color.BLACK),
                addText("150",Color.FIREBRICK),
                addText(");}",Color.BLACK),
                addText(" catch",Color.DODGERBLUE),
                addText("(Exception e){}    \n" +
                        "}    \n" +
                        "}   \n",Color.BLACK),
                addText("public static void",Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n",Color.BLACK),
                addText(" ProgressBarExample m=",Color.BLACK),
                addText("  new ",Color.DODGERBLUE),
                addText("ProgressBarExample();    \n" +
                        "    m.setVisible(",Color.BLACK),
                addText("true",Color.DODGERBLUE),
                addText(");    \n" +
                        "    m.iterate();    \n" +
                        "}    \n" +
                        "}    ",Color.BLACK)
        );

        example1.getChildren().add(txtcode);
        example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
        example1.toFront();
    }
}

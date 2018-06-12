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

public class JOptionPaneController implements Initializable {
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
                addText(" JOptionPane", Color.BLACK),
                addText(" extends", Color.DODGERBLUE),
                addText(" JComponent", Color.BLACK),
                addText(" implements", Color.DODGERBLUE),
                addText(" Accessible", Color.BLACK));
        declaTxt.getChildren().addAll(txt);
        declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
        declaTxt.toFront();

        TextFlow txtcode = new TextFlow();
        txtcode.getChildren().addAll(
                addText("import", Color.DODGERBLUE),
                addText(" javax.swing.*;\n", Color.BLACK),
                addText("public class", Color.DODGERBLUE),
                addText(" OptionPaneExample", Color.BLACK),
                addText("{\nJFrame f;\nOptionPaneExample(){  \n", Color.BLACK),
                addText(" f=", Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JFrame();  \n" +
                        " JOptionPane.showMessageDialog(f,", Color.BLACK),
                addText("\"Hello, Welcome to Java.\"",Color.DODGERBLUE),
                addText(");  \n" +
                        " }\n",Color.BLACK),
                addText(" public static void", Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n", Color.BLACK),
                addText("  new ", Color.DODGERBLUE),
                addText("OptionPaneExample();  \n }\n}  ", Color.BLACK)
        );
        example1.getChildren().add(txtcode);
        example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
        example1.toFront();

        TextFlow txtcode2 = new TextFlow();
        txtcode2.getChildren().addAll(
                addText("import", Color.DODGERBLUE),
                addText(" javax.swing.*;\n", Color.BLACK),
                addText("public class", Color.DODGERBLUE),
                addText(" OptionPaneExample", Color.BLACK),
                addText("{\nJFrame f;\nOptionPaneExample(){  \n", Color.BLACK),
                addText(" f=", Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JFrame();  \n" +
                        " String name=JOptionPane.showInputDialog(f,", Color.BLACK),
                addText("\"Enter Name\"",Color.DODGERBLUE),
                addText(");  \n" +
                        " }\n",Color.BLACK),
                addText(" public static void", Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n", Color.BLACK),
                addText("  new ", Color.DODGERBLUE),
                addText("OptionPaneExample();  \n }\n}  ", Color.BLACK)
        );
        example2.getChildren().add(txtcode2);
        example2.setMargin(txtcode2, new Insets(5, 10, 5, 10));
        example2.toFront();
    }
}

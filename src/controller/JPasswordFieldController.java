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

public class JPasswordFieldController implements Initializable {
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
                addText(" JPasswordField", Color.BLACK),
                addText(" extends", Color.DODGERBLUE),
                addText(" JTextField ", Color.BLACK)
        );
        declaTxt.getChildren().addAll(txt);
        declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
        declaTxt.toFront();

        TextFlow txtcode = new TextFlow();
        txtcode.getChildren().addAll(
                addText("import", Color.DODGERBLUE),
                addText(" javax.swing.*;\n", Color.BLACK),
                addText("public class", Color.DODGERBLUE),
                addText(" PasswordFieldExample{\n", Color.BLACK),
                addText("public static void", Color.DODGERBLUE),
                addText(" main(String args[]){  \nJFrame f= ", Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JFrame(",Color.BLACK),
                addText("\"Password Field Example\"",Color.DODGERBLUE),
                addText(");\nJPasswordField value = ",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JPasswordField();   \n" +
                        "JLabel l1=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JLabel(",Color.BLACK),
                addText("\"Password:\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "l1.setBounds(",Color.BLACK),
                addText("20,100, 80,30", Color.FIREBRICK),
                addText(");\n" +
                        "value.setBounds(", Color.BLACK),
                addText("100,100,100,30", Color.FIREBRICK),
                addText(");    \n" +
                        "f.add(value);  f.add(l1);  \n" +
                        "f.setSize(",Color.BLACK),
                addText("300,300",Color.FIREBRICK),
                addText(");  \nf.setLayout(", Color.BLACK),
                addText("null", Color.DODGERBLUE),
                addText(");  \nf.setVisible(", Color.BLACK),
                addText("true", Color.DODGERBLUE),
                addText(");  \n }  \n}", Color.BLACK)

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
                addText(" RadioButtonExample{\n", Color.BLACK),
                addText("public static void", Color.DODGERBLUE),
                addText(" main(String args[]){  \nJFrame f= ", Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JFrame(",Color.BLACK),
                addText("\"Password Field Example\"",Color.DODGERBLUE),
                addText(");\n",Color.BLACK),
                addText("final ",Color.DODGERBLUE),
                addText("JLabel label =",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JLabel();            \n" +
                        "label.setBounds(",Color.BLACK),
                addText("20,150, 200,50",Color.FIREBRICK),
                addText(");\n",Color.BLACK),
                addText("final ",Color.DODGERBLUE),
                addText("JPasswordField value = ",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JPasswordField();   \n" +
                        "value.setBounds(",Color.BLACK),
                addText("100,75,100,30", Color.FIREBRICK),
                addText(");\nJLabel l1=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JLabel(",Color.BLACK),
                addText("\"Username:\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "l1.setBounds(",Color.BLACK),
                addText("20,20, 80,30", Color.FIREBRICK),
                addText(");\nJLabel l2=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JLabel(",Color.BLACK),
                addText("\"Password:\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "l2.setBounds(",Color.BLACK),
                addText("20,75, 80,30   ", Color.FIREBRICK),
                addText(");\nJButton b=",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JButton(",Color.BLACK),
                addText("\"Login\"",Color.DODGERBLUE),
                addText(");    \n" +
                        "b.setBounds(",Color.BLACK),
                addText("100,120, 80,30", Color.FIREBRICK),
                addText(");\n",Color.BLACK),
                addText("final ",Color.DODGERBLUE),
                addText("JTextField text = ",Color.BLACK),
                addText("new ", Color.DODGERBLUE),
                addText("JTextField();   \n" +
                        "text.setBounds(",Color.BLACK),
                addText("100,20, 100,30", Color.FIREBRICK),
                addText(");    \n" +
                        "f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);  \n" +
                        "f.setSize(",Color.BLACK),
                addText("300,300",Color.FIREBRICK),
                addText(");  \nf.setLayout(", Color.BLACK),
                addText("null", Color.DODGERBLUE),
                addText(");  \nf.setVisible(", Color.BLACK),
                addText("true", Color.DODGERBLUE),
                addText(");     \n" +
                        "b.addActionListener(", Color.BLACK),
                addText("ActionListener() {",Color.BLACK),
                addText("\npublic void ",Color.DODGERBLUE),
                addText("actionPerformed(ActionEvent e) {       \n" +
                        "String data =",Color.BLACK),
                addText("\"Username \"",Color.DODGERBLUE),
                addText("+ text.getText();  \n" +
                        "data +=",Color.BLACK),
                addText("\", Password: \"+new",Color.DODGERBLUE),
                addText(" String(value.getPassword());   \n" +
                        "label.setText(data);          \n" +
                        "                }  \n" +
                        "             });   \n" +
                        "}  \n" +
                        "}  ",Color.BLACK)
        );
        example2.getChildren().addAll(txtcode1);
        example2.setMargin(txtcode1, new Insets(5, 10, 5, 10));
        example2.toFront();
    }
}

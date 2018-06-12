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

public class JListController implements Initializable {
    @FXML
    private HBox declaTxt;

    @FXML
    private VBox example1;

    @FXML
    private VBox example2;

    private Text addText(String content, Color color) {
        Text text = new Text(content);
        text.setFont(Font.font("Courier New", 16));
        text.setFill(color);
        return text;
    }
    private Text addText2(String content, Color color) {
        Text text = new Text(content);
        text.setFont(Font.font("Courier New", 16));
        text.setFill(color);
        return text;
    }
    @Override
    public void initialize(URL argo, ResourceBundle argl)
    {
        TextFlow txt = new TextFlow();

        txt.getChildren().addAll(
                addText(" public class",Color.DODGERBLUE),
                addText(" JList",Color.BLACK),
                addText(" extends",Color.DODGERBLUE),
                addText(" JComponent",Color.BLACK),
                addText(" implements",Color.DODGERBLUE),
                addText(" Scrollable, Accessible",Color.BLACK));
        declaTxt.getChildren().addAll(txt);
        declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
        declaTxt.toFront();

        TextFlow txtcode = new TextFlow();


        txtcode.getChildren().addAll(
                addText("import",Color.DODGERBLUE),
                addText(" javax.swing.*;\n",Color.BLACK),
                addText("public class",Color.DODGERBLUE),
                addText(" ListExample",Color.BLACK),
                addText("{\n ListExample(){  \n",Color.BLACK),
                addText("  JFrame f= ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JFrame();  \n",Color.BLACK),
                addText("  DefaultListModel<String> l1 = ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("DefaultListModel<>();  \n  l1.addElement(",Color.BLACK),
                addText("\"Item1\"",Color.DODGERBLUE),
                addText(");  \n  l1.addElement(",Color.BLACK),
                addText("\"Item2\"",Color.DODGERBLUE),
                addText(");  \n  l1.addElement(",Color.BLACK),
                addText("\"Item3\"",Color.DODGERBLUE),
                addText(");  \n  l1.addElement(",Color.BLACK),
                addText("\"Item4\"",Color.DODGERBLUE),
                addText(");\n  JList<String> list = ",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JList<>(l1);  \n  list.setBounds(",Color.BLACK),
                addText("100,100,75,75",Color.FIREBRICK),
                addText(");  \n  f.add(list);  \n  f.setSize(",Color.BLACK),
                addText("400,400",Color.FIREBRICK),
                addText(");  \n  f.setLayout(",Color.BLACK),
                addText("null",Color.DODGERBLUE),
                addText(");  \n  f.setVisible(",Color.BLACK),
                addText("true",Color.DODGERBLUE),
                addText(");  \n }  \n",Color.BLACK),
                addText(" public static void",Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n",Color.BLACK),
                addText("  new ",Color.DODGERBLUE),
                addText("ListExample();  \n }\n}  ",Color.BLACK)
        );

        example1.getChildren().add(txtcode);
        example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
        example1.toFront();

        TextFlow txtcode2=new TextFlow();
        txtcode2.getChildren().addAll( addText2("import",Color.DODGERBLUE),
                addText2(" javax.swing.*; \n",Color.BLACK),
                addText2("import",Color.DODGERBLUE),
                addText2(" java.awt.event.*; \n",Color.BLACK),
                addText2("public class ",Color.DODGERBLUE),
                addText2("ListExample",Color.BLACK),
                addText2("\n" +
                        "{  \n" +
                        "  ListExample(){  \n" +
                        "   JFrame f= ",Color.BLACK),
                addText2("new ",Color.DODGERBLUE),
                addText2("JFrame();\n",Color.BLACK),
                addText2("   final ",Color.DODGERBLUE),
                addText2("JLabel label = ",Color.BLACK),
                addText2("new ",Color.DODGERBLUE),
                addText2("JLabel();\n   label.setSize(",Color.BLACK),
                addText2("500,100",Color.FIREBRICK),
                addText2(");\n   JButton b=",Color.BLACK),
                addText2("new ",Color.DODGERBLUE),
                addText2("JButton(",Color.BLACK),
                addText2("\"Show\"",Color.DODGERBLUE),
                addText2(";\n   b.setBounds(",Color.BLACK),
                addText2("200,150,80,30",Color.FIREBRICK),
                addText2(");\n",Color.BLACK),
                addText2("   final",Color.DODGERBLUE),
                addText2(" DefaultListModel<String> l1 = ",Color.BLACK),
                addText2("new ",Color.DODGERBLUE),
                addText2(" DefaultListModel<>();\n   l1.addElement(",Color.BLACK),
                addText2("\"C\"",Color.DODGERBLUE),
                addText2("); l1.addElement(",Color.BLACK),
                addText2("\"C++\"",Color.DODGERBLUE),
                addText2(");\n   l1.addElement(",Color.BLACK),
                addText2("\"Java\"",Color.DODGERBLUE),
                addText2("); l1.addElement(",Color.BLACK),
                addText2("\"PHP\"",Color.DODGERBLUE),
                addText2(");\n   final",Color.DODGERBLUE),
                addText2(" JList<String> list1 = ",Color.BLACK),
                addText2("new ",Color.DODGERBLUE),
                addText2("JList<>(l1);  \n   list1.setBounds(",Color.BLACK),
                addText2("100,100,75,75",Color.FIREBRICK),
                addText2(");\n   DefaultListModel<String> l2 = ",Color.BLACK),
                addText2("new ",Color.DODGERBLUE),
                addText2(" DefaultListModel<>();\n   l2.addElement(",Color.BLACK),
                addText2("\"Turbo C++\"",Color.DODGERBLUE),
                addText2("); l2.addElement(",Color.BLACK),
                addText2("\"Struts\"",Color.DODGERBLUE),
                addText2(");\n   l2.addElement(",Color.BLACK),
                addText2("\"Spring\"",Color.DODGERBLUE),
                addText2("); l2.addElement(",Color.BLACK),
                addText2("\"YII\"",Color.DODGERBLUE),
                addText2(");\n   final",Color.DODGERBLUE),
                addText2(" JList<String> list2 = ",Color.BLACK),
                addText2("new ",Color.DODGERBLUE),
                addText2("JList<>(l2);  \n   list2.setBounds(",Color.BLACK),
                addText2("100,200,75,75",Color.FIREBRICK),
                addText2(");  \n" +
                        "   f.add(list1); f.add(list2); f.add(b); f.add(label);  \n" +
                        "   f.setSize(",Color.BLACK),
                addText2("450,450",Color.FIREBRICK),
                addText2(");  \n   f.setLayout(",Color.BLACK),
                addText2("null",Color.DODGERBLUE),
                addText2(");  \n   f.setVisible(",Color.BLACK),
                addText2("true",Color.DODGERBLUE),
                addText2(";  \n" +
                        "   b.addActionListener(",Color.BLACK),
                addText2("new ",Color.DODGERBLUE),
                addText2(" ActionListener() {\n",Color.BLACK),
                addText2("    public void ",Color.DODGERBLUE),
                addText2("actionPerformed(ActionEvent e) {   \n" +
                        "     String data = \"\"; ",Color.BLACK),
                addText2("if ",Color.DODGERBLUE),
                addText2("(list1.getSelectedIndex() != -1) {\n" +
                        "      data = ",Color.BLACK),
                addText2("\"Programming language Selected: \"",Color.DODGERBLUE),
                addText2(" + list1.getSelectedValue();   \n" +
                        "      label.setText(data);  \n" +
                        "     }",Color.BLACK),
                addText2("\n    if ",Color.DODGERBLUE),
                addText2("(list2.getSelectedIndex() != -1){  \n" +
                        "      data += ",Color.BLACK),
                addText2("\", FrameWork Selected: \"",Color.DODGERBLUE),
                addText2(";\n",Color.BLACK),
                addText2("    for",Color.DODGERBLUE),
                addText2("(Object frame :list2.getSelectedValues()){  \n" +
                        "       data += frame + \" \";  \n" +
                        "                    }  \n" +
                        "                 }  \n" +
                        "                 label.setText(data);  \n" +
                        "              }  \n" +
                        "           });   \n" +
                        "     }  ",Color.BLACK),
                addText2("\n public static void",Color.DODGERBLUE),
                addText2(" main(String args[])  \n {  \n",Color.BLACK),
                addText2("  new ",Color.DODGERBLUE),
                addText2("ListExample();  \n }\n}  ",Color.BLACK)
        );

        // mo cai web c

        example2.getChildren().add(txtcode2);
        example2.setMargin(txtcode2, new Insets(5, 10, 5, 10));
        example2.toFront();
    }
}

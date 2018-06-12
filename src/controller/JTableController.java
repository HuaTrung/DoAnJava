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

public class JTableController implements Initializable   {
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
                addText(" JTable",Color.BLACK),
                addText(" extends",Color.DODGERBLUE),
                addText(" JComponent",Color.BLACK),
                addText(" implements",Color.DODGERBLUE),
                addText(" TableModelListener, Scrollable, TableColumnModelListener, ListSelectionListener, CellEditorListener, Accessible, RowSorterListener",Color.BLACK));
        declaTxt.getChildren().addAll(txt);
        declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
        declaTxt.toFront();

        TextFlow txtcode = new TextFlow();


        txtcode.getChildren().addAll(
                addText("import",Color.DODGERBLUE),
                addText(" javax.swing.*;\n",Color.BLACK),
                addText("public class",Color.DODGERBLUE),
                addText(" TableExample {    \n" +
                        "  JFrame f;    \n" +
                        "  TableExample(){    \n" +
                        "  f=",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JFrame();    \n" +
                        "  String data[][]={ {",Color.BLACK),
                addText("\"101\",\"Amit\",\"670000\"",Color.DODGERBLUE),
                addText("},    \n" +
                        "                          {",Color.BLACK),
                addText("\"102\",\"Jai\",\"780000\"",Color.DODGERBLUE),
                addText("},    \n" +
                        "                          {",Color.BLACK),
                addText("\"101\",\"Sachin\",\"700000\"",Color.DODGERBLUE),
                addText("}};    \n" +
                        "  String column[]={",Color.BLACK),
                addText("\"ID\",\"NAME\",\"SALARY\"",Color.DODGERBLUE),
                addText("};         \n" +
                        "  JTable jt=",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JTable(data,column);    \n" +
                        "  jt.setBounds(",Color.BLACK),
                addText("30,40,200,300",Color.FIREBRICK),
                addText(");          \n" +
                        "  JScrollPane sp=",Color.BLACK),
                addText("new ",Color.DODGERBLUE),
                addText("JScrollPane(jt);    \n" +
                        "  f.add(sp);          \n" +
                        "  f.setSize(",Color.BLACK),
                addText("300,400",Color.FIREBRICK),
                addText(");    \n" +
                        "  f.setVisible(",Color.BLACK),
                addText("true",Color.DODGERBLUE),
                addText(");    \n" +
                        "}",Color.BLACK),
                addText("\n public static void",Color.DODGERBLUE),
                addText(" main(String args[])  \n {  \n",Color.BLACK),
                addText("  new ",Color.DODGERBLUE),
                addText("ListExample();  \n }\n}  ",Color.BLACK)
        );

        example1.getChildren().add(txtcode);
        example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
        example1.toFront();
    }
}

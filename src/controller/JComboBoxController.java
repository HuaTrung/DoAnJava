package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

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

public class JComboBoxController implements Initializable {
	@FXML
	private HBox declaTxt;

	@FXML
	private VBox example2;

	@FXML
	private VBox example1;

	@FXML
	private Pane example1Pane;

	private void createSwingContent(SwingNode swingNode) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				String country[] = { "India", "Aus", "U.S.A", "England", "Newzealand" };
				JComboBox cb = new JComboBox(country);
				swingNode.setContent(cb);
			}
		});
	}

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
	public void initialize(URL argo, ResourceBundle argl) {
		TextFlow txt = new TextFlow();

		txt.getChildren().addAll(addText(" public class", Color.DODGERBLUE), addText(" JComboBox", Color.BLACK),
				addText(" extends", Color.DODGERBLUE), addText(" JComponent", Color.BLACK),
				addText(" implements", Color.DODGERBLUE),
				addText(" ItemSelectable, ListDataListener, ActionListener, Accessible", Color.BLACK));
		declaTxt.getChildren().addAll(txt);
		declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
		declaTxt.toFront();

		TextFlow txtcode = new TextFlow();
		txtcode.getChildren().addAll(addText("import", Color.DODGERBLUE), addText(" javax.swing.*;\n", Color.BLACK),
				addText("public class", Color.DODGERBLUE), addText(" ComboBoxExample", Color.BLACK),
				addText("{\nJFrame f=\nCheckBoxExample(){  \n", Color.BLACK), addText(" f= ", Color.BLACK),
				addText("new ", Color.DODGERBLUE), addText("JFrame(", Color.BLACK),
				addText("\"ComboBox Example\"", Color.DODGERBLUE),
				addText(");    \n" + " String country[]={", Color.BLACK),
				addText("\"India\",\"Aus\",\"U.S.A\",\"England\",\"Newzealand\"", Color.DODGERBLUE),
				addText("}; \n" + " JComboBox cb=", Color.BLACK), addText("new ", Color.DODGERBLUE),
				addText("JComboBox(country);    \n" + " cb.setBounds(", Color.BLACK),
				addText("50, 50,90,20", Color.FIREBRICK), addText(");\n f.add(cb);\n f.setLayout(", Color.BLACK),
				addText("null", Color.DODGERBLUE), addText(");\n f.setSize(", Color.BLACK),
				addText("400,500", Color.FIREBRICK), addText(");  \n f.setVisible(", Color.BLACK),
				addText("true", Color.DODGERBLUE), addText(");  \n }  \n", Color.BLACK),
				addText(" public static void", Color.DODGERBLUE),
				addText(" main(String args[])  \n {  \n", Color.BLACK), addText("  new ", Color.DODGERBLUE),
				addText("ComboBoxExample();  \n }\n}  ", Color.BLACK));
		example1.getChildren().add(txtcode);
		example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
		example1.toFront();

		TextFlow txtcode2 = new TextFlow();
		txtcode2.getChildren().addAll(addText2("import", Color.DODGERBLUE), addText2(" javax.swing.*;\n", Color.BLACK),
				addText2("public class", Color.DODGERBLUE), addText2(" ComboBoxExample", Color.BLACK),
				addText2("{\nJFrame f;\nCheckBoxExample(){  \n", Color.BLACK), addText2(" f= ", Color.BLACK),
				addText2("new ", Color.DODGERBLUE), addText2("JFrame(", Color.BLACK),
				addText2("\"ComboBox Example\"", Color.DODGERBLUE), addText2(");\n ", Color.BLACK),
				addText2("final", Color.DODGERBLUE), addText2(" JLabel label = ", Color.BLACK),
				addText2("new ", Color.DODGERBLUE),
				addText2("JLabel();\n label.setHorizontalAlignment(JLabel.CENTER); \n" + " label.setSize(",
						Color.BLACK),
				addText2("400,100", Color.FIREBRICK), addText2("}; \n" + " JButton b=", Color.BLACK),
				addText2("new ", Color.DODGERBLUE), addText2("JButton(", Color.BLACK),
				addText2("\"Show\"", Color.DODGERBLUE), addText2(");\n" + " b.setBounds(", Color.BLACK),
				addText2("200,100,75,20", Color.FIREBRICK), addText2(");  \n" + " String languages[]={", Color.BLACK),
				addText2("\"C\",\"C++\",\"C#\",\"Java\",\"PHP\"", Color.DODGERBLUE), addText2(");\n", Color.BLACK),
				addText2(" final", Color.DODGERBLUE), addText2(" JComboBox cb=", Color.BLACK),
				addText2("new ", Color.DODGERBLUE),
				addText2("JComboBox(languages);    \n" + " cb.setBounds(", Color.BLACK),
				addText2("50, 100,90,20", Color.FIREBRICK),
				addText2(");\n f.add(cb); f.add(label); f.add(b);\n f.setLayout(", Color.BLACK),
				addText2("null", Color.DODGERBLUE), addText2(");\n f.setSize(", Color.BLACK),
				addText2("350,350", Color.FIREBRICK), addText2(");  \n f.setVisible(", Color.BLACK),
				addText2("true", Color.DODGERBLUE), addText2(");\n b.addActionListener(", Color.BLACK),
				addText2("new ", Color.DODGERBLUE), addText2("ActionListener() {\n  ", Color.BLACK),
				addText2("public void ", Color.DODGERBLUE),
				addText2("actionPerformed(ActionEvent e) { \n" + "   String data = ", Color.BLACK),
				addText2("\"Programming language Selected: \"", Color.DODGERBLUE),
				addText2("+ cb.getItemAt(cb.getSelectedIndex());  \n" + "   label.setText(data);  \n" + "   }  \n"
						+ "});           \n" + "}\n", Color.BLACK),
				addText2(" public static void", Color.DODGERBLUE),
				addText2(" main(String args[])  \n {  \n", Color.BLACK), addText2("  new ", Color.DODGERBLUE),
				addText2("ComboBoxExample();  \n }\n}  ", Color.BLACK));
		example2.getChildren().add(txtcode2);
		example2.setMargin(txtcode2, new Insets(5, 10, 5, 10));
		example2.toFront();

		final SwingNode swingNode1 = new SwingNode();
		swingNode1.setLayoutY(50);
		createSwingContent(swingNode1);
		example1Pane.getChildren().addAll(swingNode1);
	}
}

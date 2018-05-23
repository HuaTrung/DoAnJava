package controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import utils.ToolTipCustom;

public class JButtonController implements Initializable {

	@FXML
	private HBox declaTxt;

	@FXML
	private Pane mainIntro;

	@FXML
	private Label title;

	@FXML
	private VBox example1;

	@FXML
	private Label wrappedLabelexample1;

	@FXML
	private Label ouputExample1;

	@FXML
	private Pane example1Pane;
	
    @FXML
    private VBox example2;
    

    @FXML
    private Pane example2Pane;
    
	ToolTipCustom exampl1btn = new ToolTipCustom("Hello! I'm JButton", 250, 1280);

	private void createSwingContent(final SwingNode swingNode) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				swingNode.setContent(new JButton(new AbstractAction("Click me!") {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								if (!mainIntro.getChildren().contains(exampl1btn))
									mainIntro.getChildren().add(exampl1btn);
								else
									mainIntro.getChildren().remove(exampl1btn);
							}
						});

					}
				}));
			}
		});
	}
	private void createSwingContent2(final SwingNode swingNode1,final SwingNode swingNode2) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JTextField txttemp=new JTextField();
				txttemp.setPreferredSize(new Dimension(150, 30));
				
				swingNode1.setContent(new JButton(new AbstractAction("Click me!") {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								txttemp.setText("Thanks for using our app.");				
							}
						});

					}
				}));
				
				swingNode2.setContent(txttemp);
			}
		});
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// final SwingNode swingNode = new SwingNode();
		//
		// createSwingContent(swingNode);
		//
		// mainIntro.getChildren().add(swingNode);
		// System.out.println(javafx.scene.text.Font.getFamilies());
		TextFlow txt = new TextFlow();
		Text text1 = new Text(" public class");
		text1.setFont(Font.font("Courier New", 16));
		text1.setFill(Color.DODGERBLUE);
		text1.setStyle("-fx-font-weight: bold");

		Text text2 = new Text(" JButton");
		text2.setFont(Font.font("Courier New", 16));
		text2.setFill(Color.BLACK);
		text2.setStyle("-fx-font-weight: bold");

		Text text3 = new Text(" extends");
		text3.setFont(Font.font("Courier New", 16));
		text3.setFill(Color.DODGERBLUE);
		text3.setStyle("-fx-font-weight: bold");

		Text text4 = new Text(" AbstractButton");
		text4.setFont(Font.font("Courier New", 16));
		text4.setFill(Color.BLACK);
		text4.setStyle("-fx-font-weight: bold");

		Text text5 = new Text(" implements");
		text5.setFont(Font.font("Courier New", 16));
		text5.setFill(Color.DODGERBLUE);
		text5.setStyle("-fx-font-weight: bold");

		Text text6 = new Text(" Accessible");
		text6.setFont(Font.font("Courier New", 16));
		text6.setFill(Color.BLACK);
		text6.setStyle("-fx-font-weight: bold");

		txt.getChildren().addAll(text1, text2, text3, text4, text5, text6);
		declaTxt.getChildren().addAll(txt);
		declaTxt.setMargin(txt, new Insets(5, 10, 5, 10));
		declaTxt.toFront();

		TextFlow txtcode = new TextFlow();
		Text ele1 = new Text(" import");
		ele1.setFont(Font.font("Courier New", 16));
		ele1.setFill(Color.DODGERBLUE);
		// ele1.setStyle("-fx-font-weight: bold");

		Text ele2 = new Text(" javax.swing.*;\n");
		ele2.setFont(Font.font("Courier New", 16));
		ele2.setFill(Color.BLACK);
		// ele2.setStyle("-fx-font-weight: bold");

		Text ele3 = new Text(" public class");
		ele3.setFont(Font.font("Courier New", 16));
		ele3.setFill(Color.DODGERBLUE);
		// ele3.setStyle("-fx-font-weight: bold");

		Text ele4 = new Text(" ButtonExample {\n");
		ele4.setFont(Font.font("Courier New", 16));
		ele4.setFill(Color.BLACK);
		// ele4.setStyle("-fx-font-weight: bold");

		Text ele5 = new Text(" public static void");
		ele5.setFont(Font.font("Courier New", 16));
		ele5.setFill(Color.DODGERBLUE);
		// ele5.setStyle("-fx-font-weight: bold");

		Text ele6 = new Text(" main(String[] args) {\n");
		ele6.setFont(Font.font("Courier New", 16));
		ele6.setFill(Color.BLACK);
		// ele6.setStyle("-fx-font-weight: bold");

		Text ele7 = new Text("    JFrame f=");
		ele7.setFont(Font.font("Courier New", 16));
		ele7.setFill(Color.BLACK);
		// ele7.setStyle("-fx-font-weight: bold");

		Text ele8 = new Text("new");
		ele8.setFont(Font.font("Courier New", 16));
		ele8.setFill(Color.DODGERBLUE);
		// ele8.setStyle("-fx-font-weight: bold");

		Text ele9 = new Text(" JFrame(");
		ele9.setFont(Font.font("Courier New", 16));
		ele9.setFill(Color.BLACK);
		// ele9.setStyle("-fx-font-weight: bold");

		Text ele10 = new Text("\"Button Example\"");
		ele10.setFont(Font.font("Courier New", 16));
		ele10.setFill(Color.BLACK);
		// ele10.setStyle("-fx-font-weight: bold");

		Text ele11 = new Text(");  \r\n" + "    JButton b=");
		ele11.setFont(Font.font("Courier New", 16));
		ele11.setFill(Color.BLACK);
		// ele11.setStyle("-fx-font-weight: bold");

		Text ele12 = new Text("new ");
		ele12.setFont(Font.font("Courier New", 16));
		ele12.setFill(Color.DODGERBLUE);
		// ele12.setStyle("-fx-font-weight: bold");

		Text ele13 = new Text("JButton(");
		ele13.setFont(Font.font("Courier New", 16));
		ele13.setFill(Color.BLACK);
		// ele13.setStyle("-fx-font-weight: bold");

		Text ele14 = new Text("\"Click Here\"");
		ele14.setFont(Font.font("Courier New", 16));
		ele14.setFill(Color.DODGERBLUE);
		// ele14.setStyle("-fx-font-weight: bold");

		Text ele15 = new Text(");  \r\n" + "    b.setBounds(");
		ele15.setFont(Font.font("Courier New", 16));
		ele15.setFill(Color.BLACK);
		// ele15.setStyle("-fx-font-weight: bold");

		Text ele16 = new Text("50,100,95,30");
		ele16.setFont(Font.font("Courier New", 16));
		ele16.setFill(Color.FIREBRICK);

		Text ele17 = new Text(");  \r\n" + "    f.add(b);  \r\n" + "    f.setSize(");
		ele17.setFont(Font.font("Courier New", 16));
		ele17.setFill(Color.BLACK);

		Text ele18 = new Text("400,400");
		ele18.setFont(Font.font("Courier New", 16));
		ele18.setFill(Color.FIREBRICK);

		Text ele19 = new Text(");  \r\n" + "    f.setLayout(");
		ele19.setFont(Font.font("Courier New", 16));
		ele19.setFill(Color.BLACK);

		Text ele20 = new Text("null");
		ele20.setFont(Font.font("Courier New", 16));
		ele20.setFill(Color.DODGERBLUE);

		Text ele21 = new Text(");  \r\n" + "    f.setVisible(");
		ele21.setFont(Font.font("Courier New", 16));
		ele21.setFill(Color.BLACK);

		Text ele22 = new Text("true");
		ele22.setFont(Font.font("Courier New", 16));
		ele22.setFill(Color.BLACK);

		Text ele23 = new Text(");   \r\n" + "   }  \r\n" + "}  ");
		ele23.setFont(Font.font("Courier New", 16));
		ele23.setFill(Color.BLACK);

		txtcode.getChildren().addAll(ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9, ele10, ele11, ele12, ele13,
				ele14, ele15, ele16, ele17, ele18, ele19, ele20, ele21, ele22, ele23);

		example1.getChildren().add(txtcode);
		example1.setMargin(txtcode, new Insets(5, 10, 5, 10));
		example1.toFront();

		final SwingNode swingNode = new SwingNode();
		swingNode.setLayoutY(20);
		createSwingContent(swingNode);

		example1Pane.getChildren().add(swingNode);

		TextFlow txtcode2 = new TextFlow();
		Text ele2_1 = new Text(" import");
		ele2_1.setFont(Font.font("Courier New", 16));
		ele2_1.setFill(Color.DODGERBLUE);
		// ele1.setStyle("-fx-font-weight: bold");

		Text ele2_2 = new Text(" java.awt.event.*;\n");
		ele2_2.setFont(Font.font("Courier New", 16));
		ele2_2.setFill(Color.BLACK);
		// ele2.setStyle("-fx-font-weight: bold");

		Text ele2_3 = new Text(" import");
		ele2_3.setFont(Font.font("Courier New", 16));
		ele2_3.setFill(Color.DODGERBLUE);
		// ele3.setStyle("-fx-font-weight: bold");

		Text ele2_4 = new Text(" javax.swing.*;\n");
		ele2_4.setFont(Font.font("Courier New", 16));
		ele2_4.setFill(Color.BLACK);
		// ele4.setStyle("-fx-font-weight: bold");

		Text ele2_5 = new Text(" public class");
		ele2_5.setFont(Font.font("Courier New", 16));
		ele2_5.setFill(Color.DODGERBLUE);
		// ele5.setStyle("-fx-font-weight: bold");

		Text ele2_6 = new Text(" ButtonExample {\n");
		ele2_6.setFont(Font.font("Courier New", 16));
		ele2_6.setFill(Color.BLACK);
		// ele6.setStyle("-fx-font-weight: bold");

		Text ele2_7 = new Text(" public static void");
		ele2_7.setFont(Font.font("Courier New", 16));
		ele2_7.setFill(Color.DODGERBLUE);
		// ele7.setStyle("-fx-font-weight: bold");

		Text ele2_8 = new Text(" main(String[] args) {  \r\n" + "    JFrame f=");
		ele2_8.setFont(Font.font("Courier New", 16));
		ele2_8.setFill(Color.BLACK);
		// ele8.setStyle("-fx-font-weight: bold");

		Text ele2_9 = new Text("new");
		ele2_9.setFont(Font.font("Courier New", 16));
		ele2_9.setFill(Color.DODGERBLUE);
		// ele9.setStyle("-fx-font-weight: bold");

		Text ele2_10 = new Text(" JFrame(");
		ele2_10.setFont(Font.font("Courier New", 16));
		ele2_10.setFill(Color.BLACK);
		// ele10.setStyle("-fx-font-weight: bold");

		Text ele2_11 = new Text("\"Button Example\"");
		ele2_11.setFont(Font.font("Courier New", 16));
		ele2_11.setFill(Color.DODGERBLUE);
		// ele11.setStyle("-fx-font-weight: bold");

		Text ele2_12 = new Text(");\n");
		ele2_12.setFont(Font.font("Courier New", 16));
		ele2_12.setFill(Color.BLACK);
		// ele12.setStyle("-fx-font-weight: bold");

		Text ele2_13 = new Text("    final");
		ele2_13.setFont(Font.font("Courier New", 16));
		ele2_13.setFill(Color.DODGERBLUE);
		// ele13.setStyle("-fx-font-weight: bold");

		Text ele2_14 = new Text(" JTextField tf=");
		ele2_14.setFont(Font.font("Courier New", 16));
		ele2_14.setFill(Color.BLACK);
		// ele14.setStyle("-fx-font-weight: bold");

		Text ele2_15 = new Text("new");
		ele2_15.setFont(Font.font("Courier New", 16));
		ele2_15.setFill(Color.DODGERBLUE);
		// ele15.setStyle("-fx-font-weight: bold");

		Text ele2_16 = new Text(" JTextField();  \r\n" + "    tf.setBounds(");
		ele2_16.setFont(Font.font("Courier New", 16));
		ele2_16.setFill(Color.BLACK);

		Text ele2_17 = new Text("50,50, 150,20");
		ele2_17.setFont(Font.font("Courier New", 16));
		ele2_17.setFill(Color.FIREBRICK);

		Text ele2_18 = new Text(");  \r\n" + "    JButton b=");
		ele2_18.setFont(Font.font("Courier New", 16));
		ele2_18.setFill(Color.BLACK);

		Text ele2_19 = new Text("new");
		ele2_19.setFont(Font.font("Courier New", 16));
		ele2_19.setFill(Color.DODGERBLUE);

		Text ele2_20 = new Text(" JButton(");
		ele2_20.setFont(Font.font("Courier New", 16));
		ele2_20.setFill(Color.BLACK);

		Text ele2_21 = new Text("\"Click Here\"");
		ele2_21.setFont(Font.font("Courier New", 16));
		ele2_21.setFill(Color.DODGERBLUE);

		Text ele2_22 = new Text(");  \r\n" + "    b.setBounds(");
		ele2_22.setFont(Font.font("Courier New", 16));
		ele2_22.setFill(Color.BLACK);

		Text ele2_23 = new Text("50,100,95,30");
		ele2_23.setFont(Font.font("Courier New", 16));
		ele2_23.setFill(Color.FIREBRICK);

		Text ele2_24 = new Text(");  \r\n" + "    b.addActionListener(");
		ele2_24.setFont(Font.font("Courier New", 16));
		ele2_24.setFill(Color.BLACK);

		Text ele2_25 = new Text("new");
		ele2_25.setFont(Font.font("Courier New", 16));
		ele2_25.setFill(Color.DODGERBLUE);

		Text ele2_26 = new Text(" ActionListener(){\n");
		ele2_26.setFont(Font.font("Courier New", 16));
		ele2_26.setFill(Color.BLACK);

		Text ele2_27 = new Text("    public void");
		ele2_27.setFont(Font.font("Courier New", 16));
		ele2_27.setFill(Color.DODGERBLUE);

		Text ele2_28 = new Text(" actionPerformed(ActionEvent e){  \r\n" + "            tf.setText(");
		ele2_28.setFont(Font.font("Courier New", 16));
		ele2_28.setFill(Color.BLACK);

		Text ele2_29 = new Text(" actionPerformed(ActionEvent e){  \r\n" + "            tf.setText(");
		ele2_29.setFont(Font.font("Courier New", 16));
		ele2_29.setFill(Color.BLACK);

		Text ele2_30 = new Text("\"Thanks for using our app.\"");
		ele2_30.setFont(Font.font("Courier New", 16));
		ele2_30.setFill(Color.DODGERBLUE);

		Text ele2_31 = new Text(
				");  \r\n" + "        }  \r\n" + "    });  \r\n" + "    f.add(b);f.add(tf);  \r\n" + "    f.setSize(");
		ele2_31.setFont(Font.font("Courier New", 16));
		ele2_31.setFill(Color.BLACK);

		Text ele2_32 = new Text("400,400");
		ele2_32.setFont(Font.font("Courier New", 16));
		ele2_32.setFill(Color.FIREBRICK);

		Text ele2_33 = new Text(");  \r\n" + "    f.setLayout(");
		ele2_33.setFont(Font.font("Courier New", 16));
		ele2_33.setFill(Color.BLACK);

		Text ele2_34 = new Text("null");
		ele2_34.setFont(Font.font("Courier New", 16));
		ele2_34.setFill(Color.DODGERBLUE);

		Text ele2_35 = new Text(");  \r\n" + "    f.setVisible(");
		ele2_35.setFont(Font.font("Courier New", 16));
		ele2_35.setFill(Color.DODGERBLUE);

		Text ele2_36 = new Text("true");
		ele2_36.setFont(Font.font("Courier New", 16));
		ele2_36.setFill(Color.DODGERBLUE);

		Text ele2_37 = new Text(");   \r\n" + "}  \r\n" + "}  ");
		ele2_37.setFont(Font.font("Courier New", 16));
		ele2_37.setFill(Color.DODGERBLUE);

		txtcode2.getChildren().addAll(ele2_1, ele2_2, ele2_3, ele2_4, ele2_5, ele2_6, ele2_7, ele2_8, ele2_9, ele2_10,
				ele2_11, ele2_12, ele2_13, ele2_14, ele2_15, ele2_16, ele2_17, ele2_18, ele2_19, ele2_20, ele2_21,
				ele2_22, ele2_23, ele2_24, ele2_25, ele2_26, ele2_27, ele2_28, ele2_29, ele2_30, ele2_31, ele2_32,
				ele2_33, ele2_34, ele2_35, ele2_36, ele2_37);

		example2.getChildren().add(txtcode2);
		example2.setMargin(txtcode2, new Insets(5, 10, 5, 10));
		example2.toFront();

		final SwingNode swingNode1 = new SwingNode();
		final SwingNode swingNode2 = new SwingNode();
		createSwingContent2(swingNode1,swingNode2);
		swingNode1.setLayoutX(10);
		swingNode1.setLayoutY(50);
		swingNode2.setLayoutX(10);
		swingNode2.setLayoutY(0);
		example2Pane.getChildren().addAll(swingNode1,swingNode2);

		// BufferedReader br = null;
		// FileReader fr = null;
		//
		// try {
		// URL url = getClass().getResource("JButton.txt");
		// File file = new File(url.getPath());
		// br = new BufferedReader(new FileReader(file));
		//
		// title.setText(br.readLine());
		// System.out.println(url.getPath());
		// } catch (IOException e) {
		//
		// e.printStackTrace();
		//
		// } finally {
		//
		// try {
		//
		// if (br != null)
		// br.close();
		//
		// if (fr != null)
		// fr.close();
		//
		// } catch (IOException ex) {
		//
		// ex.printStackTrace();
		//
		// }
		//
		// }

	}
}

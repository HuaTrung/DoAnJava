package controller;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;

import org.sqlite.SQLiteConfig;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Callback;
import javafx.util.Duration;
import utils.DynamicCompiler.CompiledClassLoader;
import utils.DynamicCompiler.SimpleJavaFileManager;
import utils.DynamicCompiler.StringJavaFileObject;
import utils.TheTestCase;

public class SomeExerciseController implements Initializable {
	@FXML
	private Label outputTxt;

	@FXML
	private TextArea editCode;

	@FXML
	private TableView<TheTestCase> tableResult;

	@FXML
	private Label timeEslapsed;

	@FXML
	private Label title;

	@FXML
	private Label quest;

	@FXML
	private JFXButton runBtn;

	@FXML
	private Label title1;

	@FXML
	private Label title2;

	private ObservableList<TheTestCase> dataNotes;
	@FXML
	private TableColumn<TheTestCase, String> ouputCol;

	@FXML
	private TableColumn<TheTestCase, String> inputCol;

	@FXML
	private TableColumn<TheTestCase, String> youroputCol;

	@FXML
    private StackPane showDialog;
	
	private String content;
	private String error;
	private String tenham;
	private String titleCode;
	private int IDCode;
	private ArrayList<String> arr;
	private boolean goodJob;
	private String runIt(String input) {
		String[] inputS = input.split(",");
		error = "";
		String program = "" + "public class CodeGenTest {\n" + titleCode + "\n" + content + "\n}\n"
				+ "  public static void main(int a,int b) {\n" + "System.out.print(" + tenham + "(a,b));" + "  }\n"
				+ "}\n";
		System.out.println(program);
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

		JavaFileObject compilationUnit = new StringJavaFileObject("CodeGenTest", program);

		SimpleJavaFileManager fileManager = new SimpleJavaFileManager(
				compiler.getStandardFileManager(null, null, null));

		JavaCompiler.CompilationTask compilationTask = compiler.getTask(null, fileManager, null, null, null,
				Arrays.asList(compilationUnit));

		compilationTask.call();

		CompiledClassLoader classLoader = new CompiledClassLoader(fileManager.getGeneratedOutputFiles());
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		try {
			Class<?> codeGenTest = classLoader.loadClass("CodeGenTest");
			Method main = codeGenTest.getMethod("main", int.class, int.class);

			PrintStream old = System.out;
			System.setOut(PS);
			System.setErr(PS);
			int a = Integer.parseInt(inputS[0]);
			int b = Integer.parseInt(inputS[1]);
			main.invoke(null, a, b);// new Object[] { null }
			// Put things back
			System.out.flush();
			System.setOut(old);
			outputTxt.setText(test.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			error += (e.toString() + "/n");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			error += (e.toString() + "/n");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			error += (e.toString() + "/n");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			error += (e.toString() + "/n");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			error += (e.toString() + "/n");
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			error += (e.toString() + "/n");
		} finally {
			if (error.length() > 1) {
				outputTxt.setText("Xem lại đi, sai rồi kìa \n" + error);
			}
		}
		return test.toString();
	}

	private String result;

	private void populateTable() throws SQLException {
		utils.ConnectDatabase.connect();
		dataNotes = FXCollections.observableArrayList();

		inputCol.setCellValueFactory(new PropertyValueFactory<TheTestCase, String>("input"));
		ouputCol.setCellValueFactory(new PropertyValueFactory<TheTestCase, String>("output"));
		youroputCol.setCellValueFactory(new PropertyValueFactory<TheTestCase, String>("realoutput"));
		try {
			SQLiteConfig config = new SQLiteConfig();
			Statement stat = utils.ConnectDatabase.conn.createStatement();
			ResultSet rs1 = stat
					.executeQuery("select quest,title1,quantity,tenham from questForExecrise where questForExecrise.ID="
							+ Integer.toString(IDCode) + ";");
			ResultSet rs = stat.executeQuery(
					"select ioput.input as \"input\",ioput.output as\"output\" from ioput inner join questForExecrise on ioput.IDquest=questForExecrise.ID where questForExecrise.ID="
							+ Integer.toString(IDCode) + ";");
			while (rs.next()) {
				result = runIt(rs.getString("input"));
				arr.add(rs.getString("output"));
				TheTestCase nt = new TheTestCase(rs.getString("input"), rs.getString("output"), result);
				dataNotes.add(nt);
			}
			tableResult.getItems().setAll(dataNotes);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		utils.ConnectDatabase.conn.close();
	}

	private void initCode() throws SQLException {
		utils.ConnectDatabase.connect();
		try {
			SQLiteConfig config = new SQLiteConfig();
			Statement stat = utils.ConnectDatabase.conn.createStatement();
			ResultSet rs = stat
					.executeQuery("select quest,title1,quantity,tenham from questForExecrise where questForExecrise.ID="
							+ Integer.toString(IDCode) + ";");
			while (rs.next()) {
				tenham = rs.getString("tenham");
				quest.setText(rs.getString("quest"));
				title1.setText(rs.getString("title1"));
				titleCode = rs.getString("title1");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		utils.ConnectDatabase.conn.close();
	}
	private void init() {
		goodJob=false;
		arr = new ArrayList<String>();
		final Animation animation = new Transition() {
			{
				setCycleDuration(Duration.millis(30000));
				setInterpolator(Interpolator.EASE_OUT);
			}

			@Override
			protected void interpolate(double frac) {
				String x = Double.toString(JButtonController.round(frac, 3) * 100);
				timeEslapsed
						.setStyle("-fx-background-color: linear-gradient(from 0% 50% to 100% 50%, #ffd8e5 0%, #ffd8e5 "
								+ x + "%, #ffffff " + x + "%, #ffffff 100%);" + "	-fx-border-color:#f50057;\r\n"
								+ "    -fx-text-fill: #f50057;\r\n" + "    -fx-font-weight:bold;\r\n"
								+ "    -fx-font-size:16;-fx-alignment:center;");
				if (Double.toString(JButtonController.round(frac, 3) * 100).length() > 4) {
					timeEslapsed.setText(Double.toString(JButtonController.round(frac, 3) * 100).substring(0, 3) + "%");
				} else
					timeEslapsed.setText(Double.toString(JButtonController.round(frac, 3) * 100) + "%");
			}
		};
		animation.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(!goodJob) {
				
					JFXDialogLayout content=new JFXDialogLayout();
					content.setHeading(new Text("YOU LOSE! TRY MORE"));
					content.setBody(new Text("Stay true to yourself, yet always be open to learn.\n"
							+ " Work hard, and never give up on your dreams,\n"
							+ " even when nobody else believes they can come true but you.\n"
							+ " These are not cliches but real tools you need no matter \n"
							+ "what you do in life to stay focused on your path.\r\n"));
					JFXDialog dialog=new JFXDialog(showDialog,content,JFXDialog.DialogTransition.CENTER);
					JFXButton btn=new JFXButton("Okay. GO!");
					btn.setOnAction(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							dialog.close();
							editCode.setText("");
							init();
						}
						
					});
					content.setActions(btn);
					dialog.show();
				}
			}
		
		});
		animation.play();
		outputTxt.setText("Work Hard, Do your best, Have Fun!");
		outputTxt.setMaxWidth(380);
		outputTxt.setWrapText(true);
		outputTxt.setPadding(new Insets(10, 10, 10, 10));
		editCode.setFont(Font.font("Courier New", 16));
		title1.setFont(Font.font("Courier New", 16));
		title2.setFont(Font.font("Courier New", 16));
		quest.setFont(Font.font("Courier New", 16));
		quest.setMaxWidth(500);
		quest.setWrapText(true);
		outputTxt.setFont(Font.font("Courier New", 16));
		title.setText("CÂU " + Integer.toString(IDCode) + ":");
		title.setStyle("-fx-font-size	:18;-fx-font-weight:bold; -fx-underline: true;");
		try {
			initCode();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		runBtn.setOnAction(arg01 -> {
			content =editCode.getText();
			
			// Thread t1 = new Thread(new Runnable() {
			// @Override
			// public void run() {
			// Platform.runLater(new Runnable() {
			// @Override
			// public void run() {
			// try {
			// populateTable();
			// } catch (SQLException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			// });
			// }
			// });
			//
			// Thread t2 = new Thread(new Runnable() {
			// @Override
			// public void run() {
			// Platform.runLater(new Runnable() {
			// @Override
			// public void run() {
			//
			// }
			// });
			//
			// }
			// });
			try {
				populateTable();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			youroputCol
					.setCellFactory(new Callback<TableColumn<TheTestCase, String>, TableCell<TheTestCase, String>>() {
						@Override
						public TableCell<TheTestCase, String> call(
								TableColumn<TheTestCase, String> soCalledFriendStringTableColumn) {
							return new TableCell<TheTestCase, String>() {
								@Override
								public void updateItem(String item, boolean empty) {
									super.updateItem(item, empty);
									if (item != null) {
										final Animation animation = new Transition() {
											{
												setCycleDuration(Duration.millis(500));
												setInterpolator(Interpolator.EASE_OUT);
											}

											@Override
											protected void interpolate(double frac) {
												String x = Double.toString(JButtonController.round(frac, 3) * 100);
												setStyle(
														"-fx-background-color: linear-gradient(from 0% 50% to 100% 50%, #ffd8e5 0%, #ffd8e5 "
																+ x + "%, #ffffff " + x + "%, #ffffff 100%);");
											}
										};
										animation.setAutoReverse(false);
										animation.setOnFinished(new EventHandler<ActionEvent>() {
											@Override
											public void handle(ActionEvent actionEvent) {
												int pos = getIndex();
												goodJob=true;
												if (pos >= 0) {
													if (arr.get(pos).equals(item.toString())) {
														setStyle("-fx-background-color:#64dd17");
													} else {
														setStyle("-fx-background-color:#c62828");
														goodJob=false;
													}
												}
												if(goodJob&&pos==(arr.size()-1)) {
													JFXDialogLayout content=new JFXDialogLayout();
													content.setHeading(new Text("GOOD JOB"));
													content.setBody(new Text("If I said to most of the people who auditioned,\n"
															+ " 'Good job, awesome, well done,' it would have made me actually look and feel ridiculous.\n"
															+ " It's quite obvious most of the people who turned up for this audition were hopeless.\r\n" 
															));
													JFXDialog dialog=new JFXDialog(showDialog,content,JFXDialog.DialogTransition.CENTER);
													JFXButton btn=new JFXButton("Okay. GO!");
													btn.setOnAction(new EventHandler<ActionEvent>() {

														@Override
														public void handle(ActionEvent arg0) {
															// TODO Auto-generated method stub
															dialog.close();
															IDCode++;
															editCode.setText("");
															init();
														}
														
													});
													content.setActions(btn);
													dialog.show();
												}
												setText(item.toString());
											}
										});
										animation.play();

									} else {
										setText(null);
									}
								}
							};
						}
					});

		});
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		IDCode = 1;
		init();
	}
}

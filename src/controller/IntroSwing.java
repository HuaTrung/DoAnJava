package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import utils.Arrow;
public class IntroSwing implements Initializable{

	  @FXML
	    private Label cell4;

	    @FXML
	    private Label cell10;

	    @FXML
	    private Label cell5;

	    @FXML
	    private Pane mainIntro;

	    @FXML
	    private Label cell2;

	    @FXML
	    private Label cell3;

	    @FXML
	    private Label cell8;

	    @FXML
	    private Label cell9;

	    @FXML
	    private Label cell6;

	    @FXML
	    private Label cell7;

	    @FXML
	    private Label cell1;
    
    private void setToFront(Label node) {
    	node.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				node.toFront();
			}
		});
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		setToFront(cell1);
//		setToFront(cell2);
//		setToFront(cell3);
//		setToFront(cell4);
//		setToFront(cell5);
//		setToFront(cell6);
//		setToFront(cell7);
//		setToFront(cell8);
//		setToFront(cell9);
//		setToFront(cell10);
		// TODO Auto-generated method stub
		Arrow arr1=new Arrow(384,875,384,802);
		Arrow arr2=new Arrow(384,966,384,911);
		Line line1 = new Line(260, 966, 527, 966);
		Line line2 = new Line(260, 1021, 260, 966);
		Line line3= new Line(527, 1021, 527, 966);
		Arrow arr3=new Arrow(260, 1108.5f,260,1057);
		Line line4 = new Line(166, 1108.5f, 394, 1108.5f);
		Line line5 = new Line(166, 1160, 166, 1108.5f);
		Line line6= new Line(394, 1160, 394,  1108.5f);
		Arrow arr4=new Arrow(166, 1257.5f, 166,1196);
		Line line7 = new Line(74, 1257.5f, 256,1257.5f);
		Line line8 = new Line(256, 1319, 256, 1257.5f);
		Line line9= new Line(74, 1319, 74,  1257.5f);
		Arrow arr5=new Arrow(394, 1276,394,1196);
		mainIntro.getChildren().add(arr1);
		mainIntro.getChildren().add(arr2);
		mainIntro.getChildren().add(line1);
		mainIntro.getChildren().add(line2);
		mainIntro.getChildren().add(line3);
		mainIntro.getChildren().add(arr3);
		mainIntro.getChildren().add(line4);
		mainIntro.getChildren().add(line5);
		mainIntro.getChildren().add(line6);
		mainIntro.getChildren().add(arr5);
		mainIntro.getChildren().add(line7);
		mainIntro.getChildren().add(line8);
		mainIntro.getChildren().add(line9);
		mainIntro.getChildren().add(arr4);
		
	}

}

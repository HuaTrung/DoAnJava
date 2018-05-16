package utils;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ToolTipCustom extends HBox {
	  public ToolTipCustom(String message,double x,double y) {
		  Label messagelb=new Label(message);
		  this.setLayoutX(x);
		  this.setLayoutY(y);
	      //this.setPrefSize(width,height);
	      getChildren().setAll(messagelb);
	      this.setMargin(messagelb, new Insets(5,10,5,10));
	      this.getStyleClass().add("tooltipPane");
	  }
}

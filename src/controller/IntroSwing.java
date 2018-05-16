package controller;

import java.awt.MouseInfo;
import java.awt.Point;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import utils.Arrow;
import utils.ToolTipCustom;

public class IntroSwing implements Initializable {
	@FXML
	private Label containercl;

	@FXML
	private Label jlabelcl;

	@FXML
	private Label objectcl;

	@FXML
	private Label jbuttoncl;

	@FXML
	private Label appletcl;

	@FXML
	private Label jslidercl;

	@FXML
	private Label no2;

	@FXML
	private Label panelcl;

	@FXML
	private Label no1;

	@FXML
	private Label no4;

	@FXML
	private Label no3;

	@FXML
	private Label no5;

	@FXML
	private Label framecl;

	@FXML
	private Label abstractMenucl;

	@FXML
	private Label jcomboboxcl;

	@FXML
	private Label gioithieuLabel;

	@FXML
	private Label componentcl;

	@FXML
	private Label windowcl;

	@FXML
	private Label jtablecl;

	@FXML
	private Pane mainIntro;

	@FXML
	private Label jmenucl;

	@FXML
	private Label jlistcl;

	@FXML
	private Label cell1;

	@FXML
	private Label cell4;

	@FXML
	private Label cell10;

	@FXML
	private Label cell5;

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
	private Label jcomponentcl;

	@FXML
	private Label cell7;

	@FXML
	private Label dialogcl;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		gioithieuLabel.setText("Giới thiệu về Java Swing");
		Point p = MouseInfo.getPointerInfo().getLocation();
		ToolTipCustom cell1tt=new ToolTipCustom("dasdadasdasdasdasdasdasdasdczxvsdvgrotjhiorhbomyhmvsdsd",100,344+cell1.getPrefHeight()+10);
		cell1.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no1.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell1.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell2.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					
				}
			};
			animation.play();
			FadeTransition ft = new FadeTransition(Duration.millis(400), cell1tt);
			ft.setFromValue(0.0);
			ft.setToValue(1.0);
			ft.play();
			mainIntro.getChildren().add(cell1tt);
			
		});
		cell1.setOnMouseExited(e -> {
			
			mainIntro.getChildren().remove(cell1tt);
		});

		cell3.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no2.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell3.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell4.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		// cell3.setOnMouseExited(e -> {
		// cell3.getStyleClass().add("isNotHover");
		// });
		//
		cell5.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no3.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell5.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell6.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		// cell5.setOnMouseExited(e -> {
		// cell5.getStyleClass().add("isNotHover");
		// });
		//
		cell7.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no4.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell7.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell8.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		// cell7.setOnMouseExited(e -> {
		// cell7.getStyleClass().add("isNotHover");
		// });

		cell9.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no5.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell9.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell10.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		// cell9.setOnMouseExited(e -> {
		// cell9.getStyleClass().add("isNotHover");
		// });

		cell2.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no1.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell1.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell2.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});

		cell4.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no2.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell3.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell4.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		// cell3.setOnMouseExited(e -> {
		// cell3.getStyleClass().add("isNotHover");
		// });
		//
		cell6.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no3.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell5.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell6.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		// cell5.setOnMouseExited(e -> {
		// cell5.getStyleClass().add("isNotHover");
		// });
		//
		cell8.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no4.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell7.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell8.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		// cell7.setOnMouseExited(e -> {
		// cell7.getStyleClass().add("isNotHover");
		// });

		cell10.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					no5.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell9.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
					cell10.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		
		// 1 đoạn
		ToolTipCustom objecttt=new ToolTipCustom("Đây là lớp cha của mọi class.\nTất cả mọi class đều có \"Object\" như là lớp cha.",442,766);
		objectcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					objectcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
			
			FadeTransition ft = new FadeTransition(Duration.millis(300), objecttt);
			ft.setFromValue(0.0);
			ft.setToValue(1.0);
			ft.play();
			mainIntro.getChildren().add(objecttt);
		});
		objectcl.setOnMouseExited(e->{
			mainIntro.getChildren().remove(objecttt);
		});
		//
		
		// 1 đoạn
		ToolTipCustom componenttt=new ToolTipCustom("Đây là lớp cha của mọi class.\nTất cả mọi class đều có \"Object\" như là lớp cha.",336+96+10,875);
		componentcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					componentcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
			
			FadeTransition ft = new FadeTransition(Duration.millis(300), objecttt);
			ft.setFromValue(0.0);
			ft.setToValue(1.0);
			ft.play();
			mainIntro.getChildren().add(componenttt);
		});
		
		componentcl.setOnMouseExited(e->{
			mainIntro.getChildren().remove(componenttt);
		});
		//
		
		containercl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					containercl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		
		
		jcomponentcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					jcomponentcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		windowcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					windowcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		panelcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					panelcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		framecl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					framecl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		dialogcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					dialogcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		appletcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					appletcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		jlabelcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					jlabelcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		jlistcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					jlistcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		jtablecl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					jtablecl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		jcomboboxcl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					jcomboboxcl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		jslidercl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					jslidercl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		jmenucl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					jmenucl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		abstractMenucl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					abstractMenucl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		jbuttoncl.setOnMouseEntered(e -> {
			final Animation animation = new Transition() {
				{
					setCycleDuration(Duration.millis(1000));
					setInterpolator(Interpolator.EASE_OUT);
				}

				@Override
				protected void interpolate(double frac) {
					Color vColor = new Color(1, 0.895, 0.89, 1 - frac);
					jbuttoncl.setBackground(new Background(new BackgroundFill(vColor, CornerRadii.EMPTY, Insets.EMPTY)));
				}
			};
			animation.play();
		});
		// cell9.setOnMouseExited(e -> {
		// cell9.getStyleClass().add("isNotHover");
		// });

		// TODO Auto-generated method stub
		Arrow arr1 = new Arrow(384, 875, 384, 802);
		Arrow arr2 = new Arrow(384, 966, 384, 911);
		Line line1 = new Line(260, 966, 527, 966);
		Line line2 = new Line(260, 1021, 260, 966);
		Line line3 = new Line(527, 1021, 527, 966);
		Arrow arr3 = new Arrow(260, 1108.5f, 260, 1057);
		Line line4 = new Line(166, 1108.5f, 394, 1108.5f);
		Line line5 = new Line(166, 1160, 166, 1108.5f);
		Line line6 = new Line(394, 1160, 394, 1108.5f);
		Arrow arr4 = new Arrow(166, 1257.5f, 166, 1196);
		Line line7 = new Line(74, 1257.5f, 256, 1257.5f);
		Line line8 = new Line(256, 1319, 256, 1257.5f);
		Line line9 = new Line(74, 1319, 74, 1257.5f);
		Arrow arr5 = new Arrow(394, 1276, 394, 1196);
		Line line10 = new Line(643.5, 863, 712, 863);
		Line line11 = new Line(643.5, 942, 712, 942);
		Line line12 = new Line(643.5, 1021, 712, 1021);
		Line line13 = new Line(643.5, 1100, 712, 1100);
		Line line14 = new Line(643.5, 1179, 712,1179);
		Line line15 = new Line(643.5, 1258, 712, 1258);
		Line line16 = new Line(575, 1039, 643.5, 1039);
		Line line17 = new Line(643.5, 784, 712, 784);
		Line line18 = new Line(643.5, 784, 643.5, 1258);
		Arrow arr6 = new Arrow(760, 1327, 760, 1276);
		
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
		mainIntro.getChildren().add(line10);
		mainIntro.getChildren().add(line11);
		mainIntro.getChildren().add(line12);
		mainIntro.getChildren().add(line13);
		mainIntro.getChildren().add(line14);
		mainIntro.getChildren().add(line15);
		mainIntro.getChildren().add(line16);
		mainIntro.getChildren().add(line17);
		mainIntro.getChildren().add(line18);
		mainIntro.getChildren().add(arr6);

	}

}

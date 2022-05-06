import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 
 * @author G. Hutchison
 * @version 1.0
 */
public class GUIDriver extends Application {
		
	@Override
	public void start(Stage stage) throws Exception {
		Font font = new Font("Arial", 24);
		Label title = new Label("Fraction Fun");
		title.setFont(font);

		VBox vbox = new VBox(20);
		vbox.setAlignment(Pos.CENTER);

		// Design for Fraction 1 - TODO
		VBox fraction1 = new VBox(5);
		TextField num1 = new TextField();
		num1.setFont(font);
		num1.setPrefSize(80, 80);
		TextField denom1 = new TextField();
		denom1.setFont(font);
		denom1.setPrefSize(80,80);

		fraction1.getChildren().addAll(num1,denom1);

		// Design for Fraction 2 - TODO
		VBox fraction2 = new VBox(10);
				
		TextField num2 = new TextField();
		num2.setFont(font);
		num2.setPrefSize(80, 80);
		TextField denom2 = new TextField();
		denom2.setFont(font);
		denom2.setPrefSize(80,80);
		fraction2.getChildren().addAll(num2,denom2);
		

		// Layout for fractions - TODO
		HBox inFraction = new HBox(20);
		inFraction.getChildren().add(fraction1);
		inFraction.setAlignment(Pos.CENTER);
		

		Label msg = new Label();
		msg.setFont(font);

		HBox buttons = new HBox(10);
		Button btnR = new Button("Reduce");
		btnR.setFont(font);
		Button btnA = new Button("Add");
		btnA.setFont(font);
		Button btnM = new Button("Multiply");
		btnM.setFont(font);
		buttons.setAlignment(Pos.CENTER);
		buttons.getChildren().addAll(btnR, btnA, btnM);

		// Output fraction - TODO
		VBox outFraction = new VBox(10);
		TextField num3 = new TextField();
		num3.setFont(font);
		num3.setMaxSize(80, 80);
		TextField denom3 = new TextField();
		denom3.setFont(font);
		denom3.setMaxSize(80,80);
		
		outFraction.setAlignment(Pos.CENTER);
		outFraction.getChildren().addAll(num3,denom3);


		vbox.getChildren().add(title);
		vbox.getChildren().add(inFraction);
		vbox.getChildren().add(buttons);
		vbox.getChildren().add(outFraction);
		vbox.getChildren().add(msg);

		Scene scene = new Scene(vbox, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Fraction Fun");
		stage.show();

		btnR.setOnAction(e-> {
					try {
						Fraction f = new Fraction(
						Integer.valueOf(num3.getText()), 
						Integer.valueOf(denom3.getText()));
						// Create a new reduced fraction and
						// display it
						if (f.isReduced()) {
							msg.setText("Fraction is reduced");
						}
						else {
							msg.setText("I just reduced it for you.");
							f.reduce(); // reduce the fraction
						}
						
						// Output the new fraction in num3, denom3
						num3.setText(String.valueOf(f.getNumerator()));
						denom3.setText(String.valueOf(f.getDenominator()));
						
						
						
					} catch (NumberFormatException e1) {
						msg.setText(e1.getMessage());
					} catch (Exception e1) {
						msg.setText(e1.getMessage());
					}
			
		});
		//TODO
		
		btnA.setOnAction(null);
		//TODO
		
		btnM.setOnAction(null);
		//TODO
	}

	public static void main(String[] args) {
		launch(args);
	}

}

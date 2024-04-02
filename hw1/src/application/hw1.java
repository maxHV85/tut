package application;
////////////////////////
/*
Name:			Harsh Vassaram


Class: 			CSE360
ASUID:			1232275319
ASU email:		vassaram@asu.edu
Description:	Using JavaFX create a UI layout as instructed in Canvas for Joe's Deli
*/
///////////
import java.text.DecimalFormat;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class hw1 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		
		//food prices
		double eggSandwichPrice = 7.99;
		double chickenSandwichPrice = 9.99;
		double bagelPrice = 2.50;
		DecimalFormat df = new DecimalFormat("0.00");
    	String roundedbP = df.format(bagelPrice);
		double potatoSaladPrice = 4.49;
		
		//drink prices
		double coffeePrice = 1.99;
		double greenTeaPrice = 0.99;
		double orangeJuicePrice = 2.25;
		double blackTeaPrice = 1.25;

		
		HBox menuSection = new HBox(30);
		
		
		//Menu Selection for eat
		VBox eatSection = new VBox(15);
		Label eatLabel = new Label ("Eat:\n");
		CheckBox eggSandwich = new CheckBox("Egg Sandwich");
        CheckBox chickenSandwich = new CheckBox("Chicken Sandwich");
        CheckBox bagel = new CheckBox("Bagel");
        CheckBox potatoSalad = new CheckBox("Potato Salad");
        eatSection.setSpacing(31);
        Button btnOrder = new Button("Order");
        
        
        //Place the labels in VBox using addAll and getChildren
        eatSection.getChildren().addAll(eatLabel, eggSandwich, chickenSandwich, bagel, potatoSalad, btnOrder);
        
        //Menu Selection for drink
        VBox drinkSection = new VBox(15);
        Label drinkLabel = new Label ("Drink:\n");
        RadioButton blackTea = new RadioButton("Black Tea");
        RadioButton greenTea = new RadioButton("Green Tea");
        RadioButton coffee = new RadioButton("Coffee");
        RadioButton orangeJuice = new RadioButton("Orange Juice");
        drinkSection.setSpacing(31);
        Button btnCancel = new Button("Cancel");
        
        ToggleGroup group = new ToggleGroup();
        blackTea.setToggleGroup(group);
        greenTea.setToggleGroup(group);
        coffee.setToggleGroup(group);
        orangeJuice.setToggleGroup(group);
        drinkSection.getChildren().addAll(drinkLabel, blackTea, greenTea, coffee, orangeJuice, btnCancel);
		
		
		//Display Bill section
		VBox billSection = new VBox();
		TextArea billsArea = new TextArea("\t\t\tBill");
		billsArea.setPrefHeight(230); // Set the preferred height
	    billsArea.setPrefWidth(190); // Set the preferred width
	    billsArea.setEditable(false); // Make it non-editable
	    billSection.setSpacing(11);
	    Button btnConfirm = new Button("Harsh V’s second commit”");
	    billSection.getChildren().addAll(billsArea, btnConfirm); // Add the TextArea to the billSection
	    
	    
	    //merge all VBoxes section into one
	    menuSection.getChildren().addAll(eatSection, drinkSection, billSection);
	    
	    ///////////////cancel button action
	    btnOrder.setOnAction(e -> 
	    {
	    	StringBuilder totalBill = new StringBuilder("\t\t\tBill\n\n");
	    	double total = 0;
	    	
	    // Check each item and add it to the bill if it's selected
	    //food
	    if (eggSandwich.isSelected()) {
	        totalBill.append("Egg Sandwich:\t\t\t$" + eggSandwichPrice + "\n"); // Replace with actual value
	        total += eggSandwichPrice;
	        }
	    if (chickenSandwich.isSelected()) {
	        totalBill.append("Chicken Sandwich:\t\t$" + chickenSandwichPrice + "\n"); // Replace with actual value
	        total += chickenSandwichPrice;
	        }
	    if (bagel.isSelected()) {
	        totalBill.append("Bagel:\t\t\t\t$" + roundedbP + "\n"); // Replace with actual value
	        total += bagelPrice;
	        }
	    if (potatoSalad.isSelected()) {
	        totalBill.append("Potato Salad:\t\t\t$" + potatoSaladPrice + "\n"); // Replace with actual value
	        total += potatoSaladPrice;
	        }
	    //drinks
	    if (blackTea.isSelected()) {
	        totalBill.append("Black Tea:\t\t\t\t$" + blackTeaPrice + "\n"); // Replace with actual value
	        total += blackTeaPrice;
	        }
	    if (greenTea.isSelected()) {
	        totalBill.append("Green Tea:\t\t\t$" + greenTeaPrice + "\n"); // Replace with actual value
	        total += greenTeaPrice;
	        }
	    if (coffee.isSelected()) {
	        totalBill.append("Coffee:\t\t\t\t$" +  coffeePrice + "\n"); // Replace with actual value
	        total += coffeePrice;
	        }
	    if (orangeJuice.isSelected()) {
	        totalBill.append("Orange Juice:\t\t\t$" + orangeJuicePrice + "\n"); // Replace with actual value
	        total += orangeJuicePrice;
	        }
	    	String rTotal = df.format(total);
	    	totalBill.append("\nTotal Cost:\t\t\t$" + rTotal);
	    	//add the bill string to the billsArea
	    	billsArea.setText(totalBill.toString());
	    });
	    ///////////////
	    ///////////////
	    btnConfirm.setOnAction(e -> 
	    {
	    	StringBuilder totalBill = new StringBuilder("\t\t\tBill\n\n");
	    	double total = 0;
	    	// Check each item and add it to the bill if it's selected
	    	//food
	    if (eggSandwich.isSelected()) {
	    	totalBill.append("Egg Sandwich:\t\t\t$" + eggSandwichPrice + "\n"); // Replace with actual value
	    	total += eggSandwichPrice;
	    	}
	    if (chickenSandwich.isSelected()) {
	    	totalBill.append("Chicken Sandwich:\t\t$" + chickenSandwichPrice + "\n"); // Replace with actual value
	    	total += chickenSandwichPrice;
	    	}
	    if (bagel.isSelected()) {
	    	totalBill.append("Bagel:\t\t\t\t$" + roundedbP + "\n"); // Replace with actual value
	    	total += bagelPrice;
	    	}
	    if (potatoSalad.isSelected()) {
	    	totalBill.append("Potato Salad:\t\t\t$" + potatoSaladPrice + "\n"); // Replace with actual value
	    	total += potatoSaladPrice;
	    	}
	    //drinks
	    if (blackTea.isSelected()) {
	    	totalBill.append("Black Tea:\t\t\t\t$" + blackTeaPrice + "\n"); // Replace with actual value
	    	total += blackTeaPrice;
	    	}
	    if (greenTea.isSelected()) {
	    	totalBill.append("Green Tea:\t\t\t$" + greenTeaPrice + "\n"); // Replace with actual value
	    	total += greenTeaPrice;
	    	}
	    if (coffee.isSelected()) {
	    	totalBill.append("Coffee:\t\t\t\t$"  +  coffeePrice + "\n"); // Replace with actual value
	    	total += coffeePrice;
	    	}
	    if (orangeJuice.isSelected()) {
	    	totalBill.append("Orange Juice:\t\t\t$" + orangeJuicePrice + "\n"); // Replace with actual value
	    	total += orangeJuicePrice;
	    	}
	    	group.getSelectedToggle().setSelected(false); //Unselect the selected drink option
	    	eggSandwich.setSelected(false); // Unselect all checkboxes
	    	chickenSandwich.setSelected(false); 
	    	bagel.setSelected(false); 
	    	potatoSalad.setSelected(false); 
	    	//Set sales tax to 7% of the Total  
	    	totalBill.append("\nSubtotal:\t\t\t\t$" + total + "\n");
	    	double salesTax = total * (0.07);
	    	String roundedsT = df.format(salesTax);
	    	totalBill.append("Sales Tax (7%):\t\t\t$" + roundedsT + "\n");
	    	total += salesTax;
	    	//Use Decimal Format to format the total cost number to 2 decimal place
	    	String roundedTotal = df.format(total);
	    	totalBill.append("\nTotal Cost:\t\t\t$" + roundedTotal);
	    	//add the bill string to the billsArea
	    	billsArea.setText(totalBill.toString());
	    	});
	    	///////////////cancel button
	    btnCancel.setOnAction(e -> 
	    {
	    	//TO handle the exception when it is already cleared
	    	//
	    	if (group.getSelectedToggle() != null) {
	    	        group.getSelectedToggle().setSelected(false); //Unselect the selected drink option
	    	        eggSandwich.setSelected(false); // Unselect all checkboxes
		    	    chickenSandwich.setSelected(false); 
		    	    bagel.setSelected(false); 
		    	    potatoSalad.setSelected(false);
	    	    }
	    	    billsArea.clear();
	    	    billsArea.setText("\t\t\tBill"); // Set the text to "Bill" only after clear 
	    });
	    
	    
	    //Label test = new Label("test");
	    //test.setAlignment(Pos.CENTER);
	    // Title
	    
	    Label titleLabel = new Label("Joe's Deli\n\n\n");
	    //Set font
	    titleLabel.setFont(new Font("Arial", 20));
	    
			//Arrange properly in the border pane as it holds the eat drink and bill section
	    
			BorderPane root = new BorderPane();
			root.setTop(titleLabel);
			BorderPane.setAlignment(titleLabel, Pos.CENTER);
			root.setCenter(menuSection);
			
			// For padding in BorderPane
			root.setPadding(new Insets(0, 15, 0, 15));

			// For margins in HBox
			//HBox.setMargin(menuSection, new Insets(0, 20, 0, 20));
			
			Scene scene = new Scene(root,525,350);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//StackPane root1 = new StackPane();
			
			
	        //Title of the Screen
			primaryStage.setTitle("n class GitHub activity”");
			primaryStage.setScene(scene);
			primaryStage.show();
			}
	
	
}

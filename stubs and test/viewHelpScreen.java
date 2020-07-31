
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class viewHelpScreen {
	private Stage window;
	private Scene HelpScreen;
	private Scene HomeScreenScene;
	
	/**
	 * viewHelpScreen constructor create another scene
	 */
	/**
	 * viewModifyExist constructor show the ModifyExist scene
	 * it have a button, when click the button, it will go back to the home screen
	 * @param Stage - the stage that we use in controller
	 * @return none
	 */
	public viewHelpScreen(Stage theStage) {
		window = theStage;
		
		Label label1 = new Label("Help");
		Button backButton = new Button("back");
		backButton.setOnAction(e -> window.setScene(HomeScreenScene));
		
		
		
		//layout 1
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1,backButton);
		HelpScreen = new Scene(layout1, 600,600);
		
		window.setScene(HelpScreen);
		window.setTitle("Help");
		window.show();
		
	}
	
	/**
	 * the display method will show all the user tips for the garden feature
	 * @param none
	 * @return none
	 */
	public void display() {
		//create, modify existing, preset garden, search bar..
	}

}


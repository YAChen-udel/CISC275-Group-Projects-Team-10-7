
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class viewModifyExist {
	
	private Stage window;
	private Scene MosifyExsitScene;
	private Scene HomeScreenScene;

	/**
	 * viewModifyExist constructor show the ModifyExist scene
	 * it have a button, when click the button, it will go back to the home screen
	 * @param Stage - the stage that we use in controller
	 * @return none
	 */
	public viewModifyExist(Stage theStage) {
		window = theStage;
		
		Label label1 = new Label("Modify Existing");
		Button backButton = new Button("back");
		backButton.setOnAction(e -> window.setScene(HomeScreenScene));
		
		
		
		//layout 1
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1,backButton);
		MosifyExsitScene = new Scene(layout1, 600,600);
		
		window.setScene(MosifyExsitScene);
		window.setTitle("Modify Exist");
		window.show();
		
	}
	
	public void getExistingFile() {
		
	}
	
	public void loadExistingFile() {
		
	}
	

}


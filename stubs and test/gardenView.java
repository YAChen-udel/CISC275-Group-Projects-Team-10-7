//Group 10-7

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import javafx.stage.Stage;

public class gardenView {
	
	int canvasWidth = 1380;
	int canvasHeight = 940;
	Image background;
	ImageView Image = new ImageView();
	
	
	/**
	 * the gardenView constructor View constructor initialize the starting position for the image
	 * @param theStage hosts a Scene, which consists of visual elements.
	 * @return none
	 */
	public gardenView(Stage theStage) {
		theStage.setTitle("MyGarden");

		Group root = new Group();
		Scene theScene = new Scene(root);
		theStage.setScene(theScene);

		Canvas canvas = new Canvas(canvasWidth, canvasHeight);
		root.getChildren().add(canvas);
		
	}
	
	 
	/**
	 * the Image method read from file
	 * @param image_file
	 * @return the image
	 */
	 public Image createImage(String image_file) {
	     Image img = new Image(image_file);
	     return img;   	
	 }
	 
	
	 /**
	  * importImages method used to import the images 
	  * @param x
	  * @return none
	  */
	public void importImages(Image x) {
		Image.setImage(x);
	    Image.setPreserveRatio(true);
	    Image.setFitHeight(100);
		
	}
	
	/**
	 * update method is to change the scene to scene with button
	 * @param Stage theStage
	 */
	public void update(Stage theStage) {
		//many scene, like modify exist, help, create screen...
	}
	
		
		
	 
}


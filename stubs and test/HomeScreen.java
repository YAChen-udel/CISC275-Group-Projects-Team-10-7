import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * 
 * @author Jack Butera
 *
 */

public class HomeScreen {
	Scene currentWindow;
	
	/**
	 * This loadImage method is used for showing the home screen and the 
	 * different pages to access from the start
	 * @param img - the home screen image
	 * @return none
	 */
	public void loadImage(Image img) {
		ImageView viewPreview = new ImageView(img);
		
	}
	/**
	 * This switchScenes method switches scenes to the window in which the user
	 * selects to go to
	 * @param newWindow - the scene to switch to form the home screen
	 * @return none
	 */
	public void switchScenes(Scene newWindow) {
		this.currentWindow = newWindow;
		
	}
	
	
}

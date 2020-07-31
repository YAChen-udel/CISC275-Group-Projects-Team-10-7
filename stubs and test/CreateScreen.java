import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
/**
 * 
 * @author Jack Butera
 *
 */


public class CreateScreen {
	int width;
	int height;
	String filename;
	
	/**
	 * CreateScreen constructor that takes in a filename, width, and height, 
	 * to initialize the name of the new file and the gardens dimensions
	 * @param filename - name of the new file
	 * @param width - width of the plot
	 * @param height - height of the plot
	 * @return none
	 */
	public CreateScreen(String filename, int width, int height) {
		this.filename = filename;
		this.width = width;
		this.height = height;
	}
	
	
	/**
	 * This generatePlotFromDim method creates a TilePane for the plot of the garden 
	 * with the dimensions set to width by height
	 * @return none
	 */
	public void generatePlotFromDim() {
		Scene plot = new Scene(new TilePane(), width, height);
	}
	
	/**
	 * This loadImage method takes in a preview image of a garden and displays it
	 * to give the user an idea of what the plot will look like
	 * @param preview - image of a garden with similar plot size as what is inputed
	 */
	public void loadImage(Image preview) {
		ImageView viewPreview = new ImageView(preview);
	}
	
	
	

}

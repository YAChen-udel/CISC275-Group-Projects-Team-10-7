import java.util.ArrayList;
import java.util.HashMap;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
/**
 * 
 * @author Jack Butera
 *
 */



public class PresetGarden {
	private HashMap<String,String> presets = new HashMap<>();
	
	/**
	 * PresetGarden constructor that loads in a preset garden with listed plants
	 * and dimensions into the HashMap presets
	 * @param presetList - a list of preset Gardens with its dimensions and plants
	 * @return none
	 */
	public PresetGarden(ArrayList<String> presetList) {
		
	}
	/**
	 * This makePresetGarden method takes in the garden name and its dimensions and creates 
	 * the preset plot for you in a TilePane
	 * @param garden - name of the preset garden
	 * @param width - width of the garden
	 * @param height - height of the garden
	 * @return none
	 */
	public void makePresetGarden(String garden, int width, int height) {
		Scene plot = new Scene(new TilePane(), width, height);
	}
	
	/**
	 * This loadImage method takes in the name of a garden and displays it
	 * to show the user what the preset garden looks like
	 * @param garden - name of the garden to be shown
	 * @return none
	 */
	public void loadImage(String garden) {
		Image img = new Image(garden);
		ImageView viewPreview = new ImageView(garden);
	}

}

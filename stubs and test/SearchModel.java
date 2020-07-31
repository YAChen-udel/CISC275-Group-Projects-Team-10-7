import java.util.ArrayList;
import java.util.HashMap;

/**
 * The SearchModel class contains the logic that allows the user to search for plants
 * that matches their input. This class has HashMaps as attributes that stores the plant name
 * as keys and plant characteristics as values
 * @author Team 10-7
 */
public class SearchModel {
	private HashMap<String,String> lightLevel = new HashMap<>();
	private HashMap<String,String> waterUse = new HashMap<>();
	private HashMap<String,String> bloomTime = new HashMap<>();
	private HashMap<String,String> foodCreated = new HashMap<>();
	
	
	
	/**
	 * SearchModel constructor that loads in the plant name and their characteristics into 
	 * their respective HashMaps
	 * @param plantList - a list of plants and their 
	 * @return none
	 */
	public SearchModel(ArrayList<String> plantList) {
		
	}
	
	/**
	 * The filter method will find plants that matches the desired characteristics that were given in the 
	 * parameters. The function will search through the HashMaps and will add plants that matches the given
	 * characteristics into an ArrayList. That ArrayList will be return.
	 * @param light - Desired light level: shade, part shade, sunny
	 * @param water - Desired water use: dry, medium, wet
	 * @param bloom - Desired bloom time: April, May, etc
	 * @param food - Food created by plants: berries, acorn, nuts, etc
	 * @return an ArrayList of plants that matches the given input characteristics
	 */
	public ArrayList<String> filter(String light, String water, String bloom, String food){
		ArrayList<String> arr = new ArrayList<>();
		return arr;
	}
	
	

}

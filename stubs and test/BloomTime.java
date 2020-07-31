/**
 * 
 * @author Team 10-7
 *
 *	This enum will be used in the screen layout next to for the 
 *season slider. By switching to winter, the plants will be show 
 *the images of the plant on their plot as the would be in the 
 *winter. The same thing applies for the spring, summer, and fall.
 *This will also be used in the search filters for Bloom time.
 */
public enum BloomTime {
	/**
	 * Switches the plant images to winter preset.
	 */
	WINTER("winter"), 
	
	/**
	 * Switches the plant images to spring preset
	 */
	SPRING("spring"), 
	
	/**
	 * Switches the plants images to summer preset
	 */
	SUMMER("summer"), 
	
	/**
	 * Switches the plants images to fall preset
	 */
	FALL("fall");
	
	/**
	 * name of season
	 */
	private String season = null;
	
	/**
	 * BloomTime constructor. Sets the season s. 
	 * @param s 
	 */
	private BloomTime(String s) {
		season = s;
	}
	
	/**
	 * returns the season string.
	 * @return season
	 */
	public String getSeason() {
		return season;
	}
};

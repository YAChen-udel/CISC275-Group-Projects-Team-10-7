
/**
 * Junit testing for the filter method in the SearchModel class
 * @author Team 10-7
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SearchTest {
	/**
	 * Creates an ArrayList and added plants into the list. A SearchModel object is created with the plantList as 
	 * parameter. An assertEqual method is called with an expected result and the actual result.
	 */
	@Test
	void filterTest() {
		ArrayList<String> plantList = new ArrayList<>();
		plantList.add("White Oak");
		plantList.add("Red Maple");
		plantList.add("Serviceberry");
		plantList.add("Swamp Milkweed");
		plantList.add("Milkweed");
		plantList.add("Dogwood");
		plantList.add("Butterfly Weed");
		
		
		SearchModel search = new SearchModel(plantList);
		
		ArrayList<String> test1 = search.filter("sun","medium","may","acorns");
		ArrayList<String> expectedList1 = new ArrayList<>();
		expectedList1.add("White Oak");
		assertEquals(expectedList1,test1);
		
		ArrayList<String> test2 = search.filter("part shade","wet","march","none");
		ArrayList<String> expectedList2 = new ArrayList<>();
		expectedList2.add("Red Maple");
		assertEquals(expectedList2,test2);
		
		ArrayList<String> test3 = search.filter("sun","dry","june","seeds");
		ArrayList<String> expectedList3 = new ArrayList<>();
		expectedList3.add("Milkweed");
		expectedList3.add("Butterfly Weed");
		assertEquals(expectedList3,test3);
		
		ArrayList<String> test4 = search.filter("sun,part shade","medium","may","berries");
		ArrayList<String> expectedList4 = new ArrayList<>();
		expectedList4.add("Dogwood");
		assertEquals(expectedList4,test4);

		


		
		
		
		

		

		

		

		
		

		


		

		
		
		
		
		
		
		
	}

}

/**
 * Junit testing for the setX and setY method in the SearchModel class
 * @author Team 10-7
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DragDropModelTest {

	@Test
	void XYtest() {
		DragDropModel dragDrop = new DragDropModel();
		
		
		dragDrop.setX(5.5);		
		double result1 = dragDrop.getX();	
		assertEquals(result1,5.5);
		
		dragDrop.setY(10.5);
		double result2 = dragDrop.getY();
		assertEquals(result2,10.5);
		
	
	}

}

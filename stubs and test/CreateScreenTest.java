import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreateScreenTest {

	@Test
	void test() {
		CreateScreen test1 = new CreateScreen("file1", 100, 400);
		assertEquals(400, test1.height);
		test1.width = 150;
		assertEquals(150, test1.width);
		assertNotEquals("file", test1.filename);
	}

}

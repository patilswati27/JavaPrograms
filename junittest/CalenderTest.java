package junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.datastructPrograms.Calender;

@DisplayName("Running CalenderTest ")
class CalenderTest {
	Calender c = new Calender();

	@Test
	@DisplayName("Testing Display method ")
	void testDisplay() {
		assertSame("Calender displayed", c.display(2), "Should display calender according to the month");
	}

	@Test
	@DisplayName("Testing DayOfWeek method ")
	void testDayOfWeek() {
		assertEquals(6, c.dayOfWeek(2, 2020), "Should return start day of the week ");
	}

}

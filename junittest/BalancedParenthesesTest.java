package junittest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.datastructPrograms.BalancedParentheses;

@DisplayName("Running BalancedParenthesesTest ")
class BalancedParenthesesTest {

	@Test
	@DisplayName("Testing IsbalancedParenthes")
	void testIsbalancedParenthes() {
		assertTrue(BalancedParentheses.isbalancedParenthes("(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)"));
	}


}

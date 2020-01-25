package junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.datastructPrograms.PalindromeChecker;

@DisplayName("Running PalindromeCheckerTest ")
class PalindromeCheckerTest {
	PalindromeChecker check = new PalindromeChecker();

	@Test
	@DisplayName("Testing PalindromeChecker method ")
	void testispalindrome() {
		assertTrue(check.ispalindrome("swaaws"), "Should check given string is palindrome or not");
	}

}

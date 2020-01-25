package junittest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.datastructPrograms.Util;

class ReadFileTest {
	Util u = new Util();

	@Test
	@DisplayName("Testing readfromfile method ")
	void testReadFromFile() throws IOException {
		assertEquals("a d c g k", u.readFromFile("/home/admin106/Desktop/wordlist.txt"));
	}

}

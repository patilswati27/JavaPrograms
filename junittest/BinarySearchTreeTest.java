package junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.datastructPrograms.BinarySearchTree;

@DisplayName("Running BinarySearchTreeTest")
class BinarySearchTreeTest {
	BinarySearchTree tree = new BinarySearchTree();

	@Test
	@DisplayName("Testing factorial method ")
	void testFactorial() {
		assertEquals(120, tree.factorial(5)," Should find factorial ");
	}

	@Test
	@DisplayName("Testing numOfBST method ")
	void testnumOfBST() {
		assertEquals(42, tree.numOfBST(5)," Should return no of possible BST");
	}

}

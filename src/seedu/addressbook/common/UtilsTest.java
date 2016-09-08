package seedu.addressbook.common;

import java.util.*;
import seedu.addressbook.common.Utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test; 

public class UtilsTest {
	
	@Before public void setUp() {
		private final firstObject = "";
		private final secondObject = "";
		private final thirdObject = "";
		private final forthObject = " ";
		private final fifthObject = "1";
		
	}
	
	@Test
	public void isAnyNull_oneObjectNull_trueReturned() {
		assertTrue("There is one object null.", Utils.isAnyNull(firstObject, secondObject, null));
	}
	
	@Test
	public void isAnyNull_moreThanOneObjectNull_trueReturned() {
		assertTrue("There is more than one object null.", Utils.isAnyNull(firstObject, null, null));
	}
	
	@Test
	public void isAnyNull_allObjectNull_trueReturned() {
		assertTrue("All the objects are null.", Utils.isAnyNull(null, null, null));
	}
	
	@Test
	public void isAnyNull_noObjectNull_falseReturned() {
		assertFalse("All objects are not null.", Utils.isAnyNull(firstObject, secondObject, thirdObject));
	}
	
	@Test
	public void elementsAreUnique_noElementUnique_falseReturned() {
		assertFalse(Utils.elementsAreUnique(firstObject, secondObject, thirdObject));
	}
	
	@Test
	public void elementsAreUnique_someElementUnique_falseReturned() {
		assertFalse(Utils.elementsAreUnique(firstObject, secondObject, forthObject));
	}
	
	@Test
	public void elementsAreUnique_allElementUnique_trueReturned() {
		assertTure(Utils.elementsAreUnique(firstObject, forthObject, fifthObject));
	}
	
}

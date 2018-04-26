package sample.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import day1_16_04.ReverseString;

public class ReverseStringTestClass {

	@SuppressWarnings({ "PMD.DefaultPackage", "PMD.CommentDefaultAccessModifier", "PMD.CommentRequired",
			"PMD.BeanMembersShouldSerialize" })
	
	ReverseString string = new ReverseString();			/* object of ReverseString class */
	
	@Test
	@SuppressWarnings("PMD.JUnitAssertionsShouldIncludeMessage")
	public void testReverseStringSuccess()
	{
		assertEquals("i evol seognam oot hcum ",string.reverseString("i love mangoes too much "));		
	}
	
	
}

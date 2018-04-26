package sample.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import day1_16_04.ContainsDuplicate;

public class DuplicateTestClass {

	@SuppressWarnings({ "PMD.DefaultPackage", "PMD.CommentDefaultAccessModifier", "PMD.CommentRequired" })
	final ContainsDuplicate take = new ContainsDuplicate();
	
	@Test
	@SuppressWarnings("PMD.JUnitAssertionsShouldIncludeMessage")
	public void testDuplicateSuccess()
	{
		
		assertEquals("found","found");
	}
	
	@Test
	@SuppressWarnings("PMD.JUnitAssertionsShouldIncludeMessage")
	public void testDuplicateFailure()
	{
		
		assertEquals("Not found","Not found");
	}
}

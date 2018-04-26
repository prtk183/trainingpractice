package sample.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import day1_16_04.Pallindrom;

public class PallindromTestClass {
	
	@SuppressWarnings({ "PMD.DefaultPackage", "PMD.CommentDefaultAccessModifier", "PMD.CommentRequired",
			"PMD.BeanMembersShouldSerialize" })
	
	Pallindrom string = new Pallindrom();

	
	@Test
	@SuppressWarnings("PMD.JUnitAssertionsShouldIncludeMessage")
	public void testPallindromSuccess()
	{
		assertEquals(121,string.checkIntPallindrom(121));
		
	}
		
	@Test
	@SuppressWarnings("PMD.JUnitAssertionsShouldIncludeMessage")
	public void testPallindromFailure()
	{
		assertEquals(321,string.checkIntPallindrom(123));		
	}

	@Test
	@SuppressWarnings("PMD.JUnitAssertionsShouldIncludeMessage")
	public void testPallindromStringFailure()
	{
		assertEquals("[1, 2, 1, -]",string.checkStringPallindrom("-121"));		
	}
}

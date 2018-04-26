package sample.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import day1_16_04.SortPallindrom;

public class SortPallindromTestClasss {

	@SuppressWarnings({ "PMD.DefaultPackage", "PMD.BeanMembersShouldSerialize" })
	SortPallindrom array1 = new SortPallindrom();
	
	@SuppressWarnings("PMD.DefaultPackage")
	int ar1[] = {132,121,34,54,67,11,23,111,62,78};;
	@Test
	@SuppressWarnings({ "PMD.MethodNamingConventions", "PMD.JUnitAssertionsShouldIncludeMessage" })
	public void TestSucces()
	{
		assertEquals("[11, 32, 43, 45, 26, 76, 87, 111, 121, 231]",array1.operate(ar1));
	}
}

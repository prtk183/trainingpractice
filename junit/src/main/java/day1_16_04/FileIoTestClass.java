package day1_16_04;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileIoTestClass {

	@SuppressWarnings("PMD.DefaultPackage")
	FileIo file = new FileIo();
	
	@SuppressWarnings("PMD.DefaultPackage")
	String path ="C:\\Users\\trainee\\prateek\\day1_16_04\\src\\day1_16_04\\sample.txt";
	@Test
	@SuppressWarnings("PMD.JUnitAssertionsShouldIncludeMessage")
	public void fileReadSucces()
	{
		assertEquals("hey ram!",file.openFile(path));
	}
}

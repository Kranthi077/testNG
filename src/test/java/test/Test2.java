package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {

	@Test (groups = {"smoke"})
	public void thirdTestcase() {
		System.out.println("Personal Loan Third test case in TestNG");
	}
	
	@AfterSuite
	public void deleteFilesFromDownloadDirectory() {
		//this method body will have code to delete file from downloads
		System.out.println("I am(driver) in After suite method to delete downloaded files");
	}
	
}

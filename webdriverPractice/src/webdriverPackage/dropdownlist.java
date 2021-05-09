package webdriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {
	
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumjava\\drivers\\chromedriver_win90\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://pmkisan.gov.in/gisdashboard/villagelevel.aspx");
		dr.manage().window().maximize();
		
		Select state = new Select(dr.findElement(By.xpath("//select[@id='DdlState']")));
		state.selectByIndex(4);//to identify the number of index from the dropdownlist
		//state.selectByValue("19"); //to identify the value from the dropdownlist
		//state.selectByVisibleText("TAMIL NADU");//to identify the text from the dropdownlist

}
}

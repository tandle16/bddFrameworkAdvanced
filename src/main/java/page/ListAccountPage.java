package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListAccountPage {
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public ListAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.ID, using = "account")
	WebElement AccountTitleField;

	public List<String> getListOf(String columnName) {
		
		int headerIndex = getHeaderIndex(columnName);
		
		//System.out.print("headerIndex: " + headerIndex);

		List<WebElement> columndataElements = driver
				.findElements(By.xpath("//table/tbody/tr/td["+headerIndex+"]"));
		
		//System.out.println("columndataElements size: " + columndataElements.size());
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < columndataElements.size(); i++) {
			//System.out.println("getListOf: " + i + columndataElements.get(i).getText());
			list.add(i, columndataElements.get(i).getText());
		}

		return list;

	}

	private int getHeaderIndex(String columnName) {

		List<WebElement> elements = driver.findElements(By.xpath("//table/descendant::th"));
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equalsIgnoreCase(columnName)) {
				return i + 1;
			}
		}
		return 0;
	}

}

//	public List<String> getColumnDataFor(String columnHeader) {
//		List<String> columnData = new ArrayList<String>();
//		int index = getColumnHeaderIndexFor(columnHeader);
//		
//		String xpath = "//table[@class='table table-striped table-bordered']/tbody/tr/td["+index+"]";
//		List<WebElement> columnDataElements = driver.findElements(By.xpath(xpath));
//		
//		for(int i=0; i<columnDataElements.size(); i++) {
//			columnData.add(columnDataElements.get(i).getText());
//		}
//		return columnData;
//	}
//
//	private int getColumnHeaderIndexFor(String columnHeader) {
//		String xpath = "//table[@class='table table-striped table-bordered']/tbody/tr[1]/th";
//		List<WebElement> columnHeaderElements = driver.findElements(By.xpath(xpath));
//		int index = 1;
//		for (WebElement element : columnHeaderElements) {
//			if (element.getText().equalsIgnoreCase(columnHeader)) {
//				return index;
//			}
//			index++;
//		}
//		return 0;
//	}
